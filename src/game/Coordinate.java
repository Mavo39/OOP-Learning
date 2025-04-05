package game;

class Coordinate {
    public int x;
    public int y;
    public int z;

    public Coordinate(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString(){
        return "{x:" + this.x + ", y:" + this.y + ", z:" + this.z + "}";
    }
}