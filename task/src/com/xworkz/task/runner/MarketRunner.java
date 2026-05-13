package com.xworkz.task.runner;

import com.xworkz.task.inner.SuperMarket;
import com.xworkz.task.inner.impl.Dmart;
import com.xworkz.task.usage.Producer;

public class MarketRunner {
    public static void main(String[] args) {

        SuperMarket superMarket= new Dmart();
        Producer producer= new Producer(superMarket);
        producer.shopping();

    }
}
