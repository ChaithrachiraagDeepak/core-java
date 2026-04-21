package com.xworkz.country;

public class CountryStore {
    Country[] countries= new Country[10];
    int index=0;


    void save(Country country)
    {
        System.out.println("executing save in countryStore...");
        if(this.countries != null && country!= null)
        {
            System.out.println("name is not nulll....");
            int index= this.countries.length-1;
            if (this.index<= index)
            {
                this.countries[index]= country;
                this.index++;
            }
        }else {
            System.out.println("array is full u cannot save ....");
        }

    }


    Country findByName(String countryname)
    {
        if(this.countries!= null)
        {
            for(Country countriess: countries)
            {
                if(countriess!= null && countriess.countryname.equals(countryname))
                {
                    return countriess;
                }
            }

        }
        return null;
    }


    State findBystateName (String name)
    {
        for(Country cc: countries)
        {

            if(cc!= null)
            {
                for(State ss: cc.states)
                {
                        if(ss!=null && ss.name.equals(name))
                        {
                            return ss;
                        }
                }
            }
        }
        return null;

    }

    City[] findAllCityByStateName(String name)
    {
        if (this.countries != null)
        {
            for (Country country : countries)
            {
                if (country != null)
                {
                    for (State state : country.states)
                    {
                        if (state != null && state.name.equals(name))
                        {
                            return state.cities;
                        }
                    }
                }
            }
        }
        return null;
    }

    int findNoOfDistrictsByCityName(String name)
    {
        for(Country cc: countries)
        {
            if(cc!= null)
            {
                for(State ss: cc.states)
                {
                    if(ss!= null)
                    {
                        for(City city: ss.cities)
                        {
                            if(city!= null && city.name.equals(name))
                            {
                                return city.noOfDistricts;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }



    Country findByCollectorName(String name)
    {
        for(Country cc: countries)
        {
            if(cc!= null)
            {
                for(State ss: cc.states)
                {
                    if(ss!= null)
                    {
                        for(City city: ss.cities)
                        {
                            if(city!= null)
                            {
                                for(District dd: city.districts)
                                {
                                    if(dd!= null && dd.collector.name.equals(name))
                                    {
                                        return cc;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }












}
