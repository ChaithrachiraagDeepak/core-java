package com.xworkz.sliper.SlipperRunner;

import com.xworkz.sliper.Brand;
import com.xworkz.sliper.Material;
import com.xworkz.sliper.Slipper;
import com.xworkz.sliper.SlipperInfo;

import javax.swing.plaf.SliderUI;

public class RunnerSlipper {
    public static void main(String[] args) {
        Material material= new Material("adidas");

        SlipperInfo slipperInfo= new SlipperInfo(400, true, new String[]{"black", "white"}, Brand.BATA, material);
        System.out.println(slipperInfo);

        slipperInfo.wallk();
        slipperInfo.gift();
        System.out.println("------------------------");

    }
}
