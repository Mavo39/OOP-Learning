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

    // bill に応じて対応するメンバ変数を増やし、挿入した総額を返すメソッド
    // 引数（bill: 札の額面 / amount: 枚数）
    public int insertBill(int bill, int amount){
        switch(bill){
            case(1):
                bill1 += amount;
                break;
            case(5):
                bill5 += amount;
                break;
                case(10):
                bill10 += amount;
                break;
            case(20):
                bill20 += amount;
                break;
            case(50):
                bill50 += amount;
                break;
            case(100):
                bill100 += amount;
                break;
            default:
                return 0;
        }
        return bill * amount;
    }
}