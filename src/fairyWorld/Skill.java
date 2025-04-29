package fairyWorld;

// キャラクターのスキル
class Skill {
    protected int damage;
    protected String description;

    public Skill(int damage, String description){
        this.damage = damage;
        this.description = description;
    }

    public int getDamage(){
        return this.damage;
    }

    public String getDescription(){
        return this.description;
    }
}