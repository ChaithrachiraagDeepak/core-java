package com.xworkz.task.usage;

import com.xworkz.task.inner.SuperMarket;

public class Producer {

    private SuperMarket superMarket;

    public Producer(SuperMarket superMarket)
    {
        this.superMarket=superMarket;
    }

    public void shopping()
    {
        System.out.println("executing shopping in Producer cls....");
        if(this.superMarket!=null)
        {
            this.superMarket.discount();
            System.out.println("giving discount for some items...");
            this.superMarket.purchase();
            System.out.println("purchase discounted items....");
        }else{
            System.out.println("supermarket ref is nulll...");
        }
    }
}
