package fairyWorld;

// 1つのスキルのみ持つ
interface LowTierMonster extends Monster {
    abstract public Skill mainSkill();
}