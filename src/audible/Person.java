package audible;

class Person implements Audible {
    private String firstName;
    private String lastName;
    private double heightM;
    private double weightKg;
    private int age;

    public Person(String firstName, String lastName, double heightM, double weightKg, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.heightM = heightM;
        this.weightKg = weightKg;
        this.age = age;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    @Override
    public String toString(){
        return this.getFullName() + " who is " + this.heightM + "m tall and weights " + this.weightKg + "kg.";
    }

    // 人が音を立てるときの動作を定義
    @Override
    public void makeNoise(){
        System.out.println("Hellooooo!");
    }

    // 人が出す音の周波数を16歳以上とそれ以下で定義
    @Override
    public double soundFrequency(){
        return this.age >= 16 ? 110 : 130;
    }

    // 人が出す音のレベルを16歳以上とそれ以下で定義
    @Override
    public double soundLevel(){
        return this.age >= 16 ? 60 : 65;
    }
}