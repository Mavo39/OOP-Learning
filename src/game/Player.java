package game;

class Player {
    private String username;
    private int health;
    private int attack;
    private int defense;
    private double height = 1.8;
    private int gold;

    public Player(String username, int health, int attack, int defense, int gold){
        this.username = username;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.gold = gold;
    }

    public double getHeight(){
        return this.height;
    }

    // attackメソッドはMonsterクラスに依存している
    // Monsterオブジェクトを引数にとり、そのMonsterオブジェクトに対する攻撃をシミュレートする
    public void attack(Monster monster){
        System.out.println(this.username + " Attacks " + monster.getName());

        // Monsterの高さがPlayerの高さの3倍以上、またはMonsterの防御力がPlayerの攻撃力以上の場合、攻撃が無効になる
        if(monster.getHeight() >= this.height * 3 || this.attack <= monster.getDefense()) return;
        // それ以外の場合、Playerの攻撃からMonsterの防御力を引いた数値がMonsterのHPから引かれる
        monster.attacked(this.attack - monster.getDefense());
    }
    // Monsterのheightがmからcmに変わったことにより影響が出る

    @Override
    public String toString(){
        return "Player " + this.username + " - HP:" + this.health + "/Atk:" + this.attack + this.defense + "/Gold:" + this.gold + "/height:" + this.height + " meters";
    }
}