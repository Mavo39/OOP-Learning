// ゴール：ステートレスオブジェクトを理解する
// 手段：MathThingsクラスを実装する

package maththings;

// 全てのメソッドが静的：ステートレスオブジェクト
// 具体的なインスタンスを作成しなくても、メソッドにアクセスできる
class MathThings{
    // static: MathThingsクラスのどこからでもアクセスできる
    public static final double PIAPPROX = 3.14159265;

    // 円の面積を求める静的メソッド
    public static double circleSurfaceArea(int x){
        return PIAPPROX * x * x;
    }

    // 箱の体積を求める静的メソッド
    public static double boxVolume(double x){
        return x * x * x;
    }
}
