package animal;

// Coordinateクラスは、3次元空間の座標を表現
class Coordinate{
    public int x;
    public int y;
    public int z;

    // 座標を指定してCoordinateオブジェクトを生成
    public Coordinate(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Coordinateオブジェクトを文字列形式で返すためのメソッド
    @Override
    public String toString(){
        return "{x:" + this.x + ", y:" + this.y + ", z:" + this.z + "}";
    }
}