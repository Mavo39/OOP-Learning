package fairyWorld;

class AntarcticaHighTierMonster extends LaserHighTierMonster {
    public AntarcticaHighTierMonster(int hp, int attack, int defense, int level, int points, int movementSpeed){
        super(hp, attack, defense, level, points, movementSpeed);
    }

    public AntarcticaHighTierMonster(int level){
        super(level);
    }

    @Override
    public String getMonsterName(){
        return "Antarctica Ice High Tier Monster";
    }
}