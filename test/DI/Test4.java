package DI;

class Test4 {
    public static void main(String[] args){
        // PersonオブジェクトとAnimalオブジェクトをcalculateBMIの引数として渡すことができるようになった
        System.out.println(Example.calculateBMI(new Person("Thomas", "David", 23, 1.8, 65, "male")));
        System.out.println(Example.calculateBMI(new Animal("Cat", 0.23, 5.2, 4500, "female")));
    }
}