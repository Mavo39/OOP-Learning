package person;

class Test{
    public static void main(String[] args){
        Person masa = new Person("Masa", "Sat", 1.77, 67.5, 1990);
        // masaの情報と年齢を表示
        System.out.println(masa);
        System.out.println(masa.getAge());

        // setterを使い、masaの名前を変更
        masa.setFirstName("MasaII");
        masa.setLastName("Kat");

        // 変更後のmasaの情報を表示
        System.out.println("変更後の情報を表示");
        System.out.println(masa);

        // 身長・体重・生年月日を表示
        System.out.println();
        System.out.println("身長: " + masa.getHeightM());
        System.out.println("体重: " + masa.getWeightKg());
        System.out.println("生年月日: " + masa.getBirthYear());

        // 以下のコードはクラスが異なるためエラーが発生する
        // mainメソッドがあっても、TestクラスかPersonクラスのプロパティやメソッドへはアクセスできない
        // System.out.println(masa.getFullName());
        // masa.lastName = "John";

        // 名前を変更するpublicメソッドを呼び出し
        // masa.changeName("kazu","kat");
        // System.out.println(masa);
    }
}