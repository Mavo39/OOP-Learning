package person;

import java.time.LocalDate;

class Person {
    private String firstName;
    private String lastName;
    private double heightM;
    private double weigthKg;
    private int birthYear;

    // コンストラクタ内でprivate変数の初期化
    public Person(String firstName, String lastName, double heightM, double weigthKg, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.heightM = heightM;
        this.weigthKg = weigthKg;
        this.birthYear = birthYear;
    }

    // 内部のprivate変数の値を取得する
    // privateで宣言されたプロパティ（フィールド）は、同じクラス内のメソッドを通じて変更可能
    @Override
    public String toString(){
        return this.getFullName() + ", heightM: " + this.heightM + ", weightKg: " + this.weigthKg + ", age: " + this.getAge();
    }

    // 名前を変更するためのpublicメソッド
    public void changeName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // クラスの内部からのみ使用できるprivateメソッド。クラスの外部からは呼び出すことができない
    // privateメソッドは、そのクラスの{}の中に書かれたコードだけが使える → ソースコードの物理的な位置関係で判断すればOK
    private String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public int getAge(){
        int currentYear = LocalDate.now().getYear();
        return currentYear - this.birthYear;
    }
}