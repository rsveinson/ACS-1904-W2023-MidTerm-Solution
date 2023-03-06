public class Stringed extends Instrument{
    private StringedInstrument type;
    private String model;

    public Stringed(String brand, double value, StringedInstrument type, String model) {
        super(brand, value);
        this.type = type;
        this.model = model;
    }

    public StringedInstrument getType() {
        return type;
    }

    public void setType(StringedInstrument type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(brand + " " + type.toString() + "\n");
        sb.append(model + " has " + type.getString() + " strings \n");
        return sb.toString();
    }
}
