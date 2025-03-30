package battery7v;

class Test{
    public static void main(String[] args){
        // Battery7v zlD72 = new Battery7v("MT-Dell Tech", "ZL-D72", 9.9, 1.18, 38, 80, 70);
        // Battery7v zlD50 = new Battery7v("MT-Dell Tech", "ZL-D50", 6.6, 0.9, 28, 50, 65);
        Battery7v zlD40 = new Battery7v("MT-Dell Tech", "ZL-D40", 5.3, 1.18, 38, 80, 70);
        // 現在までに製造されたバッテリーの合計数を表示
        System.out.println("Total batteries manufactured: " + Battery7v.manufacturedCount);

        System.out.println();
        // 不適切にバッテリー数を変更
        System.out.println("バッテリー数を増加させるメソッドを実行");
        ExternalModule.dangerousMethod("A55555", zlD40);
        ExternalModule.otherDangerousMethod();

        System.out.println();
        // メソッド実行後のバッテリーの合計数を表示
        System.out.println("Total batteries manufactured: " + Battery7v.manufacturedCount);
    }
}