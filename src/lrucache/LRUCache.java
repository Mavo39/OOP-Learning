package cache;
import java.util.HashMap;

// ジェネリクスを使って実装(K: key, V: value)
public class LRUCache<K, V> {
    // 双方向リストのノードクラス
    // 外部ファイルに作成しカプセル化を実装すると、setter/getterが必要になり、コードが冗長になってしまう
    // -> クラス内にクラスを実装することでカプセル化を実装する
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
    private Node head; // ダミーノード(リストの先端を示す目印)
    private Node tail; // ダミーノード(リストの終端を示す目印)
    // 実際のデータは head - tail の間に配置される （データ構造の整合性をとるために境界ノードが必要）
    // head.next: 最も最近使われた実際のノード（先頭）
    // tail.prev: 最も長く使われていない実際のノード（末尾）

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
        // キャッシュにキーがある場合: 上書き
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            node.value = value; // 既存の値を更新
            removeNode(node);
            addToHead(node);
        } 
        // キャッシュにキーがない場合: 追加
        else {
            // 容量超過の場合: 末尾のノードを削除
            if(cache.size() >= capacity){
                Node last = tail.prev;
                cache.remove(last.key);
                removeNode(last);
            }
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            addToHead(newNode);
        }
    }

    // ノードをリストから削除
    private void removeNode(Node node){
        // 削除されるノードの前後のノードのリンクをつなげる
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // ノードをリストの先頭に追加
    private void addToHead(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}