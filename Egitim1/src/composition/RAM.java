package composition;

public class RAM {

    private String RAMBrand;
    private int RAMSize;
    private double frequencySize;


    public void retrieveRAMInformation(){
        System.out.println("RAM{" +
                "RAMBrand='" + RAMBrand + '\'' +
                ", RAMSize=" + RAMSize +
                ", frequencySize=" + frequencySize +
                '}');
    }

    public void loadRAM(){
        System.out.println("RAM loaded.");
    }

    public RAM(String RAMBrand, int RAMSize, double frequencySize) {
        this.RAMBrand = RAMBrand;
        this.RAMSize = RAMSize;
        this.frequencySize = frequencySize;
    }

    public String getRAMBrand() {
        return RAMBrand;
    }

    public void setRAMBrand(String RAMBrand) {
        this.RAMBrand = RAMBrand;
    }

    public int getRAMSize() {
        return RAMSize;
    }

    public void setRAMSize(int RAMSize) {
        this.RAMSize = RAMSize;
    }

    public double getFrequencySize() {
        return frequencySize;
    }

    public void setFrequencySize(double frequencySize) {
        this.frequencySize = frequencySize;
    }
}
