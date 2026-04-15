package com.xworkz.sliper;

public class Material {
    String brandName;

    public Material(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "brandName:"+this.brandName;
    }
}
