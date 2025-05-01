package fairyWorld;

class Test10 {
    public static void main(String[] args){
        // オブジェクトを作成するのは呼び出し元の仕事
        // 実際のシステムでは、このプロセスはすでに組み込まれている可能性があることに注意
        System.out.println(StampPrototypeFactory.get(0)); // Generic
        System.out.println(StampPrototypeFactory.get(1)); // Star
        System.out.println(StampPrototypeFactory.get(2)); // Heart

        // プロトタイプレジストリ内のアイテムを動的に追加または置換
        // スロット3をstarスタンプに変更
        StampPrototypeFactory.updatePrototype(3, new StarStamp("#f1c40f"));    // Heartのカラー変更
        StampPrototypeFactory.updatePrototype(4, new TreeStamp("#2980b9"));    // Tree
        StampPrototypeFactory.updatePrototype(5, new RainbowStamp("#ecf0f1")); // Rainbow

        FairyWorld fw = new FairyWorld();
        fw.photoBoothShoot(new Integer[]{3,4,2,1,1,2,3,4,5,5,6,6,0});
    }
}