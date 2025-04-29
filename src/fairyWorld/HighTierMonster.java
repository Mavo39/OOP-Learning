package fairyWorld;

// Mid Tierと同じ、追加として複数のサブスキルを持つ
interface HighTierMonster extends MidTierMonster {
    abstract public Skill[] sideSkills();
}