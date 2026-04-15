package com.xworkz.sliper;
import java.util.Arrays;
public class Slipper {
     public int cost;
     public boolean quality;
     public  String[] colour;
     Brand brand;
     String material;

    public Slipper(int cost, boolean quality, String[] colour, Brand brand, Material material) {
        this.cost = cost;
        this.quality = quality;
        this.colour = colour;
        this.brand = brand;
        this.material = material;
    }

    public void wallk()
    {
        System.out.println("slippers protect our feets...we can walk wearing slippers");
    }

    public void gift()
    {
        System.out.println("we can give gift to others...");
    }




    @Override
    public String toString() {
        return "cost of slipper=" + this.cost+" ,quality:"+ this.quality+ ", brand:"+this.brand+" ,material:"+this.material;
        return ", colour=" + Arrays.toString(this.colour);
    }
}
