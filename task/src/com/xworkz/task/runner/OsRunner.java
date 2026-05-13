package com.xworkz.task.runner;

import com.xworkz.task.inner.Os;
import com.xworkz.task.inner.impl.Windows;
import com.xworkz.task.usage.Lenovo;

public class OsRunner {
    public static void main(String[] args) {

        Os windows = new Windows();
        Lenovo lenovo= new Lenovo(windows);
        lenovo.runOperatingSystem();



    }
}
