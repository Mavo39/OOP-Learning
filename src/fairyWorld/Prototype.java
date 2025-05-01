package fairyWorld;

// クローンを作成する機能をもつ抽象メソッドを要求するインターフェース
// ジェネリクスを使うことで、clone()メソッドが返すオブジェクトの型を柔軟に指定できる
interface Prototype<E> {
    abstract E clone();
}