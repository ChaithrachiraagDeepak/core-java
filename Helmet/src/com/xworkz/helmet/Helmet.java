package com.xworkz.helmet;

import javafx.scene.paint.Material;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;

public class Helmet {

    public String type;
    public String[]colour;
    public int cost;
    public boolean safe;
    Brand brand;
    HighQualityHelmet highQualityHelmet;


    public Helmet(String type, String[] colour, int cost, boolean safe, Brand brand, HighQualityHelmet highQualityHelmet) {
        this.type = type;
        this.colour = colour;
        this.cost = cost;
        this.safe = safe;
        this.brand = brand;
        this.highQualityHelmet= highQualityHelmet;
    }

    public void safe()
    {
        System.out.println("wearing helmet is so safe..");
    }

    public void protect()
    {
        System.out.println("helmet protect us....");
    }


    @Override
    public String toString() {
        return super.toString() +
                ", type:"+ this.type +
                ", cost:"+ this.cost +
                ", colour:"+ Arrays.toString(this.colour)+
                ", safe:"+  this.safe +
                ", brand:"+ this.brand +
                ", material:" + this.highQualityHelmet;

    }





}
