class SaltRunner {

    public static void main(String... args) {

        Salt[] saltInfo = new Salt[10];

        Salt s1 = new Salt("Tata", "Iodized", 20, "Cooking", true, "White");
        SaltStore st1 = new SaltStore(saltInfo);
        st1.save(s1);
        s1.info();
        System.out.println("----------->>>-------------------");

        Salt s2 = new Salt("Aashirvaad", "Sea Salt", 30, "Cooking", false, "White");
        SaltStore st2 = new SaltStore(saltInfo);
        st2.save(s2);
        s2.info();
        System.out.println("----------->>>-------------------");

        Salt s3 = new Salt("Catch", "Rock Salt", 25, "Snacks", false, "Pink");
        SaltStore st3 = new SaltStore(saltInfo);
        st3.save(s3);
        s3.info();
        System.out.println("----------->>>-------------------");

        Salt s4 = new Salt("Naturel", "Black Salt", 40, "Chaat", false, "Black");
        SaltStore st4 = new SaltStore(saltInfo);
        st4.save(s4);
        s4.info();
        System.out.println("----------->>>-------------------");

        Salt s5 = new Salt("Tata", "Low Sodium", 35, "Diet", true, "White");
        SaltStore st5 = new SaltStore(saltInfo);
        st5.save(s5);
        s5.info();
        System.out.println("----------->>>-------------------");

        Salt s6 = new Salt("Himalayan", "Pink Salt", 50, "Cooking", false, "Pink");
        SaltStore st6 = new SaltStore(saltInfo);
        st6.save(s6);
        s6.info();
        System.out.println("----------->>>-------------------");

        Salt s7 = new Salt("Urban Platter", "Sea Salt", 60, "Cooking", false, "White");
        SaltStore st7 = new SaltStore(saltInfo);
        st7.save(s7);
        s7.info();
        System.out.println("----------->>>-------------------");

        Salt s8 = new Salt("Keya", "Flavored", 45, "Snacks", false, "Mixed");
        SaltStore st8 = new SaltStore(saltInfo);
        st8.save(s8);
        s8.info();
        System.out.println("----------->>>-------------------");

        Salt s9 = new Salt("24 Mantra", "Organic", 55, "Cooking", true, "White");
        SaltStore st9 = new SaltStore(saltInfo);
        st9.save(s9);
        s9.info();
        System.out.println("----------->>>-------------------");

        Salt s10 = new Salt("Everest", "Table Salt", 20, "Cooking", true, "White");
        SaltStore st10 = new SaltStore(saltInfo);
        st10.save(s10);
        s10.info();
        System.out.println("----------->>>-------------------");

    }
}