package numeric;

class Test {
    public static void numericPrinter(Numeric num){
        System.out.println(num);
        System.out.println("Byte: " + num.getByte());
        System.out.println("Short: " + num.getShort());
        System.out.println("Long: " + num.getLong());
        System.out.println("Char: " + num.getChar());
        System.out.println("Double: " + num.getDouble());
        System.out.println();
    }

    public static void main(String[] args){
        Numeric num1 = new IntegerNumeric(75);
        // 大きなビットの整数をバイトに変換しようとすると、変更が失わせる可能性がある
        Numeric num2 = new IntegerNumeric(23455555);
        Numeric num3 = new CharNumeric(60);

        Test.numericPrinter(num1);
        Test.numericPrinter(num2);
        Test.numericPrinter(num3);
    }
}