package fairyWorld;

// ディレクタークラス: サンドイッチのレシピを持っているイメージ
// サンドイッチの特定のタイプを構築するためのメソッドを持つ
class FairyWorldSandwichDirector {
    public static SandwichBuilder chickenAndBacon(SandwichBuilder builder){
        builder.addDoughType("Italian").addTopping1("Chicken")
                    .addTopping2("Bacon").addSauce("Ranch")
                    .addVegetable1("Lettuce").addVegetable2("Red Onions")
                    .addVegetable3("Tomato").addCheese();
        return builder;
    }

    public static SandwichBuilder steakAndCheese(SandwichBuilder builder){
        builder.addDoughType("Wheat").addTopping1("Steak")
                    .addTopping2("Steak")
                    .addVegetable1("Green Peppers").addVegetable2("Red Onions")
                    .addCheese();
        return builder;
    }

    public static SandwichBuilder spicyItalian(SandwichBuilder builder){
        builder.addDoughType("Wheat").addTopping1("Pepperoni")
                    .addTopping2("Salami")
                    .addVegetable1("Lettuce").addVegetable2("Red Onions").addVegetable3("Tomato").addVegetable4("Cucumbers").addVegetable5("Jalapeno")
                    .addMayo();
        return builder;
    }

    public static SandwichBuilder tunaAndEgg(SandwichBuilder builder){
        builder.addDoughType("Italian Herbs").addTopping1("Tuna")
                    .addTopping2("Eggs")
                    .addVegetable1("Lettuce").addVegetable2("Red Onions")
                    .addMayo();
        return builder;
    }
}