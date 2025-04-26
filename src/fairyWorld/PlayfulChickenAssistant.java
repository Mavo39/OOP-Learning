package fairyWorld;

class PlayfulChickenAssistant extends PlayfulPetAssistant {
    @Override
    public PlayfulPet createPlayfulPet(){
        return new Chicken(RandomWrapper.getRanDouble(0.25, 0.40), RandomWrapper.getRanDouble(5, 10), RandomWrapper.ranBoolean() ? "male" : "female");
    }
}