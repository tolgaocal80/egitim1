package composition;

public class Kasa{
    private RAM ram1;
    private GraphicsCard graphicsCard;
    private CPU cpu1;
    private SSD ssd1;

    public Kasa(RAM sikis, GraphicsCard sokus, CPU cpu, SSD ssd1){
        ram1 = sikis;
        graphicsCard = sokus;
        cpu1 = cpu;
        this.ssd1 = ssd1;
    }

    public void startPC(String user){
        System.out.println("User "+ user + " starting PC...");
    }


    public void setRAM(RAM ram1){
        this.ram1 = ram1;
    }
    public RAM getRAM(){
        return ram1;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard){
        this.graphicsCard = graphicsCard;
    }
    public GraphicsCard getGraphicsCard(){
        return graphicsCard;
    }
    public CPU getCpu1() {
        return cpu1;
    }
    public void setCpu1(CPU cpu1) {
        this.cpu1 = cpu1;
    }
    public SSD getSsd1() {
        return ssd1;
    }
    public void setSsd1(SSD ssd1) {
        this.ssd1 = ssd1;
    }

    /*
    * RAM
    * Graphics Card
    * CPU
    * SSD
    * */
}
