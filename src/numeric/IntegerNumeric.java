package numeric;

class IntegerNumeric extends Numeric {
    // IntegerNumericは内部で整数（int型）を保持し、その値をgetIntegerメソッドで返すとともに、getDoubleメソッドではその値をdouble型にキャストして返す
    private int value;

    // コンストラクタではint型の引数を受け取る
    public IntegerNumeric(int value){
        this.value = value;
    }

    @Override
    public int getInteger(){
        return this.value;
    }

    @Override
    public double getDouble(){
        return (double)this.value;
    }
}