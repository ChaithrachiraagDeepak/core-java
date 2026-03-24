class AcidRunner {

    public static void main(String... args) {

        Acid[] acidInfo = new Acid[10];

        Acid a1 = new Acid("HCl", "Sour", 5, "Cleaning", true, "Colorless");
        AcidStore s1 = new AcidStore(acidInfo);
        s1.save(a1);
        a1.info();
        System.out.println("----------->>>-------------------");

        Acid a2 = new Acid("H2SO4", "Very Sour", 9, "Battery", true, "Clear");
        AcidStore s2 = new AcidStore(acidInfo);
        s2.save(a2);
        a2.info();
        System.out.println("----------->>>-------------------");

        Acid a3 = new Acid("HNO3", "Sharp", 8, "Fertilizer", true, "Yellow");
        AcidStore s3 = new AcidStore(acidInfo);
        s3.save(a3);
        a3.info();
        System.out.println("----------->>>-------------------");

        Acid a4 = new Acid("Citric Acid", "Sour", 3, "Food", false, "White");
        AcidStore s4 = new AcidStore(acidInfo);
        s4.save(a4);
        a4.info();
        System.out.println("----------->>>-------------------");

        Acid a5 = new Acid("Acetic Acid", "Sour", 4, "Vinegar", false, "Clear");
        AcidStore s5 = new AcidStore(acidInfo);
        s5.save(a5);
        a5.info();
        System.out.println("----------->>>-------------------");

        Acid a6 = new Acid("Lactic Acid", "Mild Sour", 2, "Dairy", false, "White");
        AcidStore s6 = new AcidStore(acidInfo);
        s6.save(a6);
        a6.info();
        System.out.println("----------->>>-------------------");

        Acid a7 = new Acid("Tartaric Acid", "Sour", 3, "Baking", false, "White");
        AcidStore s7 = new AcidStore(acidInfo);
        s7.save(a7);
        a7.info();
        System.out.println("----------->>>-------------------");

        Acid a8 = new Acid("Formic Acid", "Strong", 6, "Ants", true, "Clear");
        AcidStore s8 = new AcidStore(acidInfo);
        s8.save(a8);
        a8.info();
        System.out.println("----------->>>-------------------");

        Acid a9 = new Acid("Oxalic Acid", "Sharp", 7, "Cleaning", true, "White");
        AcidStore s9 = new AcidStore(acidInfo);
        s9.save(a9);
        a9.info();
        System.out.println("----------->>>-------------------");

        Acid a10 = new Acid("Carbonic Acid", "Mild", 1, "Drinks", false, "Clear");
        AcidStore s10 = new AcidStore(acidInfo);
        s10.save(a10);
        a10.info();
        System.out.println("----------->>>-------------------");

    }
}