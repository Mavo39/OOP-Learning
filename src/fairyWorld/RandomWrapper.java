package fairyWorld;

import java.util.Random;

class RandomWrapper {
    // 指定された範囲内でランダムなint型の値を生成する
    public static int getRanInt(int min, int max){
        Random r = new Random();
        return min + (max - min) * r.nextInt();
    }

    // 指定された範囲内でランダムなdouble型の値を生成する
    public static double getRanDouble(double min, double max){
        Random r = new Random();
        return min + (max - min) * r.nextDouble();
    }

    public static boolean ranBoolean(){
        // true または false のいずれかがランダムに返される
        return new Random().nextBoolean();
    }
}