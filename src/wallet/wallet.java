package wallet;

class Wallet{
    public int bill1;
    public int bill5;
    public int bill10;
    public int bill20;
    public int bill50;
    public int bill100;

    // 引数なしでコンストラクタを実行
    public Wallet(){}

    public int getTotalMoney(){
        return (1 * this.bill1) + (5 * this.bill5) + (10 * this.bill10) + (20 * bill20) + (50 * bill50) + (100 * bill100);
    }
}