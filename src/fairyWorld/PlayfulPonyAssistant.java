package fairyWorld;

class PlayfulPonyAssistant extends PlayfulPetAssistant {
    @Override
    public PlayfulPet createPlayfulPet(){
        return new Pony(RandomWrapper.getRanDouble(0.5, 1.3), RandomWrapper.getRanDouble(30.0, 55.0), RandomWrapper.ranBoolean() ? "male" : "female");
    }
}