package com.xworkz.medicalImpl;

import java.util.Arrays;

public class MedicalShop {

    String shopName;
    String[] tablets;
    int price;
    BrandName brandName;
    Medicine medicine;


    public MedicalShop(String shopName, String[] tablets, int price, BrandName brandName, Medicine medicine) {
        this.shopName = shopName;
        this.tablets = tablets;
        this.price = price;
        this.brandName = brandName;
        this.medicine = medicine;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MedicalShop)
        {
            MedicalShop medicalShop= (MedicalShop) obj;
            if(this.tablets == medicalShop.tablets);
            {
                return true;
            }
        }
        return super.equals(obj);
    }

    public void tabletDispenser()
    {
        System.out.println("tabletDispenser will dispense tablet on time...");
    }

    public void tonic()
    {
        System.out.println("dispensing tonic....");
    }

    @Override
    public String toString() {
        return super.toString()+
                ", shopname:"+ this.shopName +
                ", tablets:"+ Arrays.toString(this.tablets) +
                ", price:"+ this.brandName +
                ", medicine:"+ this.medicine;
    }
}
