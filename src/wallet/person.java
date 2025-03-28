package wallet;

class Person{
    public String firstName;
    public String lastName;
    public int age;
    public double heightM;
    public double weightKg;
    public Wallet wallet;

    public Person(String firstName, String lastName, int x, double y, double z){
        this.firstName = firstName;
        this.lastName = lastName;
        // "this"はメソッド内で必ずしも使用される必要はないようです
        age = x; // ageの状態がxにアップグレード
        heightM = y;
        weightKg = z;
        // Personオブジェクトを作成すると、Walletオブジェクトを持つことになる
        wallet = new Wallet(); // デフォルトの財布を設定
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

    // Personオブジェクトの状態を出力するメソッド
    public void printState(){
        System.out.println("firstname - " + firstName);
        System.out.println("lastname - " + lastName);
        System.out.println("age - " + age);
        double weightKg = 70; // ローカル変数の優先度が高い
        System.out.println("height - " + heightM + ", joking it is " + this.heightM);
        System.out.println("weight - " + weightKg);
        System.out.println("Current Money - " + getCash());
        System.out.println();
    }
}

// コンストラクタ関数でwalletの初期化をしていないのにthis.walletにアクセスできるのは、クラスのフィールド（メンバ変数）が自動的に初期化されるため
