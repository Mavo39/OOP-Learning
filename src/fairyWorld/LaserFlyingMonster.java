package fairyWorld;
import java.util.Arrays;

class LaserFlyingMonster extends LaserHighTierMonster implements Fly, FlyingMonster {
    protected int flyingSpeed;
    protected Skill[] flyingSkills;

    public LaserFlyingMonster(int hp, int attack, int defense, int level, int points, int movementSpeed, int flyingSpeed){
        super(hp, attack, defense, level, points, movementSpeed);
        this.flyingSpeed = flyingSpeed;
    }

    public LaserFlyingMonster(int level){
        super(level);
        this.flyingSpeed = level * LaserFlyingMonster.MULTIPLIERS[4];
    }

    @Override
    protected void setInitialSkills(){
        Skill[] s = {new Skill(this.attack, "Generic attack"), new Skill(this.attack*2, "Generic side attack"), new Skill(this.attack*3, "Generic side attack 2")};
        this.setSpecialSkills(s);

        Skill[] fs = {new Skill(this.attack, "Generic fly attack"), new Skill(this.attack*2, "Generic side fly attack"), new Skill(this.attack*3, "Generic side fly attack 2")};
        this.setFlyingSkills(fs);
    }

    protected void setFlyingSkills(Skill[] skills){
        this.flyingSkills = skills;
    }

    @Override
    public Skill mainFlySkill(){
        return this.flyingSkills[0];
    };

    @Override
    public Skill[] flySideSkills(){
        return Arrays.copyOfRange(this.flyingSkills, 1, this.flyingSkills.length);
    };

    @Override
    public Skill[] getFlyingSkills(){
        return this.flyingSkills;
    };

    @Override
    public int getFlySpeed(){
        return this.flyingSpeed;
    };

    @Override
    public String flyAnimation(){
        return "The monster flaps its wings to fly";
    };

    @Override
    public String fly(){
        return "This object flies. " + this.flyAnimation();
    };

    @Override
    public String getMonsterName(){
        return "Generic Flying Monster";
    }
}