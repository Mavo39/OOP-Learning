package numeric;

// CharNumericは内部で文字（char型）を保持し、その文字を整数として解釈（ASCIIコード等に基づいた整数値）したものをgetIntegerメソッドで返す
class CharNumeric extends Numeric {
    private char c;
    
    // コンストラクタでは、char型またはint型の引数を受け取る
    public CharNumeric(char c){
        this.c = c;
    }

    public CharNumeric(int c){
        this.c = (char)c;
    }

    // 整数表現としては、charをintにキャストした値を返す
    @Override
    public int getInteger(){
        return this.c;
    }

    // double型表現としては、整数表現をdouble型にキャスト
    @Override
    public double getDouble(){
        return (double)this.getInteger();
    }
}