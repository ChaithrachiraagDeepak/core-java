package com.xworkz.task.runner;

import com.xworkz.task.inner.OnePlusBluetooth;
import com.xworkz.task.inner.impl.Bluetooth;
import com.xworkz.task.usage.Device;

public class BluetoothRunner {
    public static void main(String[] args) {

        Bluetooth bluetooth= new OnePlusBluetooth();
        Device device= new Device();
        device.playMusic();
        device.stopMusic();
        device.setBluetooth(bluetooth);
    }
}
