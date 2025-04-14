package shape;

class Square extends Shape2D {
    protected double l;

    public Square(double l){
        super();
        this.l = l;
    }
    // 抽象メソッドを具体的に実装していく
    @Override
    public String getDescription(){
        return "This is a square! It contains the length of one side, and all sides are equal.";
    } 

    @Override
    public double getArea(){
        return this.l * this.l;
    }

    @Override
    public double getPerimeter(){
        return this.l * 4;
    }
}