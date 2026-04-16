package com.xworkz.MedicalShop.medicalImpl;

import com.xworkz.medicalImpl.BrandName;
import com.xworkz.medicalImpl.MedicalShop;
import com.xworkz.medicalImpl.Medicine;

public class ImplementMedical extends MedicalShop {
    String tabletName;
    int cost;


    public ImplementMedical(String shopName, String[] tablets, int price, BrandName brandName, Medicine medicine, String tabletName, int cost) {
        super(shopName, tablets, price, brandName, medicine);
    }

    @Override
    public void tabletDispenser() {
        super.tabletDispenser();
    }


    @Override
    public void tonic() {
        super.tonic();
    }

    @Override
    public String toString() {
        return super.toString()+
                ", tabletName:"+ this.tabletName+
                ", code of tablet:"+ this.cost;
    }
}
