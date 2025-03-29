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
                cards[i*r+j] = new Card(Deck.RANKS[j], Deck.SUITS[i]); // インデックスがi,jが逆にならないように注意
            }
        }

        return cards;
    }

    // デッキをシャッフルするメソッド
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