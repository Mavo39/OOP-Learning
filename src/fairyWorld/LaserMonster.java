package fairyWorld;

// Monsterインターフェースを実装した汎用的な具象クラス
// クラスはこれらをサブクラス化し、必要に応じて機能を編集できる
class LaserMonster implements Monster {
    protected static int[] MULTIPLIERS = {100,20,30,5,1};
    protected String monsterName;
    protected int hp;
    protected int attack;
    protected int defense;
    protected int level;
    protected int points;
    protected int movementSpeed;
    protected Skill[] specialSkills;

    // 全ての状態あるいはレベルを渡すことでモンスターの内部状態を作る
    public LaserMonster(int hp, int attack, int defense, int level, int points, int movementSpeed){
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.level = level;
        this.points = points;
        this.movementSpeed = movementSpeed;
        this.setInitialSkills();
    }

    public LaserMonster(int level){
        this.hp = level * LaserMonster.MULTIPLIERS[0];
        this.attack = level * LaserMonster.MULTIPLIERS[1];
        this.defense = level * LaserMonster.MULTIPLIERS[2];
        this.level = level;
        this.points = level * level * LaserMonster.MULTIPLIERS[3];
        this.movementSpeed = level * LaserMonster.MULTIPLIERS[4];
        this.setInitialSkills();
    }

    // 初期スキルを設定
    // このメソッドは、カスタムスキルを設定できるようにサブクラス化され上書きされる必要がある
    protected void setInitialSkills(){
        Skill[] skills = {new Skill(this.attack, "Generic attack")};
        this.setSpecialSkills(skills);
    }

    // メソッドを追加/削除
    // protectedにすることで、同じクラス、同じパッケージ内のクラス、およびサブクラスからアクセス可能
    protected void setSpecialSkills(Skill[] skills){
        this.specialSkills = skills;
    }

    @Override
    public int getHp(){
        return this.hp;
    }

    @Override
    public int getAttack(){
        return this.attack;
    }

    @Override
    public int getDefense(){
        return this.defense;
    }

    @Override
    public int getPoints(){
        return this.points;
    }

    @Override
    public int getLevel(){
        return this.level;
    }

    @Override
    public int getMovementSpeed(){
        return this.movementSpeed;
    }

    @Override
    public String getMonsterName(){
        return "Generic Monster";
    }

    @Override
    public String getAppearance(){
        return "Grey block monster with a ? as its texture.";
    }

    @Override
    public String kill(){
        this.hp = 0;
        return this.toString() + " died. The body drops and disappears from the screen in 2 seconds.";
    }

    @Override
    public Skill[] getSpecialSkill(){
        return this.specialSkills;
    }

    @Override
    public String toString(){
        return this.getMonsterName() + "\n hp: " + this.hp + "\n atk: " + this.attack + "\n def: " + this.defense + "\n lvl: " + this.level;
    }
}
