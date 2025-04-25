package fairyWorld;

class Test {
    public static void main(String[] args){
        FairyWorld fairyWorld = new FairyWorld();
        Person mavo = new Person("Mavo", "David", 30, 1.75, 65, "male");

        fairyWorld.rentPet(new PlayfulCatAssistant(), mavo);
    }
}