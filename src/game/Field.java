package game;
import java.util.ArrayList;

class Field {
    private static final int MAX_X = 100000;
    private static final int MAX_Y = 40000;
    private static final int MAX_Z = 1000;

    // フィールド上に存在するモンスターのリスト
    private ArrayList<Monster> creatures;
    // モンスターの座標を保持するリスト: creaturesリストの各モンスターに対応する
    // リストのインデックスを使用して、モンスターとその座標を関連づける
    private ArrayList<Coordinate> creaturesCoordinates;
    
    public Field(){
        this.creatures = new ArrayList<Monster>();
        this.creaturesCoordinates = new ArrayList<Coordinate>();
    }
}