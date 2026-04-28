package com.xworkz.MedicalShop.medicalImpl;

import com.xworkz.medicalImpl.BrandName;
import com.xworkz.medicalImpl.MedicalShop;
import com.xworkz.medicalImpl.Medicine;

public class MedicalShopRunner {
    public static void main(String[] args) {

        Medicine medicine= new Medicine("white");

        MedicalShop medicalShop= new MedicalShop("mediPuls", new String[]{"migrene", "meftal"}, 88, BrandName.FORXIGA, medicine);
        medicalShop.tabletDispenser();
        medicalShop.tonic();
        System.out.println(medicalShop);
        System.out.println("--------------------------------------------");





        ImplementMedical implementMedical= new ImplementMedical("ganesh", new String[]{"dolo650", "chest&cold"}, 90, BrandName.PRACETAMOL, medicine, "daicloran", 50);
        implementMedical.tabletDispenser();
        implementMedical.tonic();
        System.out.println(implementMedical);
        System.out.println("---------------------------------");


        MedicalShop medicalShop1= new MedicalShop("medihouse", new String[]{"chest&cold", "fever"}, 70, BrandName.HERBRESS,medicine);
        MedicalShop medicalShop2= new MedicalShop("medihouse", new String[]{"chest&cold", "fever"}, 70, BrandName.HERBRESS,medicine);

        boolean sameMedi= medicalShop1.equals(medicalShop2);
        System.out.println("medicalshop:"+ sameMedi);

        MedicalShop medicalShop3= new MedicalShop("medipulss", new String[]{"chest&cold", "callfall"}, 70, BrandName.HERBRESS,medicine);
        MedicalShop medicalShop4= new MedicalShop("medihouse", new String[]{"chest&cold", "nicip"}, 70, BrandName.HERBRESS,medicine);

        boolean check= medicalShop3.equals(medicalShop4);
        System.out.println("checking medicalshop..:"+check);

    }
}
