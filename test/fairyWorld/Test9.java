package fairyWorld;

class Test9 {
    public static void main(String[] args){
        FairyWorld fairyWorld = new FairyWorld();

        String newLine = System.lineSeparator();
        System.out.println(fairyWorld.orderSandwich(SandwichMenu.CHICKEN_AND_BACON, SandwichSize.FOOTLONG) + newLine);
        System.out.println(fairyWorld.orderSandwich(SandwichMenu.STEAK_AND_CHEESE, SandwichSize.FOOTLONG) + newLine);
        System.out.println(fairyWorld.orderSandwich(SandwichMenu.SPICY_ITALIAN, SandwichSize.HALF_FOOTLONG) + newLine);
        System.out.println(fairyWorld.orderSandwich(SandwichMenu.TUNA_AND_EGG, SandwichSize.FOOTLONG) + newLine);
    }
}