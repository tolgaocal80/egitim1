package com.tolgaocal80.egitim;

public class Kedi extends Hayvan{

    private String colour;
    private double age;

    public void feedAnimal(String food){
        System.out.println("Cat eating : "+food);
    }

    public void meeowing(){
        System.out.println("com.tolgaocal80.egitim.Kedi is meeowing");
    }

    public void eatFood(String food){
        System.out.println("com.tolgaocal80.egitim.Kedi is eaitng : "+food);
    }

}
