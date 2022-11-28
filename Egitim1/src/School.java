import com.tolgaocal80.egitim.Ogrenci;

public class School {

    public static void main(String[] args) {
        /*
        koksal ın boyu 188  olsun.
        Ve boyunu bir degiskeni ata ve
        bu degiskenin degerini ekrana yazdır.
        sonra koksala biraz odev yaptır. (Fizik 1 den yapsın. ve ismini de ekrana yazdır.)
         */
        Ogrenci ozelSiparisOgrenci = new Ogrenci(185,18,"Türk",75,8,"Hasan");
        System.out.println(ozelSiparisOgrenci.height);


        Ogrenci baskaOgrenci = new Ogrenci("Turk", "Veli");
        System.out.println(baskaOgrenci.weight);


        System.out.println("----------------------------------");

        Ogrenci koksal = new Ogrenci();
        koksal.height = 188;
        koksal.studentName = "Köksal";

        double boy = koksal.height;
        String name = koksal.studentName;
        String lectureName = "Fizik 1";

        koksal.doHomework(lectureName, name);

    }


}
