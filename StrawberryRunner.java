class StrawberryRunner{
    public static void main(String[] args){

        Strawberry s1 = new Strawberry();
        System.out.println("Strawberry 1");
        System.out.println("Variety:"+s1.variety);
        System.out.println("Weight:"+s1.weight);
        System.out.println("Color:"+s1.color);
        System.out.println("Fresh:"+s1.fresh);
        System.out.println("Quantity:"+s1.quantity);
        System.out.println("==========================");

        Strawberry s2 = new Strawberry("SweetCharlie");
        System.out.println("Strawberry 2");
        System.out.println("Variety:"+s2.variety);
        System.out.println("Weight:"+s2.weight);
        System.out.println("Color:"+s2.color);
        System.out.println("Fresh:"+s2.fresh);
        System.out.println("Quantity:"+s2.quantity);
        System.out.println("==========================");

        Strawberry s3 = new Strawberry("Camarosa", 250);
        System.out.println("Strawberry 3");
        System.out.println("Variety:"+s3.variety);
        System.out.println("Weight:"+s3.weight);
        System.out.println("Color:"+s3.color);
        System.out.println("Fresh:"+s3.fresh);
        System.out.println("Quantity:"+s3.quantity);
        System.out.println("==========================");

        Strawberry s4 = new Strawberry("Festival", 300, "Red");
        System.out.println("Strawberry 4");
        System.out.println("Variety:"+s4.variety);
        System.out.println("Weight:"+s4.weight);
        System.out.println("Color:"+s4.color);
        System.out.println("Fresh:"+s4.fresh);
        System.out.println("Quantity:"+s4.quantity);
        System.out.println("==========================");

        Strawberry s5 = new Strawberry("WinterDawn", 200, "DarkRed", true);
        System.out.println("Strawberry 5");
        System.out.println("Variety:"+s5.variety);
        System.out.println("Weight:"+s5.weight);
        System.out.println("Color:"+s5.color);
        System.out.println("Fresh:"+s5.fresh);
        System.out.println("Quantity:"+s5.quantity);
        System.out.println("==========================");

        Strawberry s6 = new Strawberry("Albion", 350, "BrightRed", true, 20);
        System.out.println("Strawberry 6");
        System.out.println("Variety:"+s6.variety);
        System.out.println("Weight:"+s6.weight);
        System.out.println("Color:"+s6.color);
        System.out.println("Fresh:"+s6.fresh);
        System.out.println("Quantity:"+s6.quantity);
        System.out.println("==========================");
    }
}