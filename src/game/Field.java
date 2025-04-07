package game;
import java.util.ArrayList;

class Field {
    private static final int MAX_X = 100000;
    private static final int MAX_Y = 40000;
    private static final int MAX_Z = 1000;

    // フィールド上に存在するモンスターのリスト
    // private ArrayList<Monster> creatures;
    // 格納するデータ型をPlayer型に変更
    private ArrayList<Player> creatures;

    // モンスターの座標を保持するリスト: creaturesリストの各モンスターに対応する
    // リストのインデックスを使用して、モンスターとその座標を関連づける
    private ArrayList<Coordinate> creatureCoordinates;
    
    public Field(){
        // this.creatures = new ArrayList<Monster>();
        this.creatures = new ArrayList<Player>();
        this.creatureCoordinates = new ArrayList<Coordinate>();
    }

    // フィールドにランダムな位置にモンスターを追加
    // このメソッドではモンスターのパラメータを受け取り、その内部で新しいモンスターオブジェクトを作成する
    // この場合、他のクラスからはこのメソッドがどのようにモンスターオブジェクトを生成しているのかわからない
    // このメソッドがMonsterクラスにどのように依存しているのかもわからない
    // Monster オブジェクトの生成はメソッド内部で行われるため、呼び出し側はその生成の詳細やタイミングを知る必要がない
    // public void randomlyAdd(String monster, int health, int attack, int defense){
    //     Monster newMonster = new Monster(monster, health, attack, defense);
    //     // ランダムな座標
    //     Coordinate c = new Coordinate(this.internalRanAlgorithm(1, Field.MAX_X), this.internalRanAlgorithm(1, Field.MAX_Y), this.internalRanAlgorithm(1, Field.MAX_Z));

    //     this.creatures.add(newMonster);
    //     this.creatureCoordinates.add(c);
    // }

    // フィールドにランダムな位置にモンスターを追加
    // このメソッドではモンスターオブジェクト自体を直接受けとる
    // これによりこのメソッドがMonsterクラスに依存していることが明示的になる
    // この依存性はこのメソッドを呼び出すクラスやメソッドのような外部にも明らかになる
    // 呼び出し側は Monster オブジェクトをいつ、どのように生成するのか、そしてそのオブジェクトのライフサイクルをどのように管理するのかを意識する必要がある
    // public void randomlyAddWithDependency(Monster creature){
    //     Coordinate c = new Coordinate(this.internalRanAlgorithm(1, Field.MAX_X), this.internalRanAlgorithm(1, Field.MAX_Y),this.internalRanAlgorithm(1, Field.MAX_Z));

    //     this.creatures.add(creature);
    //     this.creatureCoordinates.add(c);
    // }


    public void randomlyAddWithDependency(Player creature){
        Coordinate c = new Coordinate(this.internalRanAlgorithm(1, Field.MAX_X), this.internalRanAlgorithm(1, Field.MAX_Y),this.internalRanAlgorithm(1, Field.MAX_Z));

        this.creatures.add(creature);
        this.creatureCoordinates.add(c);
    }

    public int internalRanAlgorithm(int min, int max){
        return (int)(Math.random() * (max - min) + min);
    }

    @Override
    public String toString(){
        StringBuffer s = new StringBuffer("");
        for(int i = 0; i < this.creatures.size(); i++){
            s.append(this.creatures.get(i) + " with coordinates " + this.creatureCoordinates.get(i) + "\n");
        }
        // 最終的にできたStringBufferオブジェクトをStringオブジェクトに変換して返す
        return s.toString();
    }
}