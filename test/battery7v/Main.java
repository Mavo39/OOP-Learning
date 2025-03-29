package battery7v;

class Main{
    public static void main(String[] args){
        Battery7v zlD72 = new Battery7v("MT-Dell Tech", "ZL-D72", 9.9, 1.18, 38, 80, 70);
        Battery7v zlD50 = new Battery7v("MT-Dell Tech", "ZL-D50", 6.6, 0.9, 28, 50, 65);
        Battery7v zlD40 = new Battery7v("MT-Dell Tech", "ZL-D40", 5.3, 1.18, 38, 80, 70);

        System.out.println();
        System.out.println(zlD72);
        System.out.println(zlD50);
        System.out.println(zlD40);

        System.out.println("新たなインスタンスを作成");
        Battery7v mdPL140 = new Battery7v("BowserPower", "MD-PL140", 9.9, 1.18, 89, 119, 85);
        // クラス変数の更新は定数のため不可
        // Battery7v.VOLTAGE = 15.5;

        System.out.println("Voltageがすべてのインスタンスで同じか確認");
        // インスタンス経由でクラス変数にアクセス（警告あり）
        System.out.println(zlD72.VOLTAGE);
        System.out.println(zlD50.VOLTAGE);
        System.out.println(zlD40.VOLTAGE);
        System.out.println(mdPL140.VOLTAGE);
        // 静的変数は`クラス名.変数名`でアクセスする
        System.out.println(Battery7v.VOLTAGE);
        

        System.out.println();

        System.out.println("総製造数を表示");
        System.out.println(Battery7v.manufacturedCount);
    }    
}