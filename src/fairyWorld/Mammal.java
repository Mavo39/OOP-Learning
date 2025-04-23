package fairyWorld;

class Mammal extends Animal {
    private double bodyTempertureC;
    private double avgBodyTempertureC;

    public Mammal(String species, double heightM, double weightKg, double lifeSpanDays, String biologicalSex, double avgBodyTempertureC){
        super(species, heightM, weightKg, lifeSpanDays, biologicalSex);

        this.avgBodyTempertureC = avgBodyTempertureC;
        this.bodyTempertureC = this.avgBodyTempertureC;
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("this " + this.species + " is eating with its single lower jaw");
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.mammalInformation();
    }

    public void increaseBodyHeat(double celcius){
        this.bodyTempertureC += celcius;
    }

    public void decreaseBodyHeat(double celcius){
        this.bodyTempertureC -= celcius;
    }

    public void adjustBodyHeat(){
        this.bodyTempertureC = this.avgBodyTempertureC;
    }

    public String mammalInformation(){
        return "This is a mammal with a temperature of: " + this.bodyTempertureC;
    }
}