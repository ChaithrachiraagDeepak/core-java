package com.xworkz.Belt.BeltInfo;

import com.xworkz.Belt.BeltImpl.Info.Belt;
import com.xworkz.Belt.BeltImpl.Info.BeltInformation;
import com.xworkz.Belt.BeltImpl.Info.Types;

import java.util.Arrays;

public class BeltImplement extends Belt {
    String warranty;
    double cost;


    public BeltImplement(String brand, String[] colour, int pice, Types types, BeltInformation beltInformation, String warranty, double cost) {
        super(brand, colour, pice, types, beltInformation);
    }


    @Override
    public void wear() {
        super.wear();
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public String toString() {
        return super.toString()+
                ",warranty:"+ this.warranty +
                ", cost:"+ this.cost;
    }
}
