package fairyWorld;

class AntarcticaLaserTagMonsterFactory implements LaserTagMonsterFactory {
    // 関数の戻り値の型をインターフェース型にすることによって、呼び出し側が具体的な実装に依存せず、ポリモーフィズムを実現
    @Override
    public LowTierMonster createLowTierMonster(){
        return new AntarcticaLowTierMonster(RandomWrapper.getRanInt(1,20));
    };

    @Override
    public MidTierMonster createMidTierMonster(){
        return new AntarcticaMidTierMonster(RandomWrapper.getRanInt(5,30));
    };

    @Override
    public HighTierMonster createHighTierMonster(){
        return new AntarcticaHighTierMonster(RandomWrapper.getRanInt(15,50));
    };

    @Override
    public FlyingMonster createFlyingMonster(){
        return new AntarcticaFlyingMonster(RandomWrapper.getRanInt(15,50));
    };

    @Override
    public HybridMonster createHybridMonster(){
        return new AntarcticaHybridMonster(RandomWrapper.getRanInt(15,50));
    };

    @Override
    public FinalBossMonster createFinalBossMonster(){
        return new AntarcticaFinalBossMonster(RandomWrapper.getRanInt(40,100));
    };
}