class MapRunner {

    public static void main(String... args) {

        Map[] mapInfo = new Map[10];

        Map map1 = new Map("Mysore Palace", "Mysore", 150, "Bus", true, "Palace");
        MapStore store1 = new MapStore(mapInfo);
        store1.save(map1);
        map1.info();
        System.out.println("-----------'>>>'-------------------");

        Map map2 = new Map("Lalbagh", "Bangalore", 10, "Auto", true, "Garden");
        MapStore store2 = new MapStore(mapInfo);
        store2.save(map2);
        map2.info();
        System.out.println("-----------'>>>'-------------------");

        Map map3 = new Map("Coorg", "Coorg", 250, "Car", true, "Coffee");
        MapStore store3 = new MapStore(mapInfo);
        store3.save(map3);
        map3.info();
        System.out.println("-----------'>>>'-------------------");

        Map map4 = new Map("Nandi Hills", "Chikkaballapur", 60, "Bike", true, "Sunrise");
        MapStore store4 = new MapStore(mapInfo);
        store4.save(map4);
        map4.info();
        System.out.println("-----------'>>>'-------------------");

        Map map5 = new Map("Hampi", "Hospet", 350, "Train", true, "Ruins");
        MapStore store5 = new MapStore(mapInfo);
        store5.save(map5);
        map5.info();
        System.out.println("----------->>>-------------------");

        Map map6 = new Map("Jog Falls", "Shimoga", 400, "Bus", true, "Waterfall");
        MapStore store6 = new MapStore(mapInfo);
        store6.save(map6);
        map6.info();
        System.out.println("----------->>>-------------------");

        Map map7 = new Map("Wonderla", "Bangalore", 25, "Car", true, "Park");
        MapStore store7 = new MapStore(mapInfo);
        store7.save(map7);
        map7.info();
        System.out.println("----------->>>-------------------");

        Map map8 = new Map("Bannerghatta", "Bangalore", 20, "Bus", true, "Zoo");
        MapStore store8 = new MapStore(mapInfo);
        store8.save(map8);
        map8.info();
        System.out.println("----------->>>-------------------");

        Map map9 = new Map("Belur Temple", "Belur", 220, "Car", true, "Temple");
        MapStore store9 = new MapStore(mapInfo);
        store9.save(map9);
        map9.info();
        System.out.println("----------->>>-------------------");

        Map map10 = new Map("Murudeshwar", "Karwar", 500, "Train", true, "Beach");
        MapStore store10 = new MapStore(mapInfo);
        store10.save(map10);
        map10.info();
        System.out.println("----------->>>-------------------");

    }
}