package audible;

class Violin implements Audible {
    private double soundFrequency = 659.3;
    private final static double SOUND_DECIBELS = 95;

    @Override
    public String toString(){
        return "This is a violin that plays music: ";
    }

    @Override
    public void makeNoise(){
        System.out.println("Beep Beep!!");
    }

    @Override
    public double soundFrequency(){
        return this.soundFrequency;
    }

    @Override
    public double soundLevel(){
        return Violin.SOUND_DECIBELS;
    }
}