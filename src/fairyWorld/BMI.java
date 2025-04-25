package fairyWorld;

class BMI{
    private double heightM;
    private double weightKg;

    public BMI(double heightM, double weightKg){
        this.heightM = heightM;
        this.weightKg = weightKg;
    }

    public double getWeightKg(){
        return this.weightKg;
    }

    public double getValue(){
        return this.weightKg / (this.heightM * this.heightM);
    }

    @Override
    public String toString(){
        return " " + this.heightM + " meters\n" + " " + this.weightKg + " kg\n BMI:" + this.getValue();
    }
}