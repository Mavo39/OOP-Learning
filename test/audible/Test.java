package audible;

class Test {
    // Audibleインターフェースを使用してポリモーフィズムを実現
    public static void personInteractWithObject(Person p, Audible noiseObject){
        System.out.println(p + " will interact with " + noiseObject + " and cause it to make a noise");
        noiseObject.makeNoise();
        System.out.println("The noise was made at " + noiseObject.soundFrequency() + "Hz at a level of " + noiseObject.soundLevel() + "dB");
        System.out.println();
    }

    public static void main(String[] args){
        Person ma = new Person("Ma", "Bo", 1.75, 70, 30);
        // インターフェースを型として使用することでポリモーフィズムを利用できる
        Audible obj1 = new Person("Mari", "Andrew", 1.7, 55, 27);
        Audible obj2 = new Horse(450);
        Cow obj3 = new Cow(1300);
        Audible obj4 = new Truck(3230.5);
        Violin obj5 = new Violin();

        // 以下、MaがそれぞれのAudibleオブジェクトと対話
        personInteractWithObject(ma, obj1);
        personInteractWithObject(ma, obj2);
        personInteractWithObject(ma, obj3);
        personInteractWithObject(ma, obj4);
        personInteractWithObject(ma, obj5);

        // 特定のメソッドを呼び出すために、そのインスタンスが適切なクラスのインスタンスであることを確認する必要がある
        if(obj1 instanceof Person) System.out.println("Specific task..." + ((Person) obj1).getFullName());
    }
}