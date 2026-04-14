package com.xworkz.shop.profit;

public interface Shop {



    void flowers();
    void clothes();
    default  void  get(){
        System.out.println("default getting...");
    }
}
