package shape;

class Test {
    public static void main(String[] args){
        // Shape2Dのオブジェクトを作成していくが、抽象クラスであるため直接インスタンス化はできない
        // Shape2Dを継承した具体的なオブジェクトを作成し、それらをShape2D型の変数に代入する
        Shape2D obj1 = new Square(4);
        Shape2D obj2 = new Rectangle(3,5);
        Shape2D obj3 = new Circle(9);

        shapePrinter(obj1);
        shapePrinter(obj2);
        shapePrinter(obj3);
    }

    public static void shapePrinter(Shape2D obj){
        System.out.println(obj);
        System.out.println("More data: area- " + obj.getArea() + ", perimeter- " + obj.getPerimeter());
        System.out.println();
    }
}