package wallet;

class Test2 {
    public static void main(String[] args){
        Address house = new Address("南向台", "福島市", "日本");
        Person tom = new Person("Tom", "Hopper", 30, 1.85, 80, house);
        Person mike = new Person("Mike", "Davis", 32, 1.90, 90, house);
        Person julian = new Person("Julian", "Robert", 35, 1.80, 75, house);

        tom.printState();
        mike.printState();
        julian.printState();

        tom = null;
        julian = null;

        // tomとjulianのオブジェクトが削除されても、住所であるhouseは存在し続ける
        // AddressとPersonの間の集約をあらわす
        System.out.println(house);
    }
}