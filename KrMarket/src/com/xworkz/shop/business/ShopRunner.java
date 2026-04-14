package com.xworkz.shop.business;

import com.xworkz.shop.profit.Shop;
import com.xworkz.shop.profit.impl.BoquetShopImpl;

public class ShopRunner {

    public static void main(String[] args) {
        BoquetShopImpl boquetShop= new BoquetShopImpl() ;
        boquetShop.flowers();
        boquetShop.clothes();
        boquetShop.get();


    }

}
