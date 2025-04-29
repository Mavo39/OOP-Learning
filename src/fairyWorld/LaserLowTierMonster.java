package fairyWorld;

class LaserLowTierMonster extends LaserMonster implements LowTierMonster{
    public LaserLowTierMonster(int hp, int attack, int defense, int level, int points, int movementSpeed){
        super(hp, attack, defense, level, points, movementSpeed);
    }

    public LaserLowTierMonster(int level){
        super(level);
    }

    // LowTierMonsterインターフェースの抽象メソッドを実装
    @Override
    public Skill mainSkill(){
        return this.specialSkills[0];
    };

    @Override
    public String getMonsterName(){
        return "Generic Low Tier Monster";
    }
}
