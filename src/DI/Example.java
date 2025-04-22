package DI;

class Example {
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
    public static double calculateBMI(String firstName, String lastName, int age, double heightM, double weightKg, String biologicalSex){
        Person person = new Person(firstName, lastName, age, heightM, weightKg, biologicalSex);
        return person.getWeightKg() / (person.getHeightM() * person.getHeightM());
    }
}