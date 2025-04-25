package fairyWorld;

class PlayfulRabbitAssistant extends PlayfulPetAssistant{
    @Override
    public PlayfulPet createPlayfulPet(){
        return new Rabbit(RandomWrapper.getRanDouble(0.15,0.4), RandomWrapper.getRanDouble(2.2,10.2), RandomWrapper.ranBoolean() ? "male" : "female");
    }
}