package composition;

public class CalismaOdasi {

    public static void main(String[] args) {

        RAM myRam = new RAM("Samsung",12,4500);
        GraphicsCard myGC = new GraphicsCard(20.5, "Nvidia");
        CPU myCPU = new CPU("AMD",64, 20.0,7);
        SSD mySSD = new SSD(124, "SanDisk", 3.0);

        Kasa myKasa = new Kasa(myRam,myGC,myCPU,mySSD);

        System.out.println(myKasa.getRAM().getRAMBrand());

        myKasa.startPC("Koksal");
    }

}
