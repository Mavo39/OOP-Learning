package DI;

class Test3 {
    public static void main(String[] args){
        // Animalオブジェクトを作成し、calculateBMIメソッドに渡す
        // 依存性の注入を利用することで、メソッドの柔軟性と再利用性が向上する
        System.out.println(Example.calculateBMI(new Animal("Cat", 0.23, 5.2, 4500, "female")));
    }
}