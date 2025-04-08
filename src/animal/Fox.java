package animal;

// Mammalクラスを継承
class Fox extends Mammal {
    public Fox(double heightM, double weightKg, String biologicalSex){
        super("Fox", heightM, weightKg, 1460, biologicalSex, 35, "Fox", 38.7);
    }

    public void howl(){
        System.out.println("Oooooooooooooooowhoo");
    }

    @Override
    public void eat(){
        // Mammalクラスのeatメソッドを呼び出し
        super.eat();
        System.out.println("This fox is a carnivore");
    }
}