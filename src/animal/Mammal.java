package animal;

class Mammal extends Animal {
    private double furLengthCm;
    private String furType;
    private int toothCounter;
    private double bodyTemperatureC;
    private double avgBodyTemperatureC;
    private boolean mammaryGland = false;
    private boolean sweatGland = true;
    private boolean isPregnant = false;

    public Mammal(String species, double heightM, double weightKg, double lifeSpanDays, String biologicalSex, double furLengthCm, String furType, double avgBodyTemperatureC){
        // スーパークラスのコンストラクタを呼び出して、Animalから継承したメンバーの初期状態を設定する
        super(species, heightM, weightKg, lifeSpanDays, biologicalSex);
        // 他のメンバ変数の設定を行なう
        this.furLengthCm = furLengthCm;
        this.furType = furType;
        this.mammaryGland = (biologicalSex.equals("female"));
        this.avgBodyTemperatureC =avgBodyTemperatureC;
        // 初期体温を平均体温に設定する
        this.bodyTemperatureC = this.avgBodyTemperatureC;
    }

    // MammalクラスにはAnimalクラスから継承したメソッドが全て含まれている
    // それに加えて、Mammalクラス特有のメソッドも定義できる
    public void sweat(){
        if(!this.isAlive()) return;
        if(this.sweatGland) System.out.print("Sweating....");
        // 体温の低下
        this.bodyTemperatureC -= 0.3;
        System.out.print("Body temperature is now " + this.bodyTemperatureC + "C");
        System.out.println();
    }

    public void produceMilk(){
        if(!this.isAlive()) return;
        if(this.isPregnant() && this.mammaryGland) System.out.println("Producing milk...");
        else System.out.println("Cannot produce milk");
        System.out.println();
    }

    // この動物が雌でパートナーが雄の場合、この動物は受精するメソッド
    // このプロセスにおいて親クラスの状態にアクセスすることに注意が必要
    public void mate(Mammal mammal){
        if(!this.isAlive()) return;
        if(this.species.equals(mammal.species)) return;
        if(this.biologicalSex.equals("female") && mammal.biologicalSex.equals("male")) this.fertalize();
        else if(this.biologicalSex.equals("male") && mammal.biologicalSex.equals("female")) mammal.fertalize();
    }

    // 妊娠するメソッド
    public void fertalize(){
        if(!this.isAlive()) return;
        this.isPregnant = true;
    }

    // 妊婦かどうかを判定するメソッド
    public boolean isPregnant(){
        if(!this.isAlive()) return false;
        return this.isPregnant;
    }

    // 噛む動作を表現するメソッド
    public void bite(){
        if(!this.isAlive()) return;
        System.out.println(this.species + " bites with their single lower jaws which has" +  (this.toothCounter == 0 ? " not" : "")  + " replaced its teeth: " + (this.toothCounter > 0));
        System.out.println();
    }

    // 一生に一度歯が生まれ変わるメソッド
    public void replaceTeeth(){
        if(!this.isAlive()) return;
        if(this.toothCounter == 0) this.toothCounter++;
    }

    // 体温が上昇するメソッド
    public void increaseBodyHeat(double celcius){
        this.bodyTemperatureC += celcius;
    }

    // 体温が低下するメソッド
    public void decreaseBodyHeat(double celcius){
        this.bodyTemperatureC -= celcius;
    }

    // 適切な体温に設定するメソッド
    public void adjustBodyHeat(){
        this.bodyTemperatureC = this.avgBodyTemperatureC;
    }
}