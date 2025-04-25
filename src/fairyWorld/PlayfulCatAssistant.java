package fairyWorld;

// Factory Methodを実装したクラス: Factory Methodは作成をサブクラスに委ねている

class PlayfulCatAssistant extends PlayfulPetAssistant {
    @Override
    public PlayfulPet createPlayfulPet(){
        // CatクラスにheightM, wightKg, biologicalSexをランダムに生成し渡す
        return new Cat(
            RandomWrapper.getRanDouble(0.15, 0.3), 
            RandomWrapper.getRanDouble(2.0, 4.9), 
            RandomWrapper.ranBoolean() ? "male" : "female"
        );
    }
}