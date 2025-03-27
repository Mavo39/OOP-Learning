package battery;

class Battery{
    // メンバ変数を定義
    public String manufacturer;
    public String model;
    public double voltage;
    public double ampHours;
    public double weightKg;
    public double[] dimensionMm;

    public Battery(String manufacturer, String model, double voltage, double ampHours, double weightKg, double wMm, double hMm, double dMm){
        this.manufacturer = manufacturer;
        this.model = model;
        this.voltage = voltage;
        this.ampHours = ampHours;
        this.weightKg = weightKg;
        this.dimensionMm = new double[]{wMm, hMm, dMm};
    }

    @Override
    public String toString(){
        // このオブジェクトの参照を取得する
        // hashCode()メソッドはオブジェクトに対する整数値を返す
        // この整数値は、オブジェクトがメモリ内に格納されている場所に基づいている
        String referenceHash = Integer.toHexString(this.hashCode());

        return this.manufacturer + " " + this.model + ": " + this.getPowerCapacity() + "Wh (" +  this.voltage + "V/" + this.ampHours + "Ah) - " + this.dimensionMm[0] + "(W)x" + this.dimensionMm[1] + "(H)x" + this.dimensionMm[2] + "(D) " + this.weightKg + "kg .... Instance Reference:" + referenceHash;
    }

    // 電力容量を計算するメソッド
    public double getPowerCapacity(){
        return this.voltage * this.ampHours;
    }

}