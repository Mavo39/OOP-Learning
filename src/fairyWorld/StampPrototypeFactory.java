package fairyWorld;
import java.util.HashMap;
import java.util.Map;

// 異なる種類のスタンプのプロトタイプ（原型）を保持し、必要に応じてこれらのプロトタイプからクローンを作成するクラス
class StampPrototypeFactory {
    // 静的メモリへの格納
    // スタンプのプロトタイプを格納するためのレジストリ
    private static Map<Integer, Stamp> stampRegistry;
    private final static String DEFAULT_COLOR = "#e74c3c";

    // 静的ブロックは、クラスがロードされたときに実行されるコード
    // 問題が最初に実行されたときに静的データを初期化するのに便利
    static {
        // レジストリに初期スタンプのプロトタイプを登録
        // キーは必ずしも整数である必要はない
        StampPrototypeFactory.stampRegistry = new HashMap<Integer, Stamp>();
        StampPrototypeFactory.stampRegistry.put(0, new GenericStamp(StampPrototypeFactory.DEFAULT_COLOR));
        StampPrototypeFactory.stampRegistry.put(1, new StarStamp(StampPrototypeFactory.DEFAULT_COLOR));
        StampPrototypeFactory.stampRegistry.put(2, new HeartStamp(StampPrototypeFactory.DEFAULT_COLOR));
    }

    // 項目を登録・変更する
    // 見つからない場合は、プロトタイプに追加する
    public static void updatePrototype(Integer key, Stamp stamp){
        StampPrototypeFactory.stampRegistry.put(key, stamp);
    }

    // プロトタイプレジストリから指定されたキーに対応するスタンプのクローンを取得するメソッド
    // オブジェクトを取得する。これはレジスタ内にあるもののクローン（ディープコピーを作成）を作成することに注意
    public static Stamp get(Integer key){
        Stamp p = StampPrototypeFactory.stampRegistry.get(key);
        if(p != null) return p.clone();
        return null;
    }
}