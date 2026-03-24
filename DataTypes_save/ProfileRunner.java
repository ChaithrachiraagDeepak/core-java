class ProfileRunner {

    public static void main(String... args) {

        Profile[] profileInfo = new Profile[10];

        Profile p1 = new Profile("Ravi", 25, "Bangalore", "Engineer", true, "Cricket");
        ProfileStore s1 = new ProfileStore(profileInfo);
        s1.save(p1);
        p1.info();
        System.out.println("----------->>>-------------------");

        Profile p2 = new Profile("Anu", 22, "Mysore", "Student", true, "Dance");
        ProfileStore s2 = new ProfileStore(profileInfo);
        s2.save(p2);
        p2.info();
        System.out.println("----------->>>-------------------");

        Profile p3 = new Profile("Rahul", 30, "Delhi", "Doctor", true, "Reading");
        ProfileStore s3 = new ProfileStore(profileInfo);
        s3.save(p3);
        p3.info();
        System.out.println("----------->>>-------------------");

        Profile p4 = new Profile("Sneha", 28, "Chennai", "Teacher", true, "Music");
        ProfileStore s4 = new ProfileStore(profileInfo);
        s4.save(p4);
        p4.info();
        System.out.println("----------->>>-------------------");

        Profile p5 = new Profile("Kiran", 35, "Hyderabad", "Business", true, "Travel");
        ProfileStore s5 = new ProfileStore(profileInfo);
        s5.save(p5);
        p5.info();
        System.out.println("----------->>>-------------------");

        Profile p6 = new Profile("Pooja", 24, "Pune", "Designer", true, "Art");
        ProfileStore s6 = new ProfileStore(profileInfo);
        s6.save(p6);
        p6.info();
        System.out.println("----------->>>-------------------");

        Profile p7 = new Profile("Arjun", 27, "Mumbai", "Developer", true, "Gaming");
        ProfileStore s7 = new ProfileStore(profileInfo);
        s7.save(p7);
        p7.info();
        System.out.println("----------->>>-------------------");

        Profile p8 = new Profile("Meena", 29, "Kolkata", "Nurse", true, "Cooking");
        ProfileStore s8 = new ProfileStore(profileInfo);
        s8.save(p8);
        p8.info();
        System.out.println("----------->>>-------------------");

        Profile p9 = new Profile("Vikram", 32, "Jaipur", "Police", true, "Fitness");
        ProfileStore s9 = new ProfileStore(profileInfo);
        s9.save(p9);
        p9.info();
        System.out.println("----------->>>-------------------");

        Profile p10 = new Profile("Divya", 26, "Goa", "HR", true, "Beach");
        ProfileStore s10 = new ProfileStore(profileInfo);
        s10.save(p10);
        p10.info();
        System.out.println("----------->>>-------------------");
    }
}