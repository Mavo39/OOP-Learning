package audible;

class Truck implements Audible {
    private double weightKg;
    
    public Truck(double weightKg){
        this.weightKg = weightKg;
    }

    @Override
    public String toString(){
        return "This is a truck that weights: " + this.weightKg + "kg";
    }

    @Override
    public void makeNoise(){
        System.out.println("Beep! Beep!");
    }

    @Override
    public double soundFrequency(){
        return 165;
    }

    @Override
    public double soundLevel(){
        return 120;
    }
}