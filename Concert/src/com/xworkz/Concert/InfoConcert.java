package com.xworkz.Concert;

public class InfoConcert {
    int cost;


    public InfoConcert(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", cost:"+ this.cost;
    }
}
