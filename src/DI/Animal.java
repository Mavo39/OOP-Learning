package DI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal implements BMIObject {
    protected String species;
    protected double heightM;
    protected double weightKg;
    protected double lifeSpanDays;
    protected String biologicalSex;
    protected Date spawnTime;
    protected Date deathTime;
    protected int hungerPercent = 100;
    protected int sleepPercent = 100;

    public Animal(String species, double heightM, double weightKg, double lifeSpanDays, String biologicalSex){
        this.species = species;
        this.heightM = heightM;
        this.weightKg = weightKg;
        this.lifeSpanDays = lifeSpanDays;
        this.biologicalSex = biologicalSex;
        this.spawnTime = new java.util.Date();
    }
    
    public void eat(){
        if(!this.isAlive()) return;
        this.hungerPercent = 0;
    }

    public void setAsHungry(){
        if(!this.isAlive()) return;
        this.hungerPercent = 100;
    }

    public boolean isHungry(){
        return this.hungerPercent >= 70;
    }

    public void sleep(){
        if(!this.isAlive()) return;
        this.sleepPercent = 0;
    }

    public void setAsSleepy(){
        if(!this.isAlive()) return;
        this.sleepPercent = 100;
    }

    public boolean isSleepy(){
        return this.sleepPercent >= 70;
    }

    public void die(){
        this.sleepPercent = 0;
        this.hungerPercent = 0;
        this.deathTime = new java.util.Date();
    }

    public boolean isAlive(){
        return this.deathTime == null;
    }

    @Override
    public String toString(){
        return this.species + " lives " + this.lifeSpanDays + " days / " + "gender: " + this.biologicalSex + "\n" + this.status();
    }

    public String status(){
        return this.species + " status: \n" + " Hunger - " + this.hungerPercent + "% \n" + " Sleepiness - " + this.sleepPercent + "% \n" + " Alive - " + this.isAlive() + "\n" + " First created at " + this.dateCreated();
    }

    public String dateCreated(){
        return new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(this.spawnTime);
    }

    @Override
    public double getHeightM(){
        return this.heightM;
    }

    @Override
    public double getWeightKg(){
        return this.weightKg;
    }
}