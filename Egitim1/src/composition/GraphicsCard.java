package composition;

public class GraphicsCard {

    private double frequencySize;
    private String brand;

    public GraphicsCard(double frequencySize, String brand) {
        this.frequencySize = frequencySize;
        this.brand = brand;
    }

    public void runGraphicsCard(){
        System.out.println("Graphics cards loaded.");
    }

    public double getFrequencySize() {
        return frequencySize;
    }

    public void setFrequencySize(double frequencySize) {
        this.frequencySize = frequencySize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
