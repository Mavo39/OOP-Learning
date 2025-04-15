package audible;

class Cow implements Audible {
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
}