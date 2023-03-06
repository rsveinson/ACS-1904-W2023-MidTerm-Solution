public class Percussion extends Instrument{
    private PercussionInstrument type;


    public Percussion(String brand, double value, PercussionInstrument type) {
        super(brand, value);
        this.type = type;
    }

    public PercussionInstrument getType() {
        return type;
    }

    public void setType(PercussionInstrument type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return this.type.toString();
    }
}
