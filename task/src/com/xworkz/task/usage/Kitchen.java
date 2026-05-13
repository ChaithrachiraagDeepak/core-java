package com.xworkz.task.usage;

import com.xworkz.task.inner.MenuCard;

public class Kitchen {

    private MenuCard menuCard;

    public Kitchen() {
        System.out.println("running no-arg of Kitchen");
    }

    public Kitchen(MenuCard menuCard) {
        this.menuCard = menuCard;
        System.out.println("menuCard parameter const of Kitchen");
    }

    public void prepare() {

        if (this.menuCard != null) {

            String[] items = this.menuCard.getItems(99, "Egg biriyani");

            System.out.println("will prepare");

            if (items != null) {

                for (String item : items) {

                    System.out.println("item :" + item);
                }
            }
        }
    }
}
