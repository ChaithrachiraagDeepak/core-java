package com.xworkz.box;

public class HotBoxRunner {
    public static void main(String[] args) {

        Box<String> box= new Box<>();
        box.set("Hot-box: it keeps items hot");

        String steel  = box.get();
        System.out.println(steel);



        Box<Integer> box1= new Box<>();
        box1.set(599);

        Integer function = box1.get();
        System.out.println(function);


    }
}
