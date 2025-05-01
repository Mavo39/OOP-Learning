package fairyWorld;

class TreeStamp extends GenericStamp{
    private final static String TITLE = "Tree";
    private final static String RENDER = "🌲";
    
    public TreeStamp(String color){
        this.title = TreeStamp.TITLE;
        this.render = TreeStamp.RENDER;
        this.color = color;
    } 

    public TreeStamp(Stamp stamp){
        this.title = TreeStamp.TITLE;
        this.render = TreeStamp.RENDER;
        this.color = stamp.getColor();
    }

    @Override
    public Stamp clone(){
        return new TreeStamp(this);
    }
}