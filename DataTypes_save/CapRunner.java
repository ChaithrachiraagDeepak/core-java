class CapRunner {

    public static void main(String... args) {

        Cap[] capInfo = new Cap[10];

        Cap cap1 = new Cap("Puma", "Black", 500, "M", "Sports", true);
        CapStore store1 = new CapStore(capInfo);
        store1.save(cap1);
        cap1.info();
        System.out.println("----------->>>-------------------");


        Cap cap2 = new Cap("Nike", "Red", 700, "L", "Casual", true);
        CapStore store2 = new CapStore(capInfo);
        store2.save(cap2);
        cap2.info();
        System.out.println("----------->>>-------------------");


        Cap cap3 = new Cap("Adidas", "Blue", 650, "M", "Sports", true);
        CapStore store3 = new CapStore(capInfo);
        store3.save(cap3);
        cap3.info();
        System.out.println("----------->>>-------------------");

        Cap cap4 = new Cap("Reebok", "White", 400, "S", "Casual", true);
        CapStore store4 = new CapStore(capInfo);
        store4.save(cap4);
        cap4.info();
        System.out.println("----------->>>-------------------");


        Cap cap5 = new Cap("Fila", "Green", 550, "M", "Outdoor", true);
        CapStore store5 = new CapStore(capInfo);
        store5.save(cap5);
        cap5.info();
        System.out.println("----------->>>-------------------");

        Cap cap6 = new Cap("HRX", "Yellow", 300, "L", "Gym", true);
        CapStore store6 = new CapStore(capInfo);
        store6.save(cap6);
        cap6.info();
        System.out.println("----------->>>-------------------");

        Cap cap7 = new Cap("Zara", "Grey", 900, "M", "Fashion", true);
        CapStore store7 = new CapStore(capInfo);
        store7.save(cap7);
        cap7.info();
        System.out.println("----------->>>-------------------");

        Cap cap8 = new Cap("H&M", "Brown", 350, "S", "Casual", true);
        CapStore store8 = new CapStore(capInfo);
        store8.save(cap8);
        cap8.info();
        System.out.println("----------->>>-------------------");

        Cap cap9 = new Cap("Gucci", "Black", 2500, "L", "Luxury", true);
        CapStore store9 = new CapStore(capInfo);
        store9.save(cap9);
        cap9.info();
        System.out.println("----------->>>-------------------");


        Cap cap10 = new Cap("Levis", "Blue", 800, "M", "Denim", true);
        CapStore store10 = new CapStore(capInfo);
        store10.save(cap10);
        cap10.info();
        System.out.println("----------->>>-------------------");

    }
}