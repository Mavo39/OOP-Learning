package audible;

interface Audible {
    // インターフェース内には実装クラスでオーバーライドされるべき抽象メソッドが含まれる
    // オブジェクトが生成する音を示すメソッド
    public abstract void makeNoise();
    // オブジェクトが生成する音の平均周波数を返すメソッド
    public abstract double soundFrequency();
    // オブジェクトが生成する音のレベル(デシベル)を返すメソッド
    public abstract double soundLevel();
}