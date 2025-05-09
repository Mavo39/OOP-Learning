package wallet;

class Wallet{
    // 仕様に基づきprivate化
    private int bill1;
    private int bill5;
    private int bill10;
    private int bill20;
    private int bill50;
    private int bill100;

    // 引数なしでコンストラクタを実行
    public Wallet(){}

    public Wallet(int bill1, int bill5, int bill10, int bill20, int bill50, int bill100){
        this.bill1 = bill1;
        this.bill5 = bill5;
        this.bill10 = bill10;
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
    }

    public int getTotalMoney(){
        return (1 * this.bill1) + (5 * this.bill5) + (10 * this.bill10) + (20 * bill20) + (50 * bill50) + (100 * bill100);
    }

    // bill に応じて対応するメンバ変数を増やし、挿入した総額を返すメソッド
    // 引数（bill: 札の額面 / amount: 枚数）
    public int insertBill(int bill, int amount){
        switch(bill){
            case(1):
                this.bill1 += amount;
                break;
            case(5):
                this.bill5 += amount;
                break;
            case(10):
                this.bill10 += amount;
                break;
            case(20):
                this.bill20 += amount;
                break;
            case(50):
                this.bill50 += amount;
                break;
            case(100):
                this.bill100 += amount;
                break;
            default:
                return 0;
        }
        return bill * amount;
    }

    public int removeBill(int bill, int amount){
        switch(bill){
            case(1):
                if(this.bill1 < amount) break; 
                this.bill1 -= amount;
                break;
            case(5):
                if(bill5 < amount) break;
                this.bill5 -= amount;
                break;
            case(10):
                if(bill10 < amount) break;
                this.bill10 -= amount;
                break;
            case(20):
                if(bill20 < amount) break;
                this.bill20 -= amount;
                break;
            case(50):
                if(bill50 < amount) break;
                this.bill50 -= amount;
                break;
            case(100):
                if(bill100 < amount) break;
                this.bill100 -= amount;
                break;
            default:
                return 0;
        }
        return bill * amount;
    }

    // 財布の中身をお札ごとに確認するメソッドを追加で作成
    public int[] getBillCounts() {
        return new int[]{bill1, bill5, bill10, bill20, bill50, bill100};
    }
}