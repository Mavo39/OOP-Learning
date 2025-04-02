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
        this.denomination = "highestFirst";
        this.wallet = new Wallet();
        // お金を財布に入れる
        if(initialMoney > 0) this.getPayed(initialMoney);
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    // 所持金を取得するメソッド
    public int getCash(){
        // 財布を持っていない場合：メッセージを表示し、0を返す
        if(this.wallet == null){
            System.out.println("No Wallet");
            return 0;
        }
        // 財布を持っている場合：財布内の全額を表示
        return wallet.getTotalMoney();
    }

    public int[] getPayed(int money){
        if(wallet == null || money <= 0) return new int[6];

        int bills[] = calculateBills(money);
        wallet.insertBill(1, bills[0]);
        wallet.insertBill(5, bills[1]);
        wallet.insertBill(10, bills[2]);
        wallet.insertBill(20, bills[3]);
        wallet.insertBill(50, bills[4]);
        wallet.insertBill(100, bills[5]);

        return bills;
    }

    public int[] spendMoney(int money){
        if(wallet == null || money <= 0 || money > getCash()){
            return new int[6];
        }

        int[] bills = calculateBills(money);
        int removed = 0;

        for(int i = 0; i < bills.length; i++){
            int billValue = getBillValue(i);
            removed += wallet.removeBill(billValue, bills[i]);
        }

        if(removed == money) return bills;
        else return new int[6];
    }

    public Wallet dropWallet(){
        Wallet dropedWallet = this.wallet;
        this.wallet = null;
        return dropedWallet;
    }

    public void addWallet(Wallet wallet){
        this.wallet = wallet;
    }

    public void setDenominationPreference(String denomination){
        // ※`==`を使わないこと（参照の比較になってしまう）
        if(denomination.equals("highestFirst") || denomination.equals("dollars") || denomination.equals("twenties")){
            this.denomination = denomination;
        }
    }

    public int[] calculateBills(int amount){
        int[] bills = new int[6];
        int remaining = amount;

        switch(denomination){ // 引数はthis.denominationのこと
            case("highestFirst"):
                // 配列に格納する枚数を求める
                bills[5] = remaining / 100;
                // remaining（残り）を更新する
                remaining %= 100;

                bills[4] = remaining / 50;
                remaining %= 50;

                bills[3] = remaining / 20;
                remaining %= 20;

                bills[2] = remaining / 10;
                remaining %= 10;

                bills[1] = remaining / 5;
                remaining %= 5;

                bills[0] = remaining;
                break;

            case("twenties"):
                // Javaは配列を固定サイズで初期化した場合、自動的に0で初期化されるため、以下のような設定は不要
                // bills[5] = bills[4] = 0;

                bills[3] = remaining / 20;
                remaining %= 20;
                
                bills[2] = remaining / 10;
                remaining %= 10;

                bills[1] = remaining / 5;
                remaining %= 5;

                bills[0] = remaining;
                break;

            case("dollars"):
                bills[0] = remaining;
                break;
        }

        return bills;
    }

    private int getBillValue(int index){
        switch(index){
            case 0:
                return 1;
            case 1:
                return 5;
            case 2:
                return 10;
            case 3:
                return 20;
            case 4:
                return 50;
            case 5:
                return 100;
            default:
                return 0;
        }
    }

    // Personオブジェクトの状態を出力するメソッド
    public void printState(){
        System.out.println("firstname - " + firstName);
        System.out.println("lastname - " + lastName);
        System.out.println("age - " + age);
        System.out.println("height - " + heightM + ", joking it is " + heightM);
        System.out.println("weight - " + weightKg);
        System.out.println("Current Money - " + getCash());
        System.out.println();
    }
}

