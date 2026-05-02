package com.xworkz.application.apps;

public class Apps extends Object implements Server{
    
    public Apps()
    {
        System.out.println("no-arg constructor in apps...");
    }

    @Override
    public void network() {
        System.out.println("running network in apps...");
    }
}
