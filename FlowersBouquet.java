package com.goit.gojavaonline1;

public class FlowersBouquet extends Flower {
    public static void main (String[]args){
        System.out.println("Multismell");
    }

    List<Flower> flower;

    public void setFlower(List<Flower> flower) {
        this.flower = flower;
    }

    public List<Flower> getFlower() {
        return flower;
    }
}
