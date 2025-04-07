package animal;

class Test2 {
    public static void main(String[] args){
        Mammal cow = new Mammal("Cattle", 1.8, 454.5, 730, "female", 1.4, "Cowhide", 32.4);
        System.out.println(cow);
        System.out.println();

        Mammal bull = new Mammal("Cattle", 1.8, 454.5, 730, "male", 1.1, "Cowhide", 30.8);
        System.out.println(bull);
        System.out.println();

        cow.eat();
        cow.sleep();
        System.out.println(cow.status());

        // 状態を変更し、最後にdieメソッドを呼び出して、cowを"死亡"状態にする
        cow.setAsHungry();
        cow.setAsSleepy();
        cow.die();
        System.out.println(cow.status());
        System.out.println();

        Mammal tigerF = new Mammal("Tiger", 0.9, 140, 4745, "female", 1.1, "Tiger Hair", 38.5);
        System.out.println(tigerF);
        System.out.println();

        Mammal tigerM = new Mammal("Tiger", 1.1, 280, 4045, "male", 1.2, "Tiger Hair", 38.5);
        System.out.println(tigerM);
        System.out.println();

        tigerM.bite();
        tigerM.replaceTeeth();
        tigerM.bite();

        tigerF.produceMilk();
        tigerF.mate(tigerM);
        tigerF.produceMilk();
    }
}