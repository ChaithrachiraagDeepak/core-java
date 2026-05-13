package com.xwrokz.interfaceexample.usage;

import com.xwrokz.interfaceexample.impl.Hospital;

public class User {
    private Hospital hospital;

    User(Hospital hospital){
        this.hospital= hospital;
    }

    public void checkUp()
    {
        System.out.println("checkup is running in user...");

        if(hospital != null)
        {
            hospital.treatment();
        }
    }

}
