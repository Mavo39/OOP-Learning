package fairyWorld;
import java.util.Arrays;

class Pony extends Mammal implements PlayfulPet {
    public static final String SPECIES = "Pony";
    public static final double LIFE_EXPECTANCY = 4000;
    public static final double BODY_TEMPERTURE = 37.5;

    private static final double PLAYFUL_HOURLY_COSTS = 30;
    private static final String[] LIKED_ACTIVITIES = {"eat", "nap", "groom", "drink", "crawl", "explore", "pet"};
    private static final String[] DISLIKED_ACTIVITIES = {"bath", "wait", "run"};

    public Pony(double heightM, double weightKg, String biologicalSex){
        super(Pony.SPECIES, heightM, weightKg, Pony.LIFE_EXPECTANCY, biologicalSex, Pony.BODY_TEMPERTURE);
    }

    @Override
    public String toString(){
        return super.toString() + "\nThis is a Pony.";
    }

    public void neigh(){
        System.out.println("Hiheeen!");
    }

    @Override
    public String getPetName(){
        return this.species;
    }

    @Override
    public String play(){
        return "The pony start to walk.";
    }

    @Override
    public String playWithPerson(Person person){
        String s = "The pony is walking toward " + person.getName();
        s += ". The pony playfully bumps into the " + person.getName();
        return s;
    }

    @Override
    public String playNoise(){
        return "Hiheeeen";
    }

    @Override
    public double getRentalCosts(){
        return Pony.PLAYFUL_HOURLY_COSTS;
    }

    @Override
    public boolean likesActivity(String activity){
        return Arrays.asList(Pony.LIKED_ACTIVITIES).contains(activity);
    }

    @Override
    public boolean dislikesActivity(String activity){
        return Arrays.asList(Pony.DISLIKED_ACTIVITIES).contains(activity);
    }

    @Override
    public String doActivity(String activity){
        // 食べる
        if(activity == "eat"){
            this.eat();
            return "The pony enjoy eating food.";
        }
        // 寝る
        else if(activity == "nap"){
            this.sleep();
            return "The pony took a good nap.";
        }
        // 好きな活動
        else if(this.likesActivity(activity)){
            return "The pony really enjoyed the " + activity + " activity.";
        }
        // 嫌いな活動
        else if(this.dislikesActivity(activity)){
            return "The pony really hated the " + activity + " activity.";
        }
        // その他の活動
        return "The pony felt indifferent about the " + activity + " activity";
    }
}