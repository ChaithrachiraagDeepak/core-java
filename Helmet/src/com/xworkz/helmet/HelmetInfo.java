package com.xworkz.helmet;


import javafx.scene.paint.Material;

public class HelmetInfo extends Helmet{

    String name;
    String types;


    public HelmetInfo(String type, String[] colour, int cost, boolean safe, Brand brand, String name, String types, HighQualityHelmet highQualityHelmet) {
        super(type, colour, cost, safe, brand, highQualityHelmet);

        this.name= name;
        this.types= types;

    }

    @Override
    public void safe() {
        super.safe();
    }

    @Override
    public void protect() {
        super.protect();
    }

    @Override
    public String toString() {
        return super.toString()+
        ", name:"+ this.name +
        ", types:"+ this.types;
    }
}
