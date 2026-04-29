package com.xworkz.chokki;

public class Chokki<T> {

    T item;

    void get(T item)
    {
        this.item= item;
    }

    T set()
    {
        return item;
    }

}
