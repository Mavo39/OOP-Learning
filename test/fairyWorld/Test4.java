package fairyWorld;

class Test4 {
    public static void main(String[] args){
        FairyWorld fairyWorld = new FairyWorld();
        Person jassy = new Person("Jassy", "Dave", 25, 180, 100, "male");

        fairyWorld.rentPet(new PlayfulHamsterAssistant(), jassy);
    }
}