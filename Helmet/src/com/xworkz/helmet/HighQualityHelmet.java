package com.xworkz.helmet;

public class HighQualityHelmet {
   public  String material;


    public HighQualityHelmet(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", material:"+material;
    }
}
