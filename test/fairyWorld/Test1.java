package fairyWorld;

class Test1 {
    public static void main(String[] args){
        FairyWorld fairyWorld = new FairyWorld();
        Person mavo = new Person("Mavo", "David", 30, 1.75, 65, "male");

        fairyWorld.rentPet(new PlayfulCatAssistant(), mavo);
        fairyWorld.rentPet(new PlayfulDogAssistant(), mavo);
        fairyWorld.rentPet(new PlayfulRabbitAssistant(), mavo);
    }
}