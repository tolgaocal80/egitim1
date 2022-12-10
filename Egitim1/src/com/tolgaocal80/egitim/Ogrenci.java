package com.tolgaocal80.egitim;

import javax.sound.midi.Soundbank;

public class Ogrenci {

    // variables
    /*
    com.tolgaocal80.egitim.Ogrenci sinifindan olusturulan her nesne (obje)
    aşağıdaki tanımlanan özelliklere sahip olur.
    height,age, nationality, weight, grade
     */

    private double height;
    private int age;
    private String nationality;
    private float weight;
    private int grade;
    private String studentName;


    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setWeight(float agirlik){
        if(agirlik > 0){
            weight = agirlik;
            System.out.println("Ogrencinin agirlik degeri atandı");
        }else{
            System.out.println("Agirlık 0 dan kucuk olamaz. Atanmadı.");
        }
    }

    public float getWeight(){
        return this.weight;
    }


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
