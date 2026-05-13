package com.xworkz.task.runner;

import com.xworkz.task.inner.MenuCard;
import com.xworkz.task.inner.impl.BindedMenuCard;
import com.xworkz.task.usage.Kitchen;

public class KitchenRunner {
    public static void main(String[] args) {

        MenuCard menuCard= new BindedMenuCard();
        Kitchen kitchen= new Kitchen(menuCard);
        kitchen.prepare();
        

        }
    }

