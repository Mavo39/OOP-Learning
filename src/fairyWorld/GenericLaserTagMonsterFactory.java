package fairyWorld;

class GenericLaserTagMonsterFactory implements LaserTagMonsterFactory {
    @Override
    public LowTierMonster createLowTierMonster(){
        return new LaserLowTierMonster(RandomWrapper.getRanInt(1,20));
    }

    @Override
    public MidTierMonster createMidTierMonster(){
        return new LaserMidTierMonster(RandomWrapper.getRanInt(5,30));
    }

    @Override
    public HighTierMonster createHighTierMonster(){
        return new LaserHighTierMonster(RandomWrapper.getRanInt(15,50));
    }

    @Override
    public FlyingMonster createFlyingMonster(){
        return new LaserFlyingMonster(RandomWrapper.getRanInt(15,50));
    }

    @Override
    public HybridMonster createHybridMonster(){
        return new LaserHybridMonster(RandomWrapper.getRanInt(15,50));
    }

    @Override
    public FinalBossMonster createFinalBossMonster(){
        return new LaserFinalBossMonster(RandomWrapper.getRanInt(40,100));
    }
}