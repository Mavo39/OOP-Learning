package animal;

class Test5 {
    public static void main(String[] args){
        Mammal cow = new Mammal("Cattle", 1.8, 454.5, 730, "female", 1.4, "Cowhide", 32.4);
        Animal bullAnimal = new Animal("Cattle", 1.8, 454.5, 730, "male");
        Fox f1 = new Fox(0.7, 14, "female");

        animalPolymorphism(cow);
        animalPolymorphism(bullAnimal);
        animalPolymorphism(f1);

        Field world = new Field();

        world.randomlyAddWithDependency(cow);
        world.randomlyAddWithDependency(bullAnimal);
        world.randomlyAddWithDependency(f1);

        System.out.println(world);

        // キツネのデータ型をAnimalに設定
        // これによりAnimalの一般的なメソッドしか呼び出すことができない
        Animal fox2 = new Fox(0.7, 14, "female");
        System.out.println(fox2);

        // fox2はAnimal型なのでhowlは呼び出すことができない
        // fox2.howl();

        if(fox2 instanceof Fox)((Fox)fox2).howl();
    }

    public static void animalPolymorphism(Animal animal){
        System.out.println(animal);
        animal.eat();

        // animalがFox型のインスタンスであれば、Fox型にキャストしてhowlメソッドを呼び出す
        if(animal instanceof Fox) ((Fox)animal).howl();
        System.out.println();
    }
}