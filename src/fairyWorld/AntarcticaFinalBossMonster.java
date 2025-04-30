package fairyWorld;

class AntarcticaFinalBossMonster extends LaserFinalBossMonster {
    public AntarcticaFinalBossMonster(int hp, int attack, int defense, int level, int points, int movementSpeed){
        super(hp, attack, defense, level, points, movementSpeed);
    }

    public AntarcticaFinalBossMonster(int level){
        super(level);
    }

    @Override
    public String getMonsterName(){
       return "Antarctica Ice Final Boss Monster";
    }
}