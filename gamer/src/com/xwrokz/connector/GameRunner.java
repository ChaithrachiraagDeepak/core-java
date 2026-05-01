package com.xwrokz.connector;

public class GameRunner {


    public static void main(String[] args) {
        JobPortal jobPortal= new LinkedIN();
        jobPortal.search();
    }
}
