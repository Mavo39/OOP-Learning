package card;

class Test{
    public static void main(String[] args){
        // 0. 初期デッキ作成
        Card[] baseDeck = Deck.createDeck();
        System.out.println("初期デッキ");
        System.out.println(Deck.cardsToString(baseDeck));

        // 1. インスタンスメソッドのテスト
        Deck deck = new Deck(); // deck.cards は初期デック
        deck.shuffleDeck();
        System.out.println("\nインスタンスメソッドシャッフル後");
        System.out.println(Deck.cardsToString(deck.cards));

        // 2. 静的メソッド（in-place）のテスト
        Card[] inPlaceDeck = Deck.createDeck();
        Deck.shuffleDeckInPlace(inPlaceDeck);
        System.out.println("\nIn-placeシャッフル後");
        System.out.println(Deck.cardsToString(inPlaceDeck));

        // 3. 静的メソッド（out-of-place）のテスト
        Card[] outOfPlaceDeck = Deck.createDeck();
        Card[] result = Deck.shuffleDeckOutOfPlace(outOfPlaceDeck);
        System.out.println("\nOut-of-place結果");
        System.out.println(Deck.cardsToString(result));
    }
}