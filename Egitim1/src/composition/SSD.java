package composition;

public class SSD {

    private double memorySize;
    private String brand;
    private double inch;


    public SSD(double memorySize, String brand, double inch){
        this.brand = brand;
        this.memorySize = memorySize;
        this.inch = inch;
        System.out.println("SSD olusturuldu. SSD brand : "+ brand);
    }

    public double getMemorySize() {
        return memorySize;
    }
    public void setMemorySize(double memorySize) {
        this.memorySize = memorySize;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getInch() {
        return inch;
    }
    public void setInch(double inch) {
        this.inch = inch;
    }

    public void loadSSD(){
        System.out.println("SSD loaded.");
    }

}
