package battery;

class Main{
    public static void main(String[] args){
        // Battery mc60 = new Battery("VTec", "MC60", 14.4, 4.2, 0.35, 52, 77, 40.5);
        // Battery mdPL140 = new Battery("BowserPower", "MD-PL140", 14.4, 9.9, 1.18, 89, 119, 85);
        // Battery zlD72 = new Battery("MT-Dell Tech", "ZL-D72", 7.2, 9.9, 1.18, 38, 80, 70);

        // System.out.println("Instance Reference: " + Integer.toHexString(mc60.hashCode()));
        // System.out.println(mc60);

        // System.out.println();
        // System.out.println(mc60.ampHours + " are its amps");

        // System.out.println();
        // System.out.println(mc60);
        // System.out.println();
        // System.out.println(mdPL140);
        // System.out.println();
        // System.out.println(zlD72);

        // mc96にはオブジェクトの参照が格納されている
        Battery mc96 = new Battery("VTec", "MC96", 14.4, 6.6, 0.55, 72, 97, 51.5);
        // シャローコピー
        Battery mc96Second = mc96;
        // ディープコピー（値は全く同じだが、mc96とは別のオブジェクト）
        Battery mc96Third = new Battery("VTec", "MC96", 14.4, 6.6, 0.55, 72, 97, 51.5);

        Battery mdLs95 = new Battery("Atomic Units", "MD-LS95", 14.4, 6.6, 0.55, 72, 97, 51.5);
        
        System.out.println(mc96);
        System.out.println();
        System.out.println(mc96Second);
        System.out.println();
        System.out.println(mc96Third);
        System.out.println();
        System.out.println(mdLs95);

        System.out.println();
        System.out.println(mc96 == mc96);

        System.out.println(mc96 == mc96Second);
        // ディープコピーとの比較
        System.out.println(mc96 == mc96Third);

        System.out.println(mc96 == mdLs95);
    }
}