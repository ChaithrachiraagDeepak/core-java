package com.xwrokz.interfaceexample.usage;

import com.xwrokz.interfaceexample.impl.AppoloHospital;
import com.xwrokz.interfaceexample.impl.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {

        Hospital hospital= new AppoloHospital();
        User user= new User(hospital);

        user.checkUp();
    }
}
