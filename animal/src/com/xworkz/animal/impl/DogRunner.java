package com.xworkz.animal.impl;

import com.xworkz.animal.dog.Animal;
import com.xworkz.animal.dog.Dog;

public abstract class DogRunner extends Object implements Animal {
    public static void main(String[] args) {

        Animal animal= new Dog();
        animal.bark();

        System.out.println("dog name is :"+ dogName);
    }
}
