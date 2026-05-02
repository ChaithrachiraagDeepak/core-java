package com.xworkz.animal.dog;

public class Dog extends Object implements Animal{

    public Dog()
    {
        System.out.println("no-arg animal constructor in dog cls..");
    }

    @Override
    public void bark() {
        System.out.println("running bark in dog cls ...");
    }
}
