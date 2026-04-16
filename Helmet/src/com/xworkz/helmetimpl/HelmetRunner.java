package com.xworkz.helmetimpl;

import com.xworkz.helmet.Brand;
import com.xworkz.helmet.Helmet;
import com.xworkz.helmet.HelmetInfo;
import com.xworkz.helmet.HighQualityHelmet;
import javafx.scene.paint.Material;

public class HelmetRunner {
    public static void main(String[] args) {

        HighQualityHelmet highQualityHelmet= new HighQualityHelmet("goodone..");



        Helmet helmet=  new Helmet("metal", new String[]{"balck", "white"}, 999, true, Brand.BELL, highQualityHelmet );
        helmet.safe();
        helmet.protect();
        System.out.println(helmet);
        System.out.println("-------------------------------------------");

        HelmetInfo helmetInfo= new HelmetInfo("plastic", new String[]{"pink", "white"},580,true, Brand.ARAI, "virat", "goodtype", highQualityHelmet);
        helmetInfo.safe();
        helmetInfo.protect();
        System.out.println(helmetInfo);
        System.out.println("---------------------------------------");


    }
}
