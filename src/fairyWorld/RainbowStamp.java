package fairyWorld;

class RainbowStamp extends GenericStamp{
    private final static String TITLE = "Rainbow";
    private final static String RENDER = "🌈";
    
    public RainbowStamp(String color){
        this.title = RainbowStamp.TITLE;
        this.render = RainbowStamp.RENDER;
        this.color = color;
    } 

    public RainbowStamp(Stamp stamp){
        this.title = RainbowStamp.TITLE;
        this.render = RainbowStamp.RENDER;
        this.color = stamp.getColor();
    }

    @Override
    public Stamp clone(){
        return new RainbowStamp(this);
    }
}