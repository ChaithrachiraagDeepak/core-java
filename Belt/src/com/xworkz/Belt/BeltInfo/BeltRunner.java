package com.xworkz.Belt.BeltInfo;

import com.xworkz.Belt.BeltImpl.Info.Belt;
import com.xworkz.Belt.BeltImpl.Info.BeltInformation;
import com.xworkz.Belt.BeltImpl.Info.Types;

public class BeltRunner {
    public static void main(String[] args) {

        BeltInformation beltInformation= new BeltInformation(true);

        Belt belt= new Belt("mastermind", new String[]{"brown", "black"}, 700, Types.LATHER, beltInformation);
        belt.wear();
        belt.show();
        System.out.println(belt);
        System.out.println("----------------------------------------");


        BeltImplement beltImplement=  new BeltImplement("GUCCI", new String[]{"merun", "darkbblue"}, 800, Types.NONlAYTHER, beltInformation, "1year", 0.45);
        beltImplement.wear();
        beltImplement.show();
        System.out.println(beltImplement);
        System.out.println("--------------------------------------------");



    }
}
