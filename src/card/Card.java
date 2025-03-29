// カードゲームの一部を実装しながら、クラスメソッドについて理解していく
package card;

class Card{
    public String rank;
    public String suit;

    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString(){
        return this.rank + this.suit;
    }
}