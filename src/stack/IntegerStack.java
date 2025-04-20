package stack;

// IntegerNodeを扱うスタッククラス
class IntegerStack {
    IntegerNode head;

    // スタックに新しい要素を追加
    public void push(Integer data){
        IntegerNode temp = this.head;
        this.head = new IntegerNode(data);
        this.head.next = temp;
    }

    // スタックの先頭の要素を取り出し、その要素をスタックから削除
    public Integer pop(){
        if(this.head == null) return null;

        IntegerNode temp = this.head;
        this.head = this.head.next;
        return temp.data;
    }

    // スタックの先頭は取り出すが、削除はしない
    public Integer peek(){
        if(this.head == null) return null;
        return this.head.data;
    }

    // スタックの内容を文字列として出力する
    @Override
    public String toString(){
        if(this.head == null) return "null";

        StringBuilder str = new StringBuilder("|" + this.head.data + "|");

        IntegerNode iterator = this.head.next;
        while(iterator != null && iterator.next != null){
            str.append(iterator.data + ",");
            iterator = iterator.next;
        }

        str.append(iterator.next);
        return str.toString() + "]";
    }
}