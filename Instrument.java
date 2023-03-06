public class Instrument {
    protected String brand;
    protected double value;         //how much it's worth

    public Instrument(){
        brand = "unknown";
        value = 0.0;
    }

    public Instrument(String brand, double value) {
        this.brand = brand;
        this.value = value;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return brand + " $" + value;
    }
}
 