package stack;

// Javaの汎用的なObjectクラスを使って実装
class Node {
    Object data;
    Node next;

    public Node(Object data){
        this.data = data;
    }
    // コンストラクタでは最小限の情報（データのみ）を受け取り、next は後から設定する柔軟性を持たせている
}