package rgb24;

class RGB24 {
    // カプセル化
    // private int red;
    // private int green;
    // private int blue;
    private String rgbHex;

    public RGB24(int red, int green, int blue){
        this.rgbHex = String.format("%02x%02x%02x", red, green, blue);
    }

    public RGB24(String inputString){
        int l = inputString.length();
        // 文字列の長さに応じて、16進数か2進数かを判断し、それぞれのメソッドを呼び出す
        // 16進数の場合
        if(l == 6) this.setColorByHex(inputString);
        // 2進数の場合
        else if(l == 24) this.setColorByBin(inputString);
        // それ以外は黒に設定
        else this.setAsBlack();
    }

    public void setColorByHex(String hex){
        // 文字列の長さが6でなければ黒を設定する
        if(hex.length() != 6) this.setAsBlack();
        else {
            // 文字列を2文字ずつに分割し、それぞれを16進数として解釈して、RGB色成分に設定
            // this.red = Integer.parseInt(hex.substring(0,2), 16);
            // this.green = Integer.parseInt(hex.substring(2,4), 16);
            // this.blue = Integer.parseInt(hex.substring(4,6), 16);
            this.rgbHex = hex;
        }
    }

    public void setColorByBin(String bin){
        // 文字列の長さが24でなければ黒を設定する
        if(bin.length() != 24) this.setAsBlack();
        else {
            // 文字列を8文字ずつに分割し、それぞれを2進数として解釈して、RGB色成分に設定
            int red = Integer.parseInt(bin.substring(0,8), 2);
            int green = Integer.parseInt(bin.substring(8,16), 2);
            int blue = Integer.parseInt(bin.substring(16), 2);
            this.rgbHex = String.format("%02x%02x%02x", red, green, blue);
        }
    }

    public void setAsBlack(){
        // this.red = 0;
        // this.green = 0;
        // this.blue = 0;
        this.rgbHex = "000000";
    }

    // RGBを16進数の文字列で返す
    public String getHex(){
        // String hex = Integer.toHexString(this.red);
        // hex += Integer.toHexString(this.green);
        // hex += Integer.toHexString(this.blue);
        return this.rgbHex;
    }

    // RGBを2進数の文字列で返す
    public String getBits(){
        String binary = "";
        for (int i = 0; i < rgbHex.length(); i += 2) {
            String hexByte = rgbHex.substring(i, i + 2);
            binary += String.format("%8s", Integer.toBinaryString(Integer.parseInt(hexByte, 16)))
                          .replace(' ', '0');
        }
        return binary;
    }


       // 各色の値を取得（必要に応じて計算）
       private int getRed() {
        return Integer.parseInt(rgbHex.substring(0, 2), 16);
    }

    private int getGreen() {
        return Integer.parseInt(rgbHex.substring(2, 4), 16);
    }

    private int getBlue() {
        return Integer.parseInt(rgbHex.substring(4, 6), 16);
    }

    public String getColorShade(){
        // if(this.red == this.green && this.green == this.blue) return "greyscale";
        // String[] stringTable = new String[]{"red", "green", "blue"};
        // int[] values = {this.red, this.green, this.blue};

        int red = this.getRed();
        int green = this.getGreen();
        int blue = this.getBlue();

        if (red == green && green == blue) return "greyscale";
        String[] stringTable = {"red", "green", "blue"};
        int[] values = {red, green, blue};

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

    // RGB24クラスのインスタンスの情報を文字列で返します。
    @Override
    public String toString(){
        return "The color is rgb(" + this.getRed() + "," + this.getGreen() + "," + this.getBlue() + "). Hex: " + this.getHex() + ", binary: " + this.getBits();
    }
}