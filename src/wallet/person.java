package wallet;

class Person{
    private String firstName;
    private String lastName;
    private int age;
    private double heightM;
    private double weightKg;
    private String denomination;
    private Wallet wallet;

    public Person(String firstName, String lastName, int age, double heightM, double weightKg){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.heightM = heightM;
        this.weightKg = weightKg;
    }

    public Person(String firstName, String lastName, int age, double heightM, double weightKg, int initialMoney){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.heightM = heightM;
        this.weightKg = weightKg;
        
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
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

    public int[] getPayed(int money){

    }

    public int[] spendMoney(int money){

    }

    public Wallet dropWallet(){
        this.wallet = null;
        return this.wallet;
    }

    public void addWallet(Wallet wallet){
        this.wallet = wallet;
    }

    public void setDenominationPreference(String denomination){
        
    }


    // Personオブジェクトの状態を出力するメソッド
    // public void printState(){
    //     System.out.println("firstname - " + firstName);
    //     System.out.println("lastname - " + lastName);
    //     System.out.println("age - " + age);
    //     double weightKg = 70; // ローカル変数の優先度が高い
    //     System.out.println("height - " + heightM + ", joking it is " + this.heightM);
    //     System.out.println("weight - " + weightKg);
    //     System.out.println("Current Money - " + getCash());
    //     System.out.println();
    // }
}

