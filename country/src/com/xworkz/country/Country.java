package com.xworkz.country;

public class Country {
    String countryname;
    President president;
    State[] states;

    public Country(String countryname, President president, State[] states) {
        this.countryname = countryname;
        this.president = president;
        this.states = states;
    }
}
