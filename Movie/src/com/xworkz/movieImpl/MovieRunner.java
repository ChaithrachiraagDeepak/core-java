package com.xworkz.movieImpl;

import com.xworkz.movie.FlimInfo;
import com.xworkz.movie.Movie;
import com.xworkz.movie.Snacks;

public class MovieRunner {
    public static void main(String[] args) {

        FlimInfo flimInfo=  new FlimInfo("appu");

        Movie movie= new Movie("appu", "hi nana", 579, true, new String[]{"aruna talkies","geethanjali"}, Snacks.CHIPS);
        movie.watch();
        movie.display();
        System.out.println(movie);
        System.out.println("--------------------------------");


        ImplementMovie implementMovie= new ImplementMovie("natasarvabhowma", "madhrasi", 789, true, new String[]{"thrishul", "ashoka"}, Snacks.POPCRON, "nightshow");
        implementMovie.watch();
        implementMovie.display();
        System.out.println(implementMovie);
        System.out.println("-------------------------------------------");

    }
}
