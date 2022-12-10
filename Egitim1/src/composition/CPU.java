package composition;

public class CPU {
    private String brand;
    private int architect;
    private double cache;
    private double transistorSize;

    public void loadCPU(){
        System.out.println("CPU Loaded.");
    }

    /*
    access modifiers (erişim belirleyici)
    public, private, protected, -
    */

    public CPU(String brand, int architect, double cache, double transistorSize){
        this.brand = brand;
        this.architect = architect;
        this.cache = cache;
        this.transistorSize = transistorSize;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getArchitect() {
        return architect;
    }

    public void setArchitect(int architect) {
        this.architect = architect;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public double getTransistorSize() {
        return transistorSize;
    }

    public void setTransistorSize(double transistorSize) {
        this.transistorSize = transistorSize;
    }
}
