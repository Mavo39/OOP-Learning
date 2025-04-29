package fairyWorld;

// Hybridは上空と地上の両方に対応可能なモンスター
// メインスキルは地上用で、mainFlySkillは飛行用
interface HybridMonster extends FlyingMonster {
    abstract public int getAscendSpeed();  // 上昇速度
    abstract public int getDescendSpeed(); // 下降速度
}