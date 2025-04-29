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
}