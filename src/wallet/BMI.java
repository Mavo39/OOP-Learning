package wallet;

class BMI {
    private double heightM;
    private double weightKg;

    public BMI(double heightM, double weightKg){
        this.heightM = heightM;
        this.weightKg = weightKg;
    }

    public double getValue(){
        return this.weightKg / (this.heightM * this.heightM);
    }

    @Override
    public String toString(){
        return "meters - " + this.heightM + "\nweight - " + this.weightKg + "kg\n" + "BMI: " + this.getValue();
    }
}