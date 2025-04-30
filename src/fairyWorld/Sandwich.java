package fairyWorld;

class Sandwich {
    // null や未指定の値を受け入れる設計
    // null が格納されても問題ない
    private String doughType;
    private String topping1;
    private String topping2;
    private String topping3;
    private String vegetable1;
    private String vegetable2;
    private String vegetable3;
    private String vegetable4;
    private String vegetable5;
    private double sizeCm;
    private boolean cheese;
    private boolean ketchup;
    private boolean mustard;
    private boolean mayonnaise;
    private String sauce;

    public Sandwich(String doughType, double sizeCm, String topping1, String topping2, String topping3, String vegetable1, String vegetable2, String vegetable3, String vegetable4, String vegetable5, boolean cheese, boolean ketchup, boolean mustard, boolean mayonnaise, String sauce){
        this.doughType = doughType;
        this.sizeCm = sizeCm;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.vegetable1 = vegetable1;
        this.vegetable2 = vegetable2;
        this.vegetable3 = vegetable3;
        this.vegetable4 = vegetable4;
        this.vegetable5 = vegetable5;
        this.cheese = cheese;
        this.ketchup = ketchup;
        this.mustard = mustard;
        this.mayonnaise = mayonnaise;
        this.sauce = sauce;
    }

    @Override
    public String toString(){
        String sandwich = this.doughType + " bread, size " + this.sizeCm + "cm with " + this.topping1 + ", ";
        if(this.topping2 != null) sandwich += this.topping2 + ", ";
        if(this.topping3 != null) sandwich += this.topping3 + ", ";
        if(this.vegetable1 != null) sandwich += this.vegetable1 + ", ";
        if(this.vegetable2 != null) sandwich += this.vegetable2 + ", ";
        if(this.vegetable3 != null) sandwich += this.vegetable3 + ", ";
        if(this.vegetable4 != null) sandwich += this.vegetable4 + ", ";
        if(this.cheese) sandwich += "with cheese, ";
        if(this.ketchup) sandwich += "with ketchup, ";
        if(this.mustard) sandwich += "with mustard, ";
        if(this.mayonnaise) sandwich += "with mayonnaise, ";
        if(this.sauce != null) sandwich += "with " + this.sauce;

        return sandwich;
    }
}