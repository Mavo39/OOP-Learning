package shape;

class Rectangle extends Shape2D {
    protected double l;
    protected double h;

    public Rectangle(double l, double h){
        super();
        this.l = l;
        this.h = h;
    }

    @Override
    public String getDescription(){
        return "This is a rectangle! It contains the length and height of a rectangle.";
    }
    
    @Override
    public double getArea(){
        return this.l * this.h;
    }

    @Override
    public double getPerimeter(){
        return 2 * (this.l + this.h);
    }
}