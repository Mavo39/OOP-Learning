package fairyWorld;

// Final Bossは、High Tierモンスターより上位の存在
// 複数の状態を持っており、プレイヤーがしばらくの間攻撃せず、HPが回復した場合、前の状態に戻る
interface FinalBossMonster extends HighTierMonster {
    abstract public String stageIncrement();
    abstract public String stageDecrement();
}