package com.tolgaocal80.egitim;

public class Hayvan {

    private int legCount;
    private int brainCount;
    private double lifeSpan;

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public int getBrainCount() {
        return brainCount;
    }

    public void setBrainCount(int brainCount) {
        this.brainCount = brainCount;
    }

    public double getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(double lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public void feedAnimal(String food){
        System.out.println("Animal eating : "+food);
    }
    public void feedAnimal(String food, int miktar){
        System.out.println("Animal eating : "+food + " food size : "+miktar);
    }


    public void rest(){
        System.out.println("Animal is resting.");
    }
    public void move(){
        System.out.println("Animal is moving.");
    }
    public void breeding(){
        System.out.println("Animal is breeding.");
    }


}
