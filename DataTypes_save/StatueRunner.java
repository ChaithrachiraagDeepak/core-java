class StatueRunner {

    public static void main(String... args) {

        Statue[] statueInfo = new Statue[10];

        Statue s1 = new Statue("Liberty", "Copper", 93, "USA", true, "Green");
        StatueStore st1 = new StatueStore(statueInfo);
        st1.save(s1);
        s1.info();
        System.out.println("----------->>>-------------------");

        Statue s2 = new Statue("Unity", "Iron", 182, "India", true, "Brown");
        StatueStore st2 = new StatueStore(statueInfo);
        st2.save(s2);
        s2.info();
        System.out.println("----------->>>-------------------");

        Statue s3 = new Statue("Christ", "Stone", 30, "Brazil", true, "White");
        StatueStore st3 = new StatueStore(statueInfo);
        st3.save(s3);
        s3.info();
        System.out.println("----------->>>-------------------");

        Statue s4 = new Statue("Buddha", "Gold", 50, "Japan", true, "Gold");
        StatueStore st4 = new StatueStore(statueInfo);
        st4.save(s4);
        s4.info();
        System.out.println("----------->>>-------------------");

        Statue s5 = new Statue("Shiva", "Stone", 40, "India", true, "Black");
        StatueStore st5 = new StatueStore(statueInfo);
        st5.save(s5);
        s5.info();
        System.out.println("----------->>>-------------------");

        Statue s6 = new Statue("Lincoln", "Marble", 19, "USA", true, "White");
        StatueStore st6 = new StatueStore(statueInfo);
        st6.save(s6);
        s6.info();
        System.out.println("----------->>>-------------------");

        Statue s7 = new Statue("Gandhi", "Bronze", 15, "India", true, "Brown");
        StatueStore st7 = new StatueStore(statueInfo);
        st7.save(s7);
        s7.info();
        System.out.println("----------->>>-------------------");

        Statue s8 = new Statue("Nelson", "Stone", 20, "UK", true, "Grey");
        StatueStore st8 = new StatueStore(statueInfo);
        st8.save(s8);
        s8.info();
        System.out.println("----------->>>-------------------");

        Statue s9 = new Statue("Pharaoh", "Gold", 25, "Egypt", true, "Gold");
        StatueStore st9 = new StatueStore(statueInfo);
        st9.save(s9);
        s9.info();
        System.out.println("----------->>>-------------------");

        Statue s10 = new Statue("Angel", "Stone", 35, "Mexico", true, "White");
        StatueStore st10 = new StatueStore(statueInfo);
        st10.save(s10);
        s10.info();
        System.out.println("----------->>>-------------------");
    }
}