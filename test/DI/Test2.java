package DI;

class Test2 {
    public static void main(String[] args){
        // Personオブジェクトを作成し、calculateBMIメソッドに渡す
        // これにより、依存関係が外部から明確にされ、メソッドの再利用性が高まる
        // オブジェクトの作成はメソッドの呼び出し側で行なう
        System.out.println(Example.calculateBMI(new Person("Thomas", "David", 23, 1.8, 65, "male")));
    }
}