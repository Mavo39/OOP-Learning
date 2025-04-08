package animal;

class Test4 {
    public static void main(String[] args){
        // すべて同じメソッドを使用しているが、引数のクラスのみ異なる
        // いずれのクラスもAnimalクラスを継承したくらすであるため実現できる
        Mammal cow = new Mammal("Cattle", 1.8, 454.5, 730, "female", 1.4, "Cowhide", 32.4);
        animalPolymorphism(cow);

        Animal bullAnimal = new Animal("Cattle", 1.8, 454.5, 730, "male");
        animalPolymorphism(bullAnimal);

        Fox f1 = new Fox(0.7, 14, "female");
        animalPolymorphism(f1);
    }

    // ポリモーフィズムが適用される
    // Animalクラスを継承しているオブジェクトであれば、どんな種類のものでも渡すことができる
    public static void animalPolymorphism(Animal animal){
        // Animalクラスのすべてのメソッドを呼び出すことができる
        System.out.println(animal);
        System.out.println(animal.getHungerPercent());
        animal.eat();
        System.out.println(animal.getHungerPercent());
        // 動物のサブクラスの特定のメソッドを呼び出すことはできない
    }
}