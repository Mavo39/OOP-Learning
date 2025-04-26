package fairyWorld;

class PlayfulHamsterAssistant extends PlayfulPetAssistant{
    @Override
    public PlayfulPet createPlayfulPet(){
        return new Hamster(RandomWrapper.getRanDouble(0.1,0.25), RandomWrapper.getRanDouble(0.3,0.5), RandomWrapper.ranBoolean() ? "male" : "female");
    }
}