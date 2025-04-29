package fairyWorld;

// Flying Monsterは、High Tierと同様のスキルに加えて、飛行スキルとサブスキルを持
interface FlyingMonster extends HighTierMonster {
    abstract public Skill mainFlySkill();
    abstract public Skill[] flySideSkills();
    abstract public Skill[] getFlyingSkills();
    abstract public int getFlySpeed();
    abstract public String flyAnimation();
}