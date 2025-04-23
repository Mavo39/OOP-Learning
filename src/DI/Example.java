package DI;

public class Example {
    // ハードコードされたデータを持つオブジェクトを作成
    // オブジェクトをメソッド内部で直接作成することによって、依存関係が隠蔽される
    // -> 再利用性やテストの容易さが損なわれる
    public static double calculateBMI(){
        Person jack = new Person("Jack", "Nicole", 25, 1.85, 80, "male");
        return jack.getWeightKg() / (jack.getHeightM() * jack.getHeightM());
    }
    // ↑このコードは理想的ではない例
    // ※Personオブジェクトを外部から受け取るべき

    // 引数を受け取ってPersonオブジェクトを作成するメソッド
    // 関数内部でオブジェクトを作成すると、このメソッドがPersonクラスに依存していることが外部からわかりにくい
    // Personクラスの構造が変わった場合、このメソッドにも変更が生じる
    public static double calculateBMI(String firstName, String lastName, int age, double heightM, double weightKg, String biologicalSex){
        Person person = new Person(firstName, lastName, age, heightM, weightKg, biologicalSex);
        return person.getWeightKg() / (person.getHeightM() * person.getHeightM());
    }

    // Personオブジェクトを引数として受け取る
    // これにより外部からのメソッドがPersonクラスに依存していることが明らかになり、テストやリファクタリングが容易になる
    public static double calculateBMI(Person obj){
        return obj.getWeightKg() / (obj.getHeightM() * obj.getHeightM());
    }

    // Animalオブジェクトを引数として受け取る
    // 依存関係を柔軟に変更できるため、異なる型のオブジェクトに対応できる
    public static double calculateBMI(Animal obj){
        return obj.getWeightKg() / (obj.getHeightM() * obj.getHeightM());
    }

    // 依存関係をBMIObjectに変更(より抽象化)
    // BMIObjectインターフェースを実装した任意のオブジェクトを受け取る
    public static double calculateBMI(BMIObject obj){
        return obj.getWeightKg() / (obj.getHeightM() * obj.getHeightM());
    }
}