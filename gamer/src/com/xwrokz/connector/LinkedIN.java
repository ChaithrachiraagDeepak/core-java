package com.xwrokz.connector;

public class LinkedIN extends Object implements JobPortal{



    public LinkedIN()
    {
        System.out.println("mo-arg constructor...of lkdin");
    }

    @Override
    public void search() {
        System.out.println("running serach in linkedin");
    }
}
