package stack;

class Test2 {
    public static void main(String[] args){
        // Integerのスタックを作成
        // ここで、ジェネリック型EはIntegerになる
        StackGeneric<Integer> stack = new StackGeneric<Integer>();
        System.out.println(stack);
        stack.push(3);
        stack.push(23);
        stack.push(425);
        stack.push(2456);
        stack.push(14);
        stack.push(455);
        System.out.println(stack);

        // 2つの整数をポップし、それらを掛け合わせる。結果はInteger
        System.out.println(stack.pop() * stack.pop());
        System.out.println(stack);

        // Doubleのスタックを作成
        // ここで、ジェネリック型EはDoubleになる
        StackGeneric<Double> stackDouble = new StackGeneric<Double>();
        System.out.println(stackDouble);
        stackDouble.push(3.123);
        stackDouble.push(23.5984);
        stackDouble.push(42.515);
        stackDouble.push(9.5154);
        stackDouble.push(2.9941356);
        stackDouble.push(1.00414);
        System.out.println(stackDouble);
        
        // 2つのDoubleをポップし、それらを掛け合わせる。結果はDouble
        System.out.println(stackDouble.pop() * stackDouble.pop());
        System.out.println(stackDouble);
    }
}