package com.xworkz.task.inner.impl;

import com.xworkz.task.inner.MenuCard;

public class BindedMenuCard implements MenuCard {

    public BindedMenuCard(){
    }
    public static BindedMenuCard generateBindedMEnuCard()
    {
        return new BindedMenuCard();
    }

    @Override
    public String[] getItems(int itemId, String itemName) {
        System.out.println("itemID:"+ itemId);
        System.out.println("itemName:"+ itemName);
        System.out.println("items are available in menuCard..");
        return null;
    }
}
