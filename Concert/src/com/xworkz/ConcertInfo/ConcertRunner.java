package com.xworkz.ConcertInfo;

import com.xworkz.Concert.Concert;
import com.xworkz.Concert.InfoConcert;
import com.xworkz.Concert.Place;

public class ConcertRunner {
    public static void main(String[] args) {

        InfoConcert infoConcert= new InfoConcert(800);

        Concert concert= new Concert("archarya", "sanjithHegde", 750, new String[]{"kannada", "telugu"}, Place.DAVANAGERE);
        concert.play();
        concert.sing();
        System.out.println(concert);
        System.out.println("--------------------");


        ConcertImpl concert1= new ConcertImpl("malika", "arujunjanya", 500, new String[]{"tamil", "english"}, Place.BANGLORE, "female");
        concert1.play();
        concert1.sing();
        System.out.println(concert1);
        System.out.println("-----------------------------");




    }
}
