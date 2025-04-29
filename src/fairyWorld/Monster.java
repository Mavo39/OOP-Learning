package fairyWorld;

interface Monster {
    abstract public int getHp();
    abstract public int getAttack();
    abstract public int getDefense();
    abstract public int getLevel();
    abstract public int getPoints();
    abstract public int getMovementSpeed();
    abstract public String getMonsterName();
    abstract public String getAppearance();
    abstract public String kill();
    abstract public Skill[] getSpecialSkill();
}