package wallet;

class Person{
    public String firstName;
    public String lastName;
    public int age;
    public double heightM;
    public double weightKg;
    public Wallet wallet;

    public Person(String firstName){
        this.firstName = firstName;
    }

    // 所持金を取得するメソッド
    public int getCash(){
        // 財布を持っていない場合：メッセージを表示し、0を返す
        if(this.wallet == null){
            System.out.println("No Wallet");
            return 0;
        }
        // 財布を持っている場合：財布内の全額を表示
        return this.wallet.getTotalMoney();
    }
}

// コンストラクタ関数でwalletの初期化をしていないのにthis.walletにアクセスできるのは、クラスのフィールド（メンバ変数）が自動的に初期化されるため
