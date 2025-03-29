package card;

class Test{
    public static void main(String[] args){
        Deck deck = new Deck();
        // デッキの初期状態を表示
        System.out.println(deck);

        // 新しいカードのデッキを作成し、そのカードの配列を取得
        Card[] cards = Deck.createDeck();

        // カード配列を表示
        System.out.println();
        System.out.println(Deck.cardsToString(cards));
        System.out.println();

        // デッキをシャッフル
        deck.shuffleDeck();
        // シャッフル後のデッキを表示
        System.out.println(deck);
    }
}