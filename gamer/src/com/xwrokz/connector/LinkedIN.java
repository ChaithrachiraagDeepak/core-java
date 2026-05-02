package com.xwrokz.connector;

public class LinkedIN extends Object implements JobPortal{



    public LinkedIN()
    {
        System.out.println("mo-arg constructor.........in lkdin");
    }

    @Override
    public void search() {
        System.out.println("running searchin linkedin");
    }
}
