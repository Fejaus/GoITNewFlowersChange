package com.goit.gojavaonline1;

public class Flower {
    public static void main (String[]args){
        System.out.println("Smell like flower");
    }
    
    List<Astra> astra;
    List<Daisy> daisy;
    List<Rose> rose;
    List<Tulip> tulip;
    List<RoseBush> roseBush;

    public void setAstra(List<Astra> astra) {
        this.astra = astra;
    }

    public List<Astra> getAstra() {
        return astra;
    }

    public void setDaisy(List<Daisy> daisy) {
        this.daisy = daisy;
    }

    public List<Daisy> getDaisy() {
        return daisy;
    }

    public void setRose(List<Rose> rose) {
        this.rose = rose;
    }

    public List<Rose> getRose() {
        return rose;
    }

    public void setTulip(List<Tulip> tulip) {
        this.tulip = tulip;
    }

    public List<Tulip> getTulip() {
        return tulip;
    }

    public void setRoseBush(List<RoseBush> roseBush) {
        this.roseBush = roseBush;
    }

    public List<RoseBush> getRoseBush() {
        return roseBush;
    }

   

       
    }



