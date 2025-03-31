package rgb24Immutable;

class RGB24Immutable {
    // メンバ変数をprivateに設定
    private int red;
    private int green;
    private int blue;

    // コンストラクタで値を初期化し、その後は変更しない
    public RGB24Immutable(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public RGB24Immutable(String inputString){
        int l = inputString.length();

        if(l == 6) this.setColorByHex(inputString);
        else if(l == 24) this.setColorByBin(inputString);
        else this.setAsBlack();
    }

    // クラスの内部で色の設定を行なうためのメソッド
    private void setColorByHex(String hex){
        if(hex.length() != 6) this.setAsBlack();
        else{
            this.red = Integer.parseInt(hex.substring(0,2), 16);
            this.green = Integer.parseInt(hex.substring(2,4), 16);
            this.blue = Integer.parseInt(hex.substring(4,6), 16);
        }
    }

    private void setColorByBin(String bin){
        if(bin.length() != 6) this.setAsBlack();
        else{
            this.red = Integer.parseInt(bin.substring(0,8), 2);
            this.green = Integer.parseInt(bin.substring(8,16), 2);
            this.blue = Integer.parseInt(bin.substring(16,24), 2);
        }
    }

    private void setAsBlack(){
        this.red = 0;
        this.green = 0;
        this.blue = 0;
    }

    // 値を外部から取得するためのgetterメソッド
    public String getHex(){
        String hex = Integer.toHexString(this.red);
        hex += Integer.toHexString(this.green);
        hex += Integer.toHexString(this.blue);

        return hex;
    }

    public String getBits(){
        return Integer.toBinaryString(Integer.parseInt(this.getHex(), 16));
    }

    public String getColorShade(){
        if(this.red == this.green && this.green == this.blue) return "greyscale";
        String[] stringTable = new String[]{"red","green","blue"};
        int[] values = {this.red, this.green, this.blue};

        int max = values[0];
        int maxIndex = 0;
        for(int i = 1; i < values.length; i++){
            if(max <= values[i]){
                max = values[i];
                maxIndex = i;
            }
        }

        return stringTable[maxIndex];
    }

    @Override
    public String toString(){
        return "The color is rgb(" + this.red + "," + this.green + "," + this.blue + "). Hex: " + this.getHex() + ", binary: " + this.getBits();
    }
}