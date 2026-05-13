package com.xworkz.task.inner.impl;

import com.xworkz.task.inner.SuperMarket;

public class Dmart implements SuperMarket {

    @Override
    public void purchase() {
        System.out.println("purchase items in supermarket..");
    }

    @Override
    public void discount() {
        System.out.println("running discount is Producer... ");
    }
}
