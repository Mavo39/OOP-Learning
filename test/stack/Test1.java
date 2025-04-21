package stack;

class Test1 {
    public static void main(String[] args){
        Stack stack = new Stack();
        System.out.println(stack);
        stack.push(3);
        stack.push(23);
        stack.push(425);
        stack.push(3.123);
        stack.push(23.5984);
        stack.push(42.515);
        stack.push(9.5154);
        stack.push(14);
        System.out.println(stack);
    }
}