class TollgateRunner {

    public static void main(String... args) {

        Tollgate[] tollInfo = new Tollgate[10];

        Tollgate t1 = new Tollgate("Nice Road", "Car", 100, "Bangalore", true, 5);
        TollgateStore s1 = new TollgateStore(tollInfo);
        s1.save(t1);
        t1.info();
        System.out.println("----------->>>-------------------");

        Tollgate t2 = new Tollgate("Highway Toll", "Bus", 200, "Mysore", true, 10);
        TollgateStore s2 = new TollgateStore(tollInfo);
        s2.save(t2);
        t2.info();
        System.out.println("----------->>>-------------------");

        Tollgate t3 = new Tollgate("City Toll", "Bike", 20, "Tumkur", true, 2);
        TollgateStore s3 = new TollgateStore(tollInfo);
        s3.save(t3);
        t3.info();
        System.out.println("----------->>>-------------------");

        Tollgate t4 = new Tollgate("Express Toll", "Truck", 300, "Chennai", true, 15);
        TollgateStore s4 = new TollgateStore(tollInfo);
        s4.save(t4);
        t4.info();
        System.out.println("----------->>>-------------------");

        Tollgate t5 = new Tollgate("Village Toll", "Car", 50, "Mandya", true, 3);
        TollgateStore s5 = new TollgateStore(tollInfo);
        s5.save(t5);
        t5.info();
        System.out.println("----------->>>-------------------");

        Tollgate t6 = new Tollgate("NH Toll", "Bus", 180, "Hubli", true, 8);
        TollgateStore s6 = new TollgateStore(tollInfo);
        s6.save(t6);
        t6.info();
        System.out.println("----------->>>-------------------");

        Tollgate t7 = new Tollgate("Bridge Toll", "Car", 120, "Goa", true, 6);
        TollgateStore s7 = new TollgateStore(tollInfo);
        s7.save(t7);
        t7.info();
        System.out.println("----------->>>-------------------");

        Tollgate t8 = new Tollgate("State Toll", "Truck", 350, "Delhi", true, 20);
        TollgateStore s8 = new TollgateStore(tollInfo);
        s8.save(t8);
        t8.info();
        System.out.println("----------->>>-------------------");

        Tollgate t9 = new Tollgate("Mini Toll", "Bike", 10, "Village", true, 1);
        TollgateStore s9 = new TollgateStore(tollInfo);
        s9.save(t9);
        t9.info();
        System.out.println("----------->>>-------------------");

        Tollgate t10 = new Tollgate("Outer Toll", "Car", 90, "Bangalore", true, 4);
        TollgateStore s10 = new TollgateStore(tollInfo);
        s10.save(t10);
        t10.info();
        System.out.println("----------->>>-------------------");

    }
}