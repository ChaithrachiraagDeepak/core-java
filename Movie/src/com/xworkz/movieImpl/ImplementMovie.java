package com.xworkz.movieImpl;

import com.xworkz.movie.FlimInfo;
import com.xworkz.movie.Movie;
import com.xworkz.movie.Snacks;

public class ImplementMovie extends Movie {


    String time;


    public ImplementMovie(String kannada, String telugu, int ticketPrice, boolean good, String[] listTalkies, Snacks snacks,  String time) {
        super(kannada, telugu, ticketPrice, good, listTalkies, snacks);
        this.time= time;
    }

    @Override
    public void watch() {
        super.watch();
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public String toString() {
        return super.toString()+
                ", time:"+ this.time;
    }
}

