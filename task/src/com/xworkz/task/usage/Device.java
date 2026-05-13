package com.xworkz.task.usage;

import com.xworkz.task.inner.impl.Bluetooth;

public class Device {

    private Bluetooth bluetooth;

    public void setBluetooth(Bluetooth bluetooth)
    {
        this.bluetooth= bluetooth;
    }

    public void playMusic()
    {
        System.out.println("executing playmusic in device...");

        if(bluetooth!=null)
        {
            this.bluetooth.connect();
            System.out.println("playing music using bluetooth...");
        }else{
            System.out.println("bluetooth is not connected....");
        }
    }
    public void stopMusic()
    {
        System.out.println("executing stopMusic in device...");
        if(bluetooth!=null)
        {
            this.bluetooth.disconnect();
            System.out.println("bluetooth is disconnected ...");
        }else{
            System.out.println("bluetooth is not connected...");
        }
    }
}
