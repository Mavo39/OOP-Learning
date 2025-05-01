package fairyWorld;

class StarStamp extends GenericStamp {
    private final static String TITLE = "Star";
    private final static String RENDER = "⭐";

    public StarStamp(String color){
        this.title = StarStamp.TITLE;
        this.render = StarStamp.RENDER;
        this.color = color;
    } 

    public StarStamp(Stamp stamp){
        this.title = StarStamp.TITLE;
        this.render = StarStamp.RENDER;
        this.color = stamp.getColor();
    }

    @Override
    public Stamp clone(){
        return new StarStamp(this.getColor());
    }
}