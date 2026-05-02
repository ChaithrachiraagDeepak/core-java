package com.xworkz.remote.tv;

import com.xworkz.remote.ac.Ac;
import com.xworkz.remote.ac.Remote;

public class RemoteRunner {

    public static void main(String[] args) {
        Remote remote= new Ac();
        remote.play();
    }
}
