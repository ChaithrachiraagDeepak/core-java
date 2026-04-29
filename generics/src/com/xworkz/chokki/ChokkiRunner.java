package com.xworkz.chokki;

public class ChokkiRunner {

    public static void main(String[] args) {


        Chokki<String> chokki= new Chokki<>();
        chokki.get("Tropica");

        String str = chokki.set();
        System.out.println(str);
    }
}
