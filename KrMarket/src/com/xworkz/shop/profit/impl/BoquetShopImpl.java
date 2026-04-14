package com.xworkz.shop.profit.impl;

import com.xworkz.shop.profit.Shop;

public class BoquetShopImpl implements Shop {


    @Override
    public void flowers() {
        System.out.println("we are solding diffrent types of flowers boquet with lower price...");
    }

    @Override
    public void clothes() {
        System.out.println("solding clothes ...");
    }
}
