package com.xworkz.medicalImpl;

public class Medicine {
    String color;


    public Medicine(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return super.toString()+
                ",color:"+ this.color;
    }
}
