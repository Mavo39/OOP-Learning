package fairyWorld;

class LaserHybridMonster extends LaserFlyingMonster implements HybridMonster {
    protected int ascendSpeed;
    protected int descendSpeed;

    public LaserHybridMonster(int hp, int attack, int defense, int level, int points, int movementSpeed, int flyingSpeed, int ascendSpeed, int descendSpeed){
        super(hp, attack, defense, level, points, movementSpeed, flyingSpeed);
        this.ascendSpeed = ascendSpeed;
        this.descendSpeed = descendSpeed;
    }

    public LaserHybridMonster(int level){
        super(level);
        this.ascendSpeed = level * LaserHybridMonster.MULTIPLIERS[4];
    } 

    @Override
    public int getAscendSpeed(){
        return this.ascendSpeed;
    };

    @Override
    public int getDescendSpeed(){
        return this.descendSpeed;
    };

    @Override
    public String getMonsterName(){
        return "Generic Hybrid Monster";
    }
}