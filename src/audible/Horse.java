package audible;

class Horse implements Audible {
    private double weightKg;
    private double soundFrequency = 120;
    private double soundDecibels = 75;

    public Horse(double weightKg){
        this.weightKg = weightKg;
    }

    @Override
    public String toString(){
        return "This is a horse that weights: " + this.weightKg + "kg";
    }

    @Override
    public void makeNoise(){
        System.out.println("Hihiiiiiiin!");
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