package com.xworkz.Belt.BeltImpl.Info;

public class BeltInformation {
    boolean quality;


    public BeltInformation(boolean quality) {
        this.quality = quality;
    }





    @Override
    public String toString() {
        return  " quality :"+ this.quality;
    }
}
