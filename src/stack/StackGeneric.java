package stack;
import java.lang.StringBuilder;

// ジェネリック型Eを使用することで、任意の型のオブジェクトをスタックに格納することができる
class StackGeneric<E> {
    NodeGeneric<E> head;
    
    // Eはインスタンスが作成されると特定のタイプに置き換えられる
    // これにより、任意の型のデータをスタックにプッシュできる
    public void push(E data){
        NodeGeneric<E> temp = this.head;
        this.head = new NodeGeneric<E>(data);
        this.head.next = temp;
    }

    public E pop(){
        if(this.head == null) return null;

        NodeGeneric<E> temp = this.head;
        this.head = this.head.next;
        return temp.data;
    }

    public E peek(){
        if(this.head == null) return null;
        return this.head.data;
    }

    @Override
    public String toString(){
        if(this.head == null) return "null";
        StringBuilder str = new StringBuilder("|" + this.head.data + "|");

        NodeGeneric<E> iterator = this.head.next;
        while(iterator != null && iterator.next != null){
            str.append(iterator.data + ",");
            iterator = iterator.next;
        }

        str.append(iterator.data);
        return str.toString() + "|";
    }
}