package com.xworkz.movie;

public class FlimInfo {
    String movieName;

    public FlimInfo(String movieName) {
        this.movieName = movieName;
    }


    @Override
    public String toString() {
        return super.toString()+
                ", movie names:"+ this.movieName;
    }
}
