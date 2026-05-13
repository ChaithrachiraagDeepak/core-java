package com.xworkz.task.inner.impl;

import com.xworkz.task.inner.Os;

public class Windows implements Os {
    @Override
    public void restart() {
        System.out.println("running restart in windows..");
    }

    @Override
    public void update() {
        System.out.println("running update in windows..");
    }

    @Override
    public void buffer() {
        System.out.println("running buffer in windows...");
    }
}
