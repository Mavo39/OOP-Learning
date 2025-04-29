package fairyWorld;
import java.util.Arrays;

class LaserHighTierMonster extends LaserMidTierMonster implements HighTierMonster {
    public LaserHighTierMonster(int hp, int attack, int defense, int level, int points, int movementSpeed){
        super(hp, attack, defense, level, points, movementSpeed);
    }

    public LaserHighTierMonster(int level){
        super(level);
    }

    // 1から最後まで全てのスキルを返す
    @Override
    public Skill[] sideSkills(){
        // Arrays.copyOfRange: 指定範囲の配列を新しい配列にコピー
        // 第三引数は"以下"ではなく"未満"
        return Arrays.copyOfRange(this.specialSkills, 1, this.specialSkills.length);
    }

    @Override
    protected void setInitialSkills(){
        Skill[] s = {new Skill(this.attack, "Generic attack"), new Skill(this.attack*2, "Generic side attack"), new Skill(this.attack*3, "Generic side attack 2")};
        this.setSpecialSkills(s);
    }

    @Override
    public String getMonsterName(){
        return "Generic High Tier Monster";
    }
}