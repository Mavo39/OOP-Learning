package fairyWorld;

class FairyWorld {
    public void rentPet(PlayfulPetAssistant assistant, Person person){
        System.out.println("Thank you for your pet rental!");
        double costs = assistant.runAssistanceTour(person);
        System.out.println(costs + " dollars were charged to " + person.getName() + "'s credit card.");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxx" + System.lineSeparator());
    }

    public void playLaserTag(Person person, LaserTagMonsterFactory factory){
        String newLine = System.lineSeparator();
        System.out.println(person + " will now play laser tag!" + newLine);

        // それぞれのモンスターを作成し、情報を出力
        LowTierMonster lowMon = factory.createLowTierMonster();
        System.out.println("Fighting " + lowMon + "...Defeated." + newLine);

        MidTierMonster midMon  = factory.createMidTierMonster();
        System.out.println("Fighting " + midMon + "...Defeated." + newLine);

        HighTierMonster highMon = factory.createHighTierMonster();
        System.out.println("Fighting " + highMon + "...Defeated." + newLine);

        FlyingMonster flyMon = factory.createFlyingMonster();
        System.out.println("Fighting " + flyMon + "...Defeated." + newLine);

        HybridMonster hybridMon = factory.createHybridMonster();
        System.out.println("Fighting " + hybridMon + "...Defeated." + newLine);

        FinalBossMonster finalMon = factory.createFinalBossMonster();
        System.out.println("Fighting " + finalMon + "...Defeated." + newLine);

        System.out.println("Congratulations! All monsters were defeated!" + newLine);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxx" + newLine);
    }

    public Sandwich orderSandwich(SandwichMenu item, SandwichSize itemSize){
        SandwichBuilder sandwichBuilder = new SandwichBuilder();

        // ディレクターメソッドを使ってサンドイッチを作成
        // 選択したサンドイッチの種類とサイズによって作るサンドイッチが変わる
        switch(item){
            case CHICKEN_AND_BACON:
                FairyWorldSandwichDirector.chickenAndBacon(sandwichBuilder);
                break;
            case STEAK_AND_CHEESE:
                FairyWorldSandwichDirector.steakAndCheese(sandwichBuilder);
                break;
            case SPICY_ITALIAN:
                FairyWorldSandwichDirector.spicyItalian(sandwichBuilder);
                break;
            case TUNA_AND_EGG:
                FairyWorldSandwichDirector.tunaAndEgg(sandwichBuilder);
                break;
        }

        switch(itemSize){
            case FOOTLONG:
                sandwichBuilder.setSize(15.24);
                break;
            case HALF_FOOTLONG:
                sandwichBuilder.setSize(30.48);
                break;
        }

        return sandwichBuilder.build();
    }
}