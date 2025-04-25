package fairyWorld;
import java.util.Arrays;

// extendsとimplementsはextendsが優先される
class Cat extends Mammal implements PlayfulPet {
    public static final String SPECIES = "Cat";
    public static final double LIFE_EXPECTANCY = 5500;
    public static final double BODY_TEMPERATURE = 37;

    private static final double PLAYFUL_HOURLY_COSTS = 50;
    private static final String[] LIKED_ACTIVITIES = {"eat", "nap", "groom", "drink", "crawl", "explore", "pet"};
    private static final String[] DISLIKED_ACTIVITIES = {"bath"};

    public Cat(double heightM, double weightKg, String biologicalSex){
        super(Cat.SPECIES, heightM, weightKg, Cat.LIFE_EXPECTANCY, biologicalSex, Cat.BODY_TEMPERATURE);
    }

    @Override
    public String toString(){
        return super.toString() + "\nThis is a cat."; 
    }

    public void meow(){
        System.out.println("Meooow");
    }

    @Override
    public String getPetName(){
        return this.species;
    }

    @Override
    public String play(){
        return "This cat starts rolling on the floor, and pretends to be predator";
    }

    @Override
    public String playWithPerson(Person person){
        String s = "The cat stared at " + person.getName();
        s += ". After taking kin to " + person.getName() + ", " + person.getName() + " throws a mouse toy at this cat and the cat starts chasing the mouse toy";
        return s;
    }

    @Override
    public String playNoise(){
        return "Meow";
    }

    @Override
    public double getRentalCosts(){
        return Cat.PLAYFUL_HOURLY_COSTS;
    }

    // List.contains()でリスト内を順番に走査（線形探索）
    @Override
    public boolean likesActivity(String activity){
        return Arrays.asList(Cat.LIKED_ACTIVITIES).contains(activity);
    }

    @Override
    public boolean dislikesActivity(String activity){
        return Arrays.asList(Cat.DISLIKED_ACTIVITIES).contains(activity);
    }

    @Override
    public String doActivity(String activity){
        // 既に親クラスで定義されているメソッドは使用する(eat,sleep)
        if(activity == "eat"){
            this.eat();
            return "The cat enjoy eating food.";
        }
        else if(activity == "nap"){
            this.sleep();
            return "The cat took a good nap.";
        }
        // 好きな活動
        else if(this.likesActivity(activity)){
            return "Meow. The cat really enjoyed the " + activity + " activity.";
        }
        // 嫌いな活動
        else if(this.dislikesActivity(activity)){
            return "The cat really hated the " + activity + " activity.";
        }
        // その他の活動
        return "The cat felt indifferent about the " + activity + " activity";
    }
}