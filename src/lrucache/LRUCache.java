package lrucache;
import java.util.HashMap;

// ジェネリクスを使って実装(K: key, V: value)
public class LRUCache<K, V> {
    // 双方向リストのノードクラス
    // 外部ファイルに作成しカプセル化を実装すると、コードが冗長になってしまう
    // クラス内にクラスを実装することでカプセル化を実装する
    private class Node {
        K key;
        V value;
        Node prev;
        Node next;

        Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    // LRUCacheのフィールド
    private final int capacity; // キャッシュが保持できる最大のエントリ数（キーとデータのペアの数）
    private final HashMap<K, Node> cache;
    private Node head; // 最も最近使われた要素（先頭）
    private Node tail; // 最も長く使われていない要素（末尾）

    // 容量を指定して初期化
    public LRUCache(int capacity){
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.head = new Node(null, null);
        this.tail = new Node(null, null);
        head.next = tail;
        tail.prev = head;
    }

    // キーに対応する値を取得
    // 「キーが使用された」とみなすため、先頭に移動する
    // -> get()でアクセスされたノードが末尾にあると、実際には「最近使われた」にも関わらず誤って削除される可能性がある
    public V get(K key){
        // キャッシュにキーがない場合
        if(!cache.containsKey(key)){
            return null;
        }

        Node node = cache.get(key);
        removeNode(node); // ノードを現在の位置から削除
        addToHead(node);  // 先頭に移動
        return node.value;
    }

    // キーと値をキャッシュに追加
    public void put(K key, V value){

    }

    // ノードをリストから削除
    private void removeNode(Node node){

    }

    // ノードをリストの先頭に追加
    private void addToHead(Node node){

    }
}