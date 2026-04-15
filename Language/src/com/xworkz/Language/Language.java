package com.xworkz.Language;

import java.util.Arrays;

public class Language {

    public String name;
   public int speakers;
    public boolean popular;
    public String[] countries;
    public Types types;


    public Language(String name, int speakers, boolean popular, String[] countries, Types types) {
        this.name = name;
        this.speakers = speakers;
        this.popular = popular;
        this.countries = countries;
        this.types = types;
    }

    public void learn()
    {
        System.out.println("learning..language");
    }

    public void speak()
    {
        System.out.println("we can speak diffrent languages..");
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", speakers=" + speakers +
                ", popular=" + popular +
                ", countries=" + Arrays.toString(countries) +
                ", type=" + types;
    }



}
