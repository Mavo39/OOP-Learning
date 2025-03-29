// カードゲームの一部を実装しながら、クラスメソッドについて理解していく
package card;

class Card{
    public String rank;
    public String suit;

    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString(){
        return this.suit + this.rank;
    }
}