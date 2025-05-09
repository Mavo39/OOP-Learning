package stack;

// IntegerStackとほぼ同じ処理で、データ型のみ異なる
class DoubleStack {
    DoubleNode head;

    // スタックに新しい要素を追加
    public void push(Double data){
        DoubleNode temp = this.head;
        this.head = new DoubleNode(data);
        this.head.next = temp;
    }

    // スタックの先頭の要素を取り出し、その要素をスタックから削除
    public Double pop(){
        if(this.head == null) return null;

        DoubleNode temp = this.head;
        this.head = this.head.next;
        return temp.data;
    }

    // スタックの先頭の要素を取り出すが、削除はしない
    public Double peek(){
        if(this.head == null) return null;
        return this.head.data;
    }

    // スタックの内容を文字列として出力
    @Override
    public String toString(){
        if(this.head == null) return "null";

        StringBuilder str = new StringBuilder("|" + this.head.data + "|");
        DoubleNode iterator = this.head.next;

        while(iterator != null && iterator.next != null){
            str.append(iterator.data + ",");
            iterator = iterator.next;
        }

        str.append(iterator.data);
        return str.toString() + "|";
    }
}