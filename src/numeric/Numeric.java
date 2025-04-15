package numeric;

// 数値を表現する抽象クラス
abstract class Numeric {
    // Numericの整数表現を取得し、各型に変換するメソッド
    // byte型(8ビット)への変換
    public byte getByte(){
        return (byte)this.getInteger();
    }

    // short型(16ビット)への変換
    public short getShort(){
        return (short)this.getInteger();
    }

    // long型(64ビット)への変換
    public long getLong(){
        return (long)this.getInteger();
    }

    // char型(16ビット)への変換
    public char getChar(){
        return (char)this.getInteger();
    }

    // サブクラスでデータを整数として表現する方法を定義する必要がある
    public abstract int getInteger();

    // サブクラスでデータをdouble型として表現する方法を定義する必要がある
    public abstract double getDouble();

    // Numericオブジェクトを文字列に変換
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " of int value: " + this.getInteger();
    }
}