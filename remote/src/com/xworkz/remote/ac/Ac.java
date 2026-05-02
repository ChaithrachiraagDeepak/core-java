package com.xworkz.remote.ac;

public class Ac extends Object implements Remote {

    public Ac()
    {
        System.out.println("one remote can use for many purposee... and no-arg constructor");
    }

    @Override
    public void play() {
        System.out.println("running play method in AC..");
    }
}
