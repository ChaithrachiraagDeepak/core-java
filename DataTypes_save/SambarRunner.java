class SambarRunner {

    public static void main(String... args) {

        Sambar[] sambarInfo = new Sambar[10];

        Sambar s1 = new Sambar("Udupi Hotel", "Spicy", 50, "Dal", true, "Orange");
        SambarStore st1 = new SambarStore(sambarInfo);
        st1.save(s1);
        s1.info();
        System.out.println("----------->>>-------------------");

        Sambar s2 = new Sambar("A2B", "Medium", 60, "Vegetables", true, "Brown");
        SambarStore st2 = new SambarStore(sambarInfo);
        st2.save(s2);
        s2.info();
        System.out.println("----------->>>-------------------");

        Sambar s3 = new Sambar("Darshini", "Spicy", 40, "Dal", true, "Orange");
        SambarStore st3 = new SambarStore(sambarInfo);
        st3.save(s3);
        s3.info();
        System.out.println("----------->>>-------------------");

        Sambar s4 = new Sambar("Home", "Mild", 30, "Vegetables", true, "Yellow");
        SambarStore st4 = new SambarStore(sambarInfo);
        st4.save(s4);
        s4.info();
        System.out.println("----------->>>-------------------");

        Sambar s5 = new Sambar("Hotel Mayura", "Spicy", 70, "Dal", true, "Orange");
        SambarStore st5 = new SambarStore(sambarInfo);
        st5.save(s5);
        s5.info();
        System.out.println("----------->>>-------------------");

        Sambar s6 = new Sambar("Local Mess", "Medium", 35, "Vegetables", true, "Brown");
        SambarStore st6 = new SambarStore(sambarInfo);
        st6.save(s6);
        s6.info();
        System.out.println("----------->>>-------------------");

        Sambar s7 = new Sambar("Temple Food", "Mild", 25, "Dal", true, "Yellow");
        SambarStore st7 = new SambarStore(sambarInfo);
        st7.save(s7);
        s7.info();
        System.out.println("----------->>>-------------------");

        Sambar s8 = new Sambar("Street Hotel", "Spicy", 20, "Vegetables", true, "Orange");
        SambarStore st8 = new SambarStore(sambarInfo);
        st8.save(s8);
        s8.info();
        System.out.println("----------->>>-------------------");

        Sambar s9 = new Sambar("Big Hotel", "Rich", 80, "Dal", true, "Brown");
        SambarStore st9 = new SambarStore(sambarInfo);
        st9.save(s9);
        s9.info();
        System.out.println("----------->>>-------------------");

        Sambar s10 = new Sambar("Canteen", "Medium", 45, "Vegetables", true, "Orange");
        SambarStore st10 = new SambarStore(sambarInfo);
        st10.save(s10);
        s10.info();
        System.out.println("----------->>>-------------------");

    }
}