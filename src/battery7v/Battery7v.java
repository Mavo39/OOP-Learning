package battery7v;

class Battery7v{
    public String manufacturer;
    public String model;

    // クラス変数
    public static double voltage = 7.2;
    public static String type = "Lithium-Ion";
    public static int manufacturedCount;

    // インスタンス変数
    public double ampHours;
    public double weightKg;
    public double[] dimensionMm;

    public Battery7v(String manufacturer, String model, double ampHours, double weightKg, double wMm, double hMm, double dMm){
        this.manufacturer = manufacturer;
        this.model = model;
        this.ampHours = ampHours;
        this.weightKg = weightKg;
        this.dimensionMm = new double[]{wMm, hMm, dMm};
        // 製造された電池の数をカウント
        Battery7v.manufacturedCount += 1;
    }

    @Override
    public String toString(){
        return this.manufacturer + " " + this.model + " " + Battery7v.type + " Battery: " + this.getPowerCapacity() + "Wh (" + Battery7v.voltage + "V/" + this.ampHours + "Ah) - " + this.dimensionMm[0] + "(W)x" + this.dimensionMm[1] + "(H)x" + this.dimensionMm[2] + "(D) " + this.getVolume() + " volume " + this.weightKg + "kg";
    }

    public double getPowerCapacity(){
        return Battery7v.voltage * this.ampHours;
    }

    public double getVolume(){
        return this.dimensionMm[0] * this.dimensionMm[1] * this.dimensionMm[2];
    }
}