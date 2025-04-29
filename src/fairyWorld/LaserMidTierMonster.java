package fairyWorld;

class LaserMidTierMonster extends LaserLowTierMonster implements MidTierMonster {
    public LaserMidTierMonster(int hp, int attack, int defense, int level, int points, int movementSpeed){
        super(hp, attack, defense, level, points, movementSpeed);
    }

    public LaserMidTierMonster(int level){
        super(level);
    }

    // MidTierMonsterインターフェースの抽象メソッドを実装
    @Override
    public Skill sideSkill(){
        return this.specialSkills[1];
    };

    protected void setInitialSkills(){
        Skill[] s = {new Skill(this.attack, "Generic attack"), new Skill(this.attack*2, "Generic side attack")};
        this.setSpecialSkills(s);
    }

    @Override
    public String getMonsterName(){
        return "Generic Mid Tier Monster";
    }
}