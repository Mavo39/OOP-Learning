package fairyWorld;

class Test3 {
    public static void main(String[] args){
        FairyWorld fairyWorld = new FairyWorld();
        Person mavo = new Person("Mavo", "David", 30, 175, 65, "male");

        fairyWorld.rentPet(new PlayfulChickenAssistant(), mavo);
    }
}