package shape;

class Circle extends Shape2D {
    protected double r;

    public Circle(double r){
        super();
        this.r = r;
    }

    @Override
    public String getDescription(){
        return "This is a circle! It contains the radius length of the circle.";
    }

    @Override
    public double getArea(){
        return Math.PI * (this.r * this.r);
    }

    @Override
    public double getPerimeter(){
        return this.getCircumference();
    }

    public double getCircumference(){
        return 2 * Math.PI * this.r;
    }
}