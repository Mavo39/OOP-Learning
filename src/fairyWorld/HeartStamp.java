package fairyWorld;

class HeartStamp extends GenericStamp{
    private final static String TITLE = "Heart";
    private final static String RENDER = "💖";
    
    public HeartStamp(String color){
        this.title = HeartStamp.TITLE;
        this.render = HeartStamp.RENDER;
        this.color = color;
    } 

    public HeartStamp(Stamp stamp){
        this.title = HeartStamp.TITLE;
        this.render = HeartStamp.RENDER;
        this.color = stamp.getColor();
    }

    @Override
    public Stamp clone(){
        return new HeartStamp(this);
    }
}