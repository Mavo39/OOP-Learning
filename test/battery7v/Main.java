package battery7v;

class Main{
    public static void main(String[] args){
        Battery7v zlD72 = new Battery7v("MT-Dell Tech", "ZL-D72", 9.9, 1.18, 38, 80, 70);
        Battery7v zlD50 = new Battery7v("MT-Dell Tech", "ZL-D50", 6.6, 0.9, 28, 50, 65);
        Battery7v zlD40 = new Battery7v("MT-Dell Tech", "ZL-D40", 5.3, 1.18, 38, 80, 70);

        System.out.println(zlD72);
        System.out.println(zlD50);
        System.out.println(zlD40);

        System.out.println();
        System.out.println("クラス変数にアクセス");
        System.out.println(Battery7v.manufacturedCount);
        System.out.println(Battery7v.manufacturedCount);
        System.out.println();

        System.out.println("新たなインスタンスを作成");
        Battery7v mdPL140 = new Battery7v("BowserPower", "MD-PL140", 9.9, 1.18, 89, 119, 85);
        Battery7v.voltage = 15.5;

        System.out.println(mdPL140);
        System.out.println(Battery7v.voltage);
        System.out.println(Battery7v.voltage);
        System.out.println(Battery7v.voltage);

        System.out.println();

        System.out.println("総製造数を表示");
        System.out.println(Battery7v.manufacturedCount);
    }    
}