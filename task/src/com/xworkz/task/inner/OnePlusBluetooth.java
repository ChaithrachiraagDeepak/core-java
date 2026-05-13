package com.xworkz.task.inner;

import com.xworkz.task.inner.impl.Bluetooth;

public class OnePlusBluetooth implements Bluetooth {


    @Override
    public void connect() {
        System.out.println("running connect in oneplus bluetooth...");
    }

    @Override
    public void disconnect() {

        System.out.println("running disconnect in oneplus bluetooth... ");
    }
}
