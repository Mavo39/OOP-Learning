package audible;

// 食べられるオブジェクトが持つべきメソッドを定義
interface Edible {
    public abstract String howToPrepare();
    public abstract double calories();
}