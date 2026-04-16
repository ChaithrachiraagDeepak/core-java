package com.xworkz.movie;

import java.util.Arrays;

public class Movie {

    public String kannada;
    public String telugu;
   public int ticketPrice;
   public boolean good;
    public String[] listTalkies;
   public Snacks snacks;
   public FlimInfo flimInfo;



    public Movie(String kannada, String telugu, int ticketPrice, boolean good, String[] listTalkies, Snacks snacks) {
        this.kannada = kannada;
        this.telugu = telugu;
        this.ticketPrice = ticketPrice;
        this.good = good;
        this.listTalkies = listTalkies;
        this.snacks= snacks;
    }

    public void watch()
    {
        System.out.println("watching kannada movie in talkies...");
    }

    public void display()
    {
        System.out.println("dsiplay horror movie in big screen..");
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Kannada:"+ this.kannada +
                ", Telugu:"+ this.telugu +
                "; ticketPrice:"+ this.ticketPrice +
                ", good:"+ this.good +
                ", listTalkies:"+ Arrays.toString(this.listTalkies)+
                ", snacks:"+ this.snacks+
                ", flimInfo:"+ this.flimInfo;
    }



}
