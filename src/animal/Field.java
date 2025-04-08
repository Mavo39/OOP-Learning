package animal;

import java.util.ArrayList;
// 多種多様な生物とそれらの位置を管理
// creaturesリストはポリモーフィズムを活用して、Animalクラス及びその派生クラスのオブジェクトを格納する
class Field{
    // フィールドの最大座標値を設定
    private static final int MAX_X = 100000;
    private static final int MAX_Y = 40000;
    private static final int MAX_Z = 1000;

    // 生物とそれらの座標を格納するリストを作成
    private ArrayList<Animal> creatures;
    private ArrayList<Coordinate> creatureCoordinates;

    // コンストラクタでリストを初期化
    public Field(){
        this.creatures = new ArrayList<Animal>();
        this.creatureCoordinates = new ArrayList<Coordinate>();
    }

    // 生物をフィールドにランダムな座標で追加
    public void randomlyAddWithDependency(Animal creature){
        // 座標はランダムに生成される
        Coordinate c = new Coordinate(this.internalRanAlgorithm(1, Field.MAX_X), this.internalRanAlgorithm(1, Field.MAX_Y),this.internalRanAlgorithm(1, Field.MAX_Z));
        // 生物とその座標をリストに追加
        this.creatures.add(creature);
        this.creatureCoordinates.add(c);
    }

    // 指定された範囲内でランダムな数値を生成するメソッド
    private int internalRanAlgorithm(int min, int max){
        return (int)(Math.random() * (max - min) + min);
    }

    @Override
    public String toString(){
        StringBuffer s = new StringBuffer("");
        for(int i = 0; i < this.creatures.size(); i++){
            s.append(this.creatures.get(i) + " with coordinates: " + this.creatureCoordinates.get(i) + "");
        }
        // 文字列に変換して返す
        return s.toString();
    }
}
