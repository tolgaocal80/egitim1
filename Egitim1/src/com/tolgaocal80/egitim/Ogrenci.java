package com.tolgaocal80.egitim;

import javax.sound.midi.Soundbank;

public class Ogrenci {

    // variables
    /*
    com.tolgaocal80.egitim.Ogrenci sinifindan olusturulan her nesne (obje)
    aşağıdaki tanımlanan özelliklere sahip olur.
    height,age, nationality, weight, grade
     */

    public double height;
    public int age;
    public String nationality;
    public float weight;
    public int grade;
    public String studentName;


    public Ogrenci(){

    }

    public Ogrenci(String millet, String studentName){
        nationality = millet;
        this.studentName = studentName;
        System.out.println("Ogrenci constructor ı çağrıldı.");
        System.out.println("Ogrenci nesnesi olustu.");
    }

    public Ogrenci(double boy, int yas, String millet, float kilo, int sinif, String studentName){
        height = boy;
        age = yas;
        nationality = millet;
        weight = kilo;
        grade = sinif;
        this.studentName = studentName;
        System.out.println("Ogrenci constructor ı çağrıldı.");
        System.out.println("Ogrenci nesnesi olustu.");
    }


    /*
    com.tolgaocal80.egitim.Ogrenci sinifindan olusturulan her nesne (obje)
    asagidaki methodları kullanir. Çağırabilir.
    Bu methodları gerçekleyebilir.
     */

    // method, function
    public void doHomework(String lectureName){
        System.out.println("com.tolgaocal80.egitim.Ogrenci odevi yapıyor : "+ lectureName);
    }

    public void doHomework(String lectureName, String studentName){
        System.out.println("İsmi :" + studentName + " olan ogrenci odev yapıyor :"+lectureName);
    }

}
