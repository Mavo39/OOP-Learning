package stack;

class Test {
    public static void main(String[] args){
        // IntegerStackのテスト
        IntegerStack stackInt = new IntegerStack();
        System.out.println(stackInt);
        stackInt.push(3);
        stackInt.push(23);
        stackInt.push(425);
        stackInt.push(94);
        stackInt.push(2);
        stackInt.push(14);
        System.out.println(stackInt);
        stackInt.pop();
        stackInt.pop();
        stackInt.push(45);
        System.out.println(stackInt);

        // DoubleStackのテスト
        DoubleStack stackDouble = new DoubleStack();
        System.out.println(stackDouble);
        stackDouble.push(3.123);
        stackDouble.push(23.5984);
        stackDouble.push(42.515);
        stackDouble.push(9.5154);
        stackDouble.push(2.9941356);
        stackDouble.push(0.00414);
        System.out.println(stackDouble);
        stackDouble.pop();
        stackDouble.pop();
        stackDouble.push(45.0);
        System.out.println(stackDouble);
    }
}