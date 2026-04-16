package com.xworkz.Concert;

import java.util.Arrays;

public class Concert {

    public String ConcertName;
    public String singer;
    public int entryFee;
    public String[] songlist;
    public Place place;


    public Concert(String concertName, String singer, int entryFee, String[] songlist, Place place) {
       this.ConcertName = concertName;
        this.singer = singer;
        this.entryFee = entryFee;
        this.songlist = songlist;
        this.place = place;
    }

    public void play()
    {
        System.out.println("plays songs...");

    }

    public void sing()
    {
        System.out.println("singing super song in concert..");
    }

    @Override
    public String toString() {
        return super.toString()+
                ",concertName:"+ this.ConcertName +
                ", singer:"+ this.singer +
                ", entryFee:"+ this.entryFee +
                ", song list:"+ this.singer +
                ", place:"+ this.place;
    }
}
