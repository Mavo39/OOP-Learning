package rgb24Immutable;

class Test {
    public static void main(String[] args){
        RGB24Immutable color1 = new RGB24Immutable(0, 153, 255);
        RGB24Immutable color2 = new RGB24Immutable("ff99cc");
        RGB24Immutable color3 = new RGB24Immutable("100110011111111100110011");
        RGB24Immutable grey = new RGB24Immutable("7b7b7b");

        System.out.println(grey);
        System.out.println();
        System.out.println(color1);
        System.out.println(color2);
        System.out.println(color3);

        // private修飾子のため、エラーになる
        // color1.red = 200;
        // color1.setAsBlack();
        // color1.setColorByHex("ff99cc");
    }
}

