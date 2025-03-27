package wallet;

class Main{
    public static void main(String[] args){
        Person p = new Person("Maza");
        // Mazaの情報
        System.out.println("firstname - " + p.firstName);
        System.out.println("lastname - " + p.lastName);
        System.out.println("age - " + p.age);
        System.out.println("height - " + p.heightM);
        System.out.println("weight - " + p.weightKg);
        System.out.println("Current Money - " + p.getCash());

        // 情報の更新
        p.lastName = "Matt";
        p.age = 25;
        p.heightM = 180;
        p.weightKg = 80;

        System.out.println();
        System.out.println("firstname - " + p.firstName);
        System.out.println("lastname - " + p.lastName);
        System.out.println("age - " + p.age);
        System.out.println("height - " + p.heightM);
        System.out.println("weight - " + p.weightKg);
    }
}