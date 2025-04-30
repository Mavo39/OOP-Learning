package fairyWorld;

class Test8 {
    public static void main(String[] args){
        SandwichBuilder sandwichBuilder = new SandwichBuilder();

        // メソッドチェーンを使ってchicken bacon ranchサンドイッチを作る
        sandwichBuilder.addDoughType("Italian").addTopping1("Chicken")
            .addTopping2("Bacon").addSauce("Ranch")
            .addVegetable1("Lettuce").addVegetable2("Red Onions")
            .addVegetable3("Tomato").addCheese();

        Sandwich chickenAndBacon = sandwichBuilder.build();
        System.out.println(chickenAndBacon);
    }
}