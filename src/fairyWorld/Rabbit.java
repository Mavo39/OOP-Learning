package fairyWorld;
import java.util.Arrays;

class Rabbit extends Mammal implements PlayfulPet {
    public static final String SPECIES = "Rabbit";
    public static final double LIFE_EXPECTANCY = 3000;
    public static final double BODY_TEMPERATURE = 40;
    
    private static final double PLAYFUL_HOURLY_COSTS = 30;
    private static final String[] LIKED_ACTIVITIES = {"eat", "nap", "chase", "drink", "jump", "dig"};
    private static final String[] DISLIKED_ACTIVITIES = {"bath", "dressup"};

    public Rabbit(double heightM, double weightKg, String biologicalSex){
        super(Rabbit.SPECIES, heightM, weightKg, Rabbit.LIFE_EXPECTANCY, biologicalSex, Rabbit.BODY_TEMPERATURE);
    }

    @Override
    public String toString(){
        return super.toString() + "\nThis is a rabbit";
    }

    public void woof(){
        System.out.println("Squeak Squeak");
    }

    @Override
    public String getPetName(){
        return this.species;
    }

    @Override
    public String play(){
        return "This rabbit starts jumping around and chases an insect on the grass.";
    }

    @Override
    public String playWithPerson(Person person){
        String s = "The bunny hops towards " + person.getName();
        s += ". After the rabbit stares at " + person.getName() + ", " + person.getName() + " makes the rabbit chase a small carrot. The rabbit hops towards it.";
        return s;
    }

    @Override
    public String playNoise(){
        return "Squeak";
    }

    @Override
    public double getRentalCosts(){
        return Rabbit.PLAYFUL_HOURLY_COSTS;
    }

    @Override
    public boolean likesActivity(String activity){
        return Arrays.asList(Rabbit.LIKED_ACTIVITIES).contains(activity);
    };

    @Override
    public boolean dislikesActivity(String activity){
        return Arrays.asList(Rabbit.DISLIKED_ACTIVITIES).contains(activity);
    };

    @Override
    public String doActivity(String activity){
        if(activity == "eat"){
            this.eat();
            return "The rabbit chew on the food bit by bit taking tiny bites.";
        }
        else if(activity == "nap"){
            this.sleep();
            return "The rabbit took a long nap.";
        }
        else if(this.likesActivity(activity)){
            return ".... The Rabbit really enjoyed the " + activity + " activity.";
        }
        else if(this.likesActivity(activity)){
            return "Squeeeak. The Rabbit did not like " + activity + " activity. The rabbit quickly hopped away";
        }
        return "The rabbit felt indiferent about the " + activity + " activity.";
    };
}