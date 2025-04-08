package animal;

class Test3 {
    public static void main(String[] args){
        Mammal cow = new Mammal("Cattle", 1.8, 454.5, 730, "female", 1.4, "Cowhide", 32.4);
        System.out.println(cow);
        System.out.println();

        Mammal bull = new Mammal("Cattle", 1.8, 454.5, 730, "male", 1.1, "Cowhide", 30.8);
        System.out.println(bull);
        System.out.println();

        // Mammalクラスの親クラス
        Animal bullAnimal = new Animal("Cattle", 1.8, 454.5, 730, "male");
        System.out.println(bullAnimal);
        System.out.println();

        bull.move(); // "This mammal is moving..."
        // Animalクラスのmoveメソッドであるため、bullのmoveメソッドとは異なる
        bullAnimal.move(); // "This animal just moved"

        // 上記同様、同じ名前のメソッドでもオーバーライドされて動作が異なる
        bull.eat();
        bullAnimal.eat();
    }
}