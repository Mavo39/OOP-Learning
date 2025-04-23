package fairyWorld;

import java.util.Random;

class RandomWrapper {
    public static double getRunDouble(double min, double max){
        Random r = new Random();
        return min + (max - min) * r.nextDouble();
    }

    public static boolean ranBoolean(){
        return new Random().nextBoolean();
    }
}