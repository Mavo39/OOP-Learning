package animal;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

class Animal {
    protected String species;
    protected BMI bmi;
    protected double lifeSpanDays;
    protected String biologicalSex;
    protected Instant spawnTime;
    protected Instant deathTime;

    private int hungerPercent = 100;
    private int sleepPercent = 100;

    public Animal(String species, double heightM, double weightKg, double lifeSpanDays, String biologicalSex){
        this.species = species;
        // BMIクラスのインスタンスを生成（コンポジッション：別のクラスのインスタンスをフィールドとして持つこと）
        this.bmi = new BMI(heightM, weightKg);
        this.lifeSpanDays = lifeSpanDays;
        this.biologicalSex = biologicalSex;
        this.spawnTime = Instant.now();
    }

    // 食事をするメソッド
    public void eat(){
        if(!this.isAlive()) return;
        this.hungerPercent = 0;
    }

    // 空腹状態にするメソッド
    public void setAsHungry(){
        if(!this.isAlive()) return;
        this.hungerPercent = 100;
    }

    // 空腹かどうかを判定するメソッド
    // 空腹度70％以上の場合、空腹と判断
    public boolean isHungry(){
        return this.hungerPercent >= 70;
    }

    // 睡眠をとるメソッド
    // 睡眠をとると睡眠度が0になる
    public void sleep(){
        if(!this.isAlive()) return;
        this.sleepPercent = 0;
    }

    // 睡眠不足の状態にするメソッド
    public void setAsSleepy(){
        if(!this.isAlive()) return;
        this.sleepPercent = 0;
    }

    // 睡眠不足かどうかを判定するメソッド
    public boolean isSleepy(){
        return this.sleepPercent >= 70;
    }

    // 動物を死亡させるメソッド
    // 睡眠度と空腹度を0にし、死亡時間を現在の時刻を設定する
    public void die(){
        this.sleepPercent = 0;
        this.hungerPercent = 0;
        this.deathTime = Instant.now();
    }

    // 動物が生きているかどうか判定するメソッド
    // 死亡時間がnullの場合に生きていると判断
    public boolean isAlive(){
        return this.deathTime == null;
    }

    // 動物が移動するメソッド
    // 死亡していない場合はメッセージを出力する
    public void move(){
        if(!this.isAlive()) return;
        System.out.println("This animal just moved");
    }

    @Override
    public String toString(){
        return this.species + this.bmi + " lives " + this.lifeSpanDays + " days/" + "gender:" + this.biologicalSex + "." + this.status();
    }

    public String status(){
        return this.species + " status:" + " Hunger - " + this.hungerPercent + "%, " + "sleepiness:"+this.sleepPercent + "%" + ", Alive - " + this.isAlive() + ". First created at " + this.dateCreated();
    }

    public String dateCreated(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        return formatter.format(this.spawnTime);
    }
}