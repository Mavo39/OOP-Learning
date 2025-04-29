package fairyWorld;

// Low Tierに加えてサブスキルを持つ
interface MidTierMonster extends LowTierMonster {
    abstract public Skill sideSkill();
}