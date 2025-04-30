package fairyWorld;

class Test7 {
    public static void main(String[] args){
        // ビルダーを通してサンドイッチを作成する
        SandwichBuilder sandwichBuilder = new SandwichBuilder();

        // chicken bacon ranchサンドイッチを作ってみる
        sandwichBuilder.addDoughType("Italian");
        sandwichBuilder.addTopping1("Chicken");
        sandwichBuilder.addTopping2("Bacon");
        sandwichBuilder.addSauce("Ranch");
        sandwichBuilder.addVegetable1("Lettuce");
        sandwichBuilder.addVegetable2("Red Onions");
        sandwichBuilder.addVegetable3("Tomato");
        sandwichBuilder.addCheese();

        // オブジェクトのビルド
        Sandwich chickenAndBacon = sandwichBuilder.build();

        System.out.println(chickenAndBacon);
    }
}