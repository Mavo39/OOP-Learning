package game;

class Monster {
    private String monster;
    private int health;
    private int attack;
    private int defense;
    // m→cmに変更
    // private double height = 3;
    private double height = 300;

    public Monster(String monster, int health, int attack, int defense){
        this.monster = monster;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName(){
        return this.monster;
    }

    public double getHeight(){
        return this.height;
    }

    public int getAttack(){
        return this.attack;
    }

    public int getDefense(){
        return this.defense;
    }

    // 他のオブジェクトから攻撃を受けたときのシミュレート
    public void attacked(int hp){
        this.health -= hp;
        if(this.health < 0) this.health = 0;
    }

    @Override
    public String toString(){
        return this.monster + " - HP:" + this.health + "/Atk:" + this.attack + "/Def:" + this.defense + "/height:" + this.height + " meters";
    }
}