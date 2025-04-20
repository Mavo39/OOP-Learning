package audible;

// Cowクラスを拡張
class Cow implements Audible,Edible {
    private double weightKg;
    private double soundFrequency = 90;
    private double soundDecibels = 70;

    public Cow(double weightKg){
        this.weightKg = weightKg;
    }

    @Override
    public String toString(){
        return "This is a cow that weights: " + this.weightKg + "kg";
    }

    @Override
    public void makeNoise(){
        System.out.println("Moooooo!");
    }

    @Override
    public double soundFrequency(){
        return this.soundFrequency;
    }

    @Override
    public double soundLevel(){
        return this.soundDecibels;
    }

    // cowの調理方法を返すメソッド
    @Override
    public String howToPrepare(){
        return "Cut the cow with a butchering knife into even pieces, and grill each piece at 220C";
    }

    // cowのカロリーを返すメソッド
    @Override
    public double calories(){
        return this.weightKg * 1850;
    }
}