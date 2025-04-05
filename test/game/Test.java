package game;

class Test {
    public static void main(String[] args){
        Player p1 = new Player("Butrunner", 2000, 200, 60, 1000);
        Monster gorilla = new Monster("Gorilla", 4000, 40, 100);
        Monster vampire = new Monster("Vampire", 6000, 160, 20);

        System.out.println(p1);
        System.out.println(gorilla);
        System.out.println(vampire);

        p1.attack(gorilla);
        // heightの単位が変わったことによりHPは減らなくなる
        System.out.println(gorilla);
    }
}