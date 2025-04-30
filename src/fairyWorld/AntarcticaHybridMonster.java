package fairyWorld;

class AntarcticaHybridMonster extends LaserHybridMonster {
    public AntarcticaHybridMonster(int hp, int attack, int defense, int level, int points, int movementSpeed, int flyingSpeed, int ascendSpeed, int descendSpeed){
        super(hp, attack, defense, level, points, movementSpeed, flyingSpeed, ascendSpeed, descendSpeed);
    }

    public AntarcticaHybridMonster(int level){
        super(level);
    }

    @Override
    public String getMonsterName(){
        return "Antarctica Ice Hybrid Monster";
    }
}