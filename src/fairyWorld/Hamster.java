package fairyWorld;
import java.util.Arrays;

class Hamster extends Mammal implements PlayfulPet {
    public static final String SPECIES = "Hamster";
    public static final double LIFE_EXPECTANCY = 2000;
    public static final double BODY_TEMPERATURE = 36;
    
    private static final double PLAYFUL_HOURLY_COSTS = 25;
    private static final String[] LIKED_ACTIVITIES = {"eat","nap","chase","drink","run","explore","pet"};
    private static final String[] DISLIKED_ACTIVITIES = {"hug", "stay", "swim"};

    public Hamster(double heightM, double weightKg, String biologicalSex){
        super(Hamster.SPECIES, heightM, weightKg, Hamster.LIFE_EXPECTANCY, biologicalSex, Hamster.BODY_TEMPERATURE);
    }

    @Override
    public String toString(){
        return super.toString() + "\nThis is a Hamster";
    }

    public void squeak(){
        System.out.println("chuchu");
    }

    @Override
    public String getPetName(){
        return this.species;
    }

    @Override
    public String play(){
        return "This hamster ran through the tunnels in its cage.";
    }

    @Override
    public String playWithPerson(Person person){
        String s = "The climbed into " + person.getName() + " hands. ";
        s += person.getName() + " gently placed the hamster on the yard and run with it.";
        return s;
    }

    @Override
    public String playNoise(){
        return "chuuchuuu!";
    }

    @Override
    public double getRentalCosts(){
        return Hamster.PLAYFUL_HOURLY_COSTS;
    }

    @Override
    public boolean likesActivity(String activity){
        return Arrays.asList(Hamster.LIKED_ACTIVITIES).contains(activity);
    };

    @Override
    public boolean dislikesActivity(String activity){
        return Arrays.asList(Hamster.DISLIKED_ACTIVITIES).contains(activity);
    };

    @Override
    public String doActivity(String activity){
        if(activity == "eat"){
            this.eat();
            return "The hamster ate the entire food in a few bites.";
        }
        else if(activity == "nap"){
            this.sleep();
            return "The hamster took a quick nap.";
        }
        else if(this.likesActivity(activity)){
            return "The hamster really enjoyed the " + activity + " activity.";
        } 
        else if(this.likesActivity(activity)){
            return "The hamster did not like " + activity + " activity.";
        }
        return "The hamster felt indiferent about the " + activity + " activity.";
    };
}