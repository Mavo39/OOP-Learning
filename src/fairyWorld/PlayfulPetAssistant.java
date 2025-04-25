package fairyWorld;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// ペット用ロボットアシスタントを定義した抽象クラス
// factory method以外は全ての処理が定義されている
abstract class PlayfulPetAssistant {
    protected static final double DEFAULT_RENT_TIME = 1.0;
    protected static final String DEFAULT_TOUR = "all-rounder pack";

    protected Person currentPerson;
    protected double currentRentTime = PlayfulPetAssistant.DEFAULT_RENT_TIME;
    protected static String[] availableActivities = {"eat","walk","drink","nap","pet","run","explore"};
    protected static String[] availableTours = {"all-rounder pack", "deluxe rounder pack"};

    public String[] getActivities(){
        return PlayfulPetAssistant.availableActivities;
    }

    public String[] getAvailableTours(){
        return PlayfulPetAssistant.availableTours;
    }

    // ゲッターメソッドを通じて取得した文字列配列をリスト化し検証
    public boolean isValidTour(String tour){
        return Arrays.asList(this.getAvailableTours()).contains(tour);
    }

    protected String getRandomActivity(){
        List<String> activities = Arrays.asList(this.getActivities());
        int ran = new Random().nextInt(activities.size()); // 指定範囲の乱数を生成
        return activities.get(ran);
    }

    public void setPerson(Person person){
        this.currentPerson = person;
    }

    public void setHours(double hours){
        this.currentRentTime = hours;
    }

    public double getCurrentRentTime(){
        return this.currentRentTime;
    }

    public void reset(){
        this.currentPerson = null;
        this.currentRentTime = PlayfulPetAssistant.DEFAULT_RENT_TIME;
    }

    // ペットをレンタルしている間に、personのサポートに関する全体のアルゴリズムを実行する関数
    public double runAssistanceTour(Person person){
        return this.runAssistanceTour(person, PlayfulPetAssistant.DEFAULT_TOUR);
    }

    // オーバーロード
    public double runAssistanceTour(Person person, String tour){
        if(!this.isValidTour(tour)){
            System.out.println("The tour guide does not accept the " + tour + " tour.");
        }
        // factory methodを使ってペットを作成
        // サブクラスはこのクラスを拡張し、独自のfactory methodを作成して特定のペットを作成する
        // インターフェースに依存している: 具体的なクラスには直接依存していない
        // 実行時に PlayfulPet を実装したクラスのインスタンスが作られ、その参照を PlayfulPet 型の変数で扱う
        // これにより、PlayfulPet のインターフェースを通じて、異なるペットのインスタンスを同じように扱うことができる
        PlayfulPet playfulPet = this.createPlayfulPet();

        System.out.println();
        System.out.println("Booting up... Playful Pet Assistance robot at your service.");
        System.out.println("Printing information about the Person to service...\n" + person);
        System.out.println();
        System.out.println("Printing information about the Playful Pet - " + playfulPet.getPetName() + " to service...\n" + playfulPet);

        if(tour == "all-rounder pack" || tour == "deluxe rounder pack"){
            int count = tour == "all-rounder pack" ? 1 : 3;
            this.genericRounderTour(count, person, playfulPet);
        }

        // ツアーをさらに追加できる
        else {
            System.out.println("The tour assistant robot for " + playfulPet.getPetName() + " and " + person.getName() + " did nothing.");
        }

        double rentalCosts = playfulPet.getRentalCosts() * this.getCurrentRentTime();

        // ツアー終了により、このアシスタンスロボットをリセット
        this.reset();

        // レンタルにかかった費用を返す
        return rentalCosts;
    }

    private void genericRounderTour(int activityCount, Person person, PlayfulPet pet){
        // "System.lineSeparator()"は、どのOSでも適切な改行コードとして使用できるメソッド
        // 自分で "\n" と改行コードを指定すると、OSによって異なる改行コードを指定する必要がある
        String newLine = System.lineSeparator();
        System.out.println(newLine + "Now starting the generic rounder tour with " + activityCount + " activity(s)");
        System.out.println(person.getName() + " greets " + pet.getPetName() + newLine);
        System.out.println(pet.play() + newLine);
        System.out.println(pet.playNoise() + newLine);
        System.out.println(pet.playWithPerson(person) + newLine);
        for(int i = 0; i < activityCount; i++){
            String activity = this.getRandomActivity();
            System.out.println(pet.getPetName() + " will now " + activity);
            System.out.println("--------");
            System.out.println(pet.doActivity(activity));
            System.out.println("--------" + newLine);
        }
    }

    // Factory Method
    public abstract PlayfulPet createPlayfulPet();
}