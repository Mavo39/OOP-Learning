package person;

class Test{
    public static void main(String[] args){
        Person masa = new Person("Masa", "Sat", 1.77, 67.5, 1990);
        // PersonオブジェクトのtoStringメソッドを呼び出し
        System.out.println(masa);

        // 年齢を取得
        System.out.println(masa.getAge());

        // 以下のコードはクラスが異なるためエラーが発生する
        // mainメソッドがあっても、TestクラスかPersonクラスのプロパティやメソッドへはアクセスできない
        // System.out.println(masa.getFullName());
        // masa.lastName = "John";

        // 名前を変更するpublicメソッドを呼び出し
        masa.changeName("kazu","kat");
        System.out.println(masa);
    }
}