package shape;

import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Shape2d {
    protected double scale = 1;
    protected String borderColor = "black";
    protected String backgroundColor = "white";
    protected Date createdTime;

    public Shape2d(){
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
}