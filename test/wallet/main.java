package wallet;

class Main{
    public static void main(String[] args){
        Person p = new Person("Maza", "Davis", 30, 175, 65);
        // Mazaの情報
        p.printState();

        // 札の額面と枚数を指定して財布に入金
        p.wallet.insertBill(5,3);
        p.wallet.insertBill(100,2);

        // 状態が更新されていることを確かめる
        p.printState();
    }
}