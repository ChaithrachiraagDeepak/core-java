class GumRunner {

    public static void main(String... args) {

        Gum[] gumInfo = new Gum[10];

        Gum g1 = new Gum("Orbit", "Mint", 10, 5, true, "White");
        GumStore s1 = new GumStore(gumInfo);
        s1.save(g1);
        g1.info();
        System.out.println("----------->>>-------------------");

        Gum g2 = new Gum("Center Fresh", "Mint", 5, 2, true, "Green");
        GumStore s2 = new GumStore(gumInfo);
        s2.save(g2);
        g2.info();
        System.out.println("----------->>>-------------------");

        Gum g3 = new Gum("Boomer", "Strawberry", 2, 1, true, "Pink");
        GumStore s3 = new GumStore(gumInfo);
        s3.save(g3);
        g3.info();
        System.out.println("----------->>>-------------------");

        Gum g4 = new Gum("Happydent", "Mint", 10, 4, true, "White");
        GumStore s4 = new GumStore(gumInfo);
        s4.save(g4);
        g4.info();
        System.out.println("----------->>>-------------------");

        Gum g5 = new Gum("Big Babol", "Orange", 3, 1, true, "Orange");
        GumStore s5 = new GumStore(gumInfo);
        s5.save(g5);
        g5.info();
        System.out.println("----------->>>-------------------");

        Gum g6 = new Gum("Orbit", "Lemon", 10, 5, true, "Yellow");
        GumStore s6 = new GumStore(gumInfo);
        s6.save(g6);
        g6.info();
        System.out.println("----------->>>-------------------");

        Gum g7 = new Gum("Center Fruit", "Fruit", 5, 2, true, "Red");
        GumStore s7 = new GumStore(gumInfo);
        s7.save(g7);
        g7.info();
        System.out.println("----------->>>-------------------");

        Gum g8 = new Gum("Boomer", "Blueberry", 2, 1, true, "Blue");
        GumStore s8 = new GumStore(gumInfo);
        s8.save(g8);
        g8.info();
        System.out.println("----------->>>-------------------");

        Gum g9 = new Gum("Happydent", "Mint", 10, 4, true, "White");
        GumStore s9 = new GumStore(gumInfo);
        s9.save(g9);
        g9.info();
        System.out.println("----------->>>-------------------");

        Gum g10 = new Gum("Big Babol", "Cola", 3, 1, true, "Brown");
        GumStore s10 = new GumStore(gumInfo);
        s10.save(g10);
        g10.info();
        System.out.println("----------->>>-------------------");

    }
}