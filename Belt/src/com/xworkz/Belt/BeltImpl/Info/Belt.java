package com.xworkz.Belt.BeltImpl.Info;

import java.util.Arrays;

public class Belt {

    public String brand;
   public   String[] colour;
   public int pice;
   public Types types;
   public BeltInformation beltInformation;

    public Belt(String brand, String[] colour, int pice, Types types, BeltInformation beltInformation) {
        this.brand = brand;
        this.colour = colour;
        this.pice = pice;
        this.types = types;
        this.beltInformation = beltInformation;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Belt)
        {
            Belt belt= (Belt)obj;
            if(this.types == belt.types)
            {
                    return true;
            }
        }
        return super.equals(obj);
    }

    public void wear()
    {
        System.out.println("executing wear in belt...");
    }

    public void show()
    {
        System.out.println("executing show in belt..");
    }

    @Override
    public String toString() {
        return super.toString()+
        ", brand:"+ this.brand +
        ", colour:"+ Arrays.toString(this.colour) +
        ", price:"+ this.pice+
        ", types:"+ this.types +
        ", beltinfomation:" + this.beltInformation;
    }
}
