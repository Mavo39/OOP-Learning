package battery7v;

class Battery7v{
    public String manufacturer;
    public String model;

    // クラス変数 (全てのインスタンスで共有)
    public static final double VOLTAGE = 7.2; // 定数化（大文字表記する）
    public static final String type = "Lithium-Ion"; // 定数化
    public static int manufacturedCount;

    // インスタンス変数 (インスタンスごとに持つ)
    public double ampHours;
    public double weightKg;
    public double[] dimensionMm;

    public Battery7v(String manufacturer, String model, double ampHours, double weightKg, double wMm, double hMm, double dMm){
        this.manufacturer = manufacturer;
        this.model = model;
        this.ampHours = ampHours;
        this.weightKg = weightKg;
        this.dimensionMm = new double[]{wMm, hMm, dMm};
        // 製造された電池の数をカウント(新しいオブジェクトを生成すると自動的にカウントされ、クラス変数が更新される)
        Battery7v.manufacturedCount += 1;
    }

    // オーバーライドにより、printlnメソッドの呼び出しにより以下のtoStringメソッドが呼び出されるようになる
    @Override
    public String toString(){
        return this.manufacturer + " " + this.model + " " + Battery7v.type + " Battery: " + this.getPowerCapacity() + "Wh (" + Battery7v.VOLTAGE + "V/" + this.ampHours + "Ah) - " + this.dimensionMm[0] + "(W)x" + this.dimensionMm[1] + "(H)x" + this.dimensionMm[2] + "(D) " + this.getVolume() + " volume " + this.weightKg + "kg";
    }

    public double getPowerCapacity(){
        return Battery7v.VOLTAGE * this.ampHours;
    }

    public double getVolume(){
        return this.dimensionMm[0] * this.dimensionMm[1] * this.dimensionMm[2];
    }
}