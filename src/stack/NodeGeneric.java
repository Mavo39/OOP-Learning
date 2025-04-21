package stack;

// ジェネリック型をEとして定義
class NodeGeneric<E> {
    E data;
    NodeGeneric<E> next;
    
    public NodeGeneric(E data){
        this.data = data;
    }
}