package rgb24;

class Test {
    public static void main(String[] args){
        // RGB値で色を作成
        RGB24 color1 = new RGB24(0, 153, 255);
        // 16進数で色を作成
        RGB24 color2 = new RGB24("ff99cc");
        // 2進数で色を作成
        RGB24 color3 = new RGB24("100110011111111100110011");
        // 16進数で色を作成
        RGB24 grey = new RGB24("7b7b7b");

        System.out.println(color1);
        System.out.println(color2);
        System.out.println(color3);
        System.out.println(grey);
    }
}