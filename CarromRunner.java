class CarromRunner{
    public static void main(String[] args){

        Carrom c1 = new Carrom();
        System.out.println("Carrom 1");
        System.out.println("Brand:"+c1.brand);
        System.out.println("Size:"+c1.size);
        System.out.println("Color:"+c1.color);
        System.out.println("StrikerIncluded:"+c1.strikerIncluded);
        System.out.println("Coins:"+c1.coins);
        System.out.println("==========================");

        Carrom c2 = new Carrom("Synco");
        System.out.println("Carrom 2");
        System.out.println("Brand:"+c2.brand);
        System.out.println("Size:"+c2.size);
        System.out.println("Color:"+c2.color);
        System.out.println("StrikerIncluded:"+c2.strikerIncluded);
        System.out.println("Coins:"+c2.coins);
        System.out.println("==========================");

        Carrom c3 = new Carrom("Siscaa", 4);
        System.out.println("Carrom 3");
        System.out.println("Brand:"+c3.brand);
        System.out.println("Size:"+c3.size);
        System.out.println("Color:"+c3.color);
        System.out.println("StrikerIncluded:"+c3.strikerIncluded);
        System.out.println("Coins:"+c3.coins);
        System.out.println("==========================");

        Carrom c4 = new Carrom("Precise", 5, "Brown");
        System.out.println("Carrom 4");
        System.out.println("Brand:"+c4.brand);
        System.out.println("Size:"+c4.size);
        System.out.println("Color:"+c4.color);
        System.out.println("StrikerIncluded:"+c4.strikerIncluded);
        System.out.println("Coins:"+c4.coins);
        System.out.println("==========================");

        Carrom c5 = new Carrom("VectorX", 4.5, "Black", true);
        System.out.println("Carrom 5");
        System.out.println("Brand:"+c5.brand);
        System.out.println("Size:"+c5.size);
        System.out.println("Color:"+c5.color);
        System.out.println("StrikerIncluded:"+c5.strikerIncluded);
        System.out.println("Coins:"+c5.coins);
        System.out.println("==========================");

        Carrom c6 = new Carrom("Champion", 5, "Brown", true, 19);
        System.out.println("Carrom 6");
        System.out.println("Brand:"+c6.brand);
        System.out.println("Size:"+c6.size);
        System.out.println("Color:"+c6.color);
        System.out.println("StrikerIncluded:"+c6.strikerIncluded);
        System.out.println("Coins:"+c6.coins);
        System.out.println("==========================");
    }
}