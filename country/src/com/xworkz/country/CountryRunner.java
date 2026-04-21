package com.xworkz.country;

public class CountryRunner {

    public static void main(String[] args) {

        Collector collector = new Collector("Ravi", 101);

        District district = new District("District1", collector);
        District[] districts = {district};

        City city = new City("Bangalore", 1, districts);
        City[] cities = {city};

        State state = new State("Karnataka", 1000000, cities);
        State[] states = {state};

        Address address = new Address(10, 560001, state);

        President president = new President("Modi", 70, address);

        Country country = new Country("India", president, states);


        System.out.println(country.countryname);
        System.out.println(state.name);
        System.out.println(city.name);
        System.out.println(collector.name);
    }
}
