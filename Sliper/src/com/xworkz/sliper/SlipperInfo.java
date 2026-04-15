package com.xworkz.sliper;

public class SlipperInfo extends Slipper{

    public String type;
    public String  style;

    public SlipperInfo(int cost, boolean quality, String[] colour, Brand brand, Material material) {
        super(cost, quality, colour, brand, material);
    }


    @Override
    public void wallk() {
        super.wallk();
    }

    @Override
    public void gift() {
        super.gift();
    }

    @Override
    public String toString() {
        return  "type of slipper:"+ this.style+ "style of slippers:"+this.style;
    }
}
