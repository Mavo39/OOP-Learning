package shape;

import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Shape2D {
    protected double scale = 1;
    protected String borderColor = "black";
    protected String backgroundColor = "white";
    protected Date createdTime;

    public Shape2D(){
        this.createdTime = new java.util.Date();
    }

    public double getScale(){
        return this.scale;
    }

    public void setScale(double scale){
        this.scale = scale;
    }

    public String getBorderColor(){
        return this.borderColor;
    }

    public void setBorderColor(String color){
        this.borderColor = color;
    }

    public String getBackgroundColor(){
        return this.backgroundColor;
    }

    public void setBackgroundColor(String color){
        this.backgroundColor = color;
    }

    public String getDateCreated(){
        return new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(this.createdTime);
    }

    // 抽象メソッド：サブクラスで実装を行なう必要がある
    public abstract String getDescription();
    public abstract double getArea();
    public abstract double getPerimeter();
    
    // toStringメソッド：オブジェクトの説明と作成日時を文字列として返す
    @Override
    public String toString(){
        return this.getDescription() + " created at " + this.getDateCreated();
    }
}