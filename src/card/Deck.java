package card;

class Deck{
    // カードの記号を表す定数
    public static final String[] SUITS = {"♠","♡","♢","♣"};
    // カードの数字(ランク)を表す定数
    public static final String[] RANKS = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"}; 
    // このデッキ内のカードのリスト(Cardクラスのオブジェクト、各カードを表す)
    public Card[] cards;

    public Deck(){
        // インスタンス生成時にクラスメソッドにアクセス
        this.cards = Deck.createDeck();
    }

    // デッキを作成するクラスメソッド
    // 各記号とランクの組み合わせ52枚をcards配列に格納する
    // Card[]: Cardクラスのオブジェクトを格納する配列
    public static Card[] createDeck(){
        int s = Deck.SUITS.length;
        int r = Deck.RANKS.length;
        // 全カード（記号 * ランク数）を格納する配列を初期化
        Card[] cards = new Card[s * r];

        // 各記号とランクの組み合わせでカードを作成
        for(int i = 0; i < s; i++){
            for(int j = 0; j < r; j++){
                // 初期化したカード配列に新しいカードを格納していく
                cards[i*r+j] = new Card(Deck.SUITS[i], Deck.RANKS[j]);
            }
        }

        return cards;
    }

    // 1. インスタンスメソッド
    // デッキをシャッフルするメソッド(インスタンスメソッド）
    // このメソッドはデッキ内のカードをシャッフルするためオブジェクトの状態に依存する
    public void shuffleDeck(){
        int deckSize = this.cards.length;
        // デッキの最後から始めて、ランダムに選んだカードとスワップ
        // フィッシャーイェーツアルゴリズム
        // 未シャッフル部分を確実に減らすため、偏りをなくすことができる。前方から処理する場合、すでにシャッフルした部分を含めて再度シャッフルする可能性がある。
        for(int i = deckSize - 1; i >= 0; i--){
            int j = (int)Math.floor(Math.random() * (i+1));
            // スワップするカードを保存(カードリストの最後のカードから格納)
            Card temp = this.cards[i];
            // スワップ
            this.cards[i] = this.cards[j];
            this.cards[j] = temp;
        }
    }

    // 2. 静的メソッド
    // 引数としてカードの配列を受け取り、それをその場でシャッフルするメソッド（静的メソッド）
    // Deckクラスが名前空間として機能し、再利用可能な関数になる
    // この方法は引数として与えられた配列自体が変更され、副作用が発生する
    public static void shuffleDeckInPlace(Card[] cards){
        for(int i = cards.length-1; i >= 0; i--){
            int j = (int)Math.floor(Math.random() * (i+1));
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    // 3. 2のメソッドの副作用を発生させない静的メソッド
    // 引数で与えられた配列のコピーを作る
    // ただし、この方法は追加でメモリを消費する
    public static Card[] shuffleDeckOutOfPlace(Card[] cards){
        // ディープコピーを手動で作成
        Card[] cardsCopy = new Card[cards.length];
        for(int i = 0; i < cards.length; i++){
            cardsCopy[i] = cards[i];
        }

        // ディープコピーに対して実行
        for(int i = cardsCopy.length-1; i >= 0; i--){
            int j = (int)Math.floor(Math.random() * (i+1));
            Card temp = cardsCopy[i];
            cardsCopy[i] = cardsCopy[j];
            cardsCopy[j] = temp;
        }

        // 新しい配列を返す
        return cardsCopy;
    }


    // デッキを文字列で表現するメソッド
    @Override
    public String toString(){
        return Deck.cardsToString(this.cards);
    }

    // カードの配列を文字列に変換する静的メソッド
    public static String cardsToString(Card[] inputCards){
        String s = "";
        // 各カードを文字列に変換し、結果の文字列に追加する
        for(int i = 0; i < inputCards.length; i++){
            s += inputCards[i].toString();
            // カード5枚ごとに空白を追加
            if(i % 5 == 4) s += " ";
        }

        return s;
    }
}