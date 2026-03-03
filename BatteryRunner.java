class BatteryRunner{
    public static void main(String[] args){

        Battery b1 = new Battery();
        System.out.println("Battery 1");
        System.out.println("Brand:"+b1.brand);
        System.out.println("Capacity:"+b1.capacity);
        System.out.println("Type:"+b1.type);
        System.out.println("Rechargeable:"+b1.rechargeable);
        System.out.println("Warranty:"+b1.warranty);
        System.out.println("==========================");

        Battery b2 = new Battery("Exide");
        System.out.println("Battery 2");
        System.out.println("Brand:"+b2.brand);
        System.out.println("Capacity:"+b2.capacity);
        System.out.println("Type:"+b2.type);
        System.out.println("Rechargeable:"+b2.rechargeable);
        System.out.println("Warranty:"+b2.warranty);
        System.out.println("==========================");

        Battery b3 = new Battery("Amaron", 5000);
        System.out.println("Battery 3");
        System.out.println("Brand:"+b3.brand);
        System.out.println("Capacity:"+b3.capacity);
        System.out.println("Type:"+b3.type);
        System.out.println("Rechargeable:"+b3.rechargeable);
        System.out.println("Warranty:"+b3.warranty);
        System.out.println("==========================");

        Battery b4 = new Battery("Duracell", 3000, "Lithium");
        System.out.println("Battery 4");
        System.out.println("Brand:"+b4.brand);
        System.out.println("Capacity:"+b4.capacity);
        System.out.println("Type:"+b4.type);
        System.out.println("Rechargeable:"+b4.rechargeable);
        System.out.println("Warranty:"+b4.warranty);
        System.out.println("==========================");

        Battery b5 = new Battery("Sony", 2500, "NiMH", true);
        System.out.println("Battery 5");
        System.out.println("Brand:"+b5.brand);
        System.out.println("Capacity:"+b5.capacity);
        System.out.println("Type:"+b5.type);
        System.out.println("Rechargeable:"+b5.rechargeable);
        System.out.println("Warranty:"+b5.warranty);
        System.out.println("==========================");

        Battery b6 = new Battery("Eveready", 4000, "Lithium", true, 2);
        System.out.println("Battery 6");
        System.out.println("Brand:"+b6.brand);
        System.out.println("Capacity:"+b6.capacity);
        System.out.println("Type:"+b6.type);
        System.out.println("Rechargeable:"+b6.rechargeable);
        System.out.println("Warranty:"+b6.warranty);
        System.out.println("==========================");
    }
}