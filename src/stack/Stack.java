package stack;
import java.lang.StringBuilder;

class Stack {
    Node head;

    // スタックに新しい要素を追加
    public void push(Object data){
        Node temp = this.head;
        this.head = this.head.next;
        this.head.next = temp;
    }

    // スタックの先頭の要素を取り出し、その要素をスタックから削除
    public Object pop(){
        if(this.head == null) return null;

        Node temp = this.head;
        this.head = this.head.next;
        return temp.data;
    }

    // スタックの先頭の要素を取り出すが、削除はしない
    public Object peek(){
        if(this.head == null) return null;
        return this.head.data;
    }

    // スタックの内容を文字列として出力
    @Override
    public String toString(){
        if(this.head == null) return "null";

        StringBuilder str = new StringBuilder("|" + this.head.data + "|");
        Node iterator = this.head.next;

        while(iterator != null && iterator.next != null){
            str.append(iterator.data + ",");
            iterator = iterator.next;
        }

        str.append(iterator.data);
        return str.toString() + "|";
    }
}
// Objectクラスを使ったアプローチには、いくつか問題がある
// スタックは同一のデータ型から成る均一なリストであるべきで、異なるデータ型を混在させてしまうと、論理エラーや実行時エラーを引き起こす可能性がある。