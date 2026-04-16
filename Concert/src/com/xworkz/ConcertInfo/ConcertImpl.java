package com.xworkz.ConcertInfo;

import com.xworkz.Concert.Concert;
import com.xworkz.Concert.Place;

public class ConcertImpl extends Concert {

    String name;


    public ConcertImpl(String concertName, String singer, int entryFee, String[] songlist, Place place, String name) {
        super(concertName, singer, entryFee, songlist, place);
        this.name= name;

    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void sing() {
        super.sing();
    }

    @Override
    public String toString() {
        return super.toString()+
                ", name:"+ this.name;
    }
}
