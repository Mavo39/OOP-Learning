package fairyWorld;

interface LaserTagMonsterFactory {
    abstract public LowTierMonster createLowTierMonster();
    abstract public MidTierMonster createMidTierMonster();
    abstract public HighTierMonster createHighTierMonster();
    abstract public FlyingMonster createFlyingMonster();
    abstract public HybridMonster createHybridMonster();
    abstract public FinalBossMonster createFinalBossMonster();
}