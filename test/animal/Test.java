package animal;

class Test {
    public static void main(String[] args){
        Animal cow = new Animal("Cow", 1.8, 454.5, 730, "female");
        System.out.println(cow);

        cow.eat();
        cow.sleep();
        System.out.println(cow.status());

        cow.setAsHungry();
        cow.setAsSleepy();
        cow.die();

        System.out.println(cow.status());
    }
}