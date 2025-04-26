package fairyWorld;
import java.util.Arrays;

class Chicken extends Mammal implements PlayfulPet {
    public static final String SPECIES = "Chicken";
    public static final double LIFE_EXPECTANCY = 3200;
    public static final double BODY_TEMPERATURE = 35;
    
    private static final double PLAYFUL_HOURLY_COSTS = 10;
    private static final String[] LIKED_ACTIVITIES = {"eat","nap","chase","drink","run","explore","pet"};
    private static final String[] DISLIKED_ACTIVITIES = {"hug","stay", "swim"};

    public Chicken(double heightM, double weightKg, String biologicalSex){
        super(Chicken.SPECIES, heightM, weightKg, Chicken.LIFE_EXPECTANCY, biologicalSex, Chicken.BODY_TEMPERATURE);
    }

    @Override
    public String toString(){
        return super.toString() + "\nThis is a Chicken";
    }

    public void cluck(){
        System.out.println("cock-a-doodle-doo");
    }

    @Override
    public String getPetName(){
        return this.species;
    }

    @Override
    public String play(){
        return "This chicken flapped their wings and ran around playfully in the yard.";
    }

    @Override
    public String playWithPerson(Person person){
        String s = "The chicken followed " + person.getName() + ". ";
        s += person.getName() + " gently tossed a small ball, and the chicken ran after it.";
        return s;
    }

    @Override
    public String playNoise(){
        return "cock-a-doodle-doo!!";
    }

    @Override
    public double getRentalCosts(){
        return Chicken.PLAYFUL_HOURLY_COSTS;
    }

    @Override
    public boolean likesActivity(String activity){
        return Arrays.asList(Chicken.LIKED_ACTIVITIES).contains(activity);
    };

    @Override
    public boolean dislikesActivity(String activity){
        return Arrays.asList(Chicken.DISLIKED_ACTIVITIES).contains(activity);
    };

    @Override
    public String doActivity(String activity){
        if(activity == "eat"){
            this.eat();
            return "The chicken ate the entire food in a few bites.";
        }
        else if(activity == "nap"){
            this.sleep();
            return "The chicken took a quick nap.";
        }
        else if(this.likesActivity(activity)){
            return "The chicken really enjoyed the " + activity + " activity.";
        } 
        else if(this.likesActivity(activity)){
            return "The chicken did not like " + activity + " activity.";
        }
        return "The chicken felt indiferent about the " + activity + " activity.";
    };
}