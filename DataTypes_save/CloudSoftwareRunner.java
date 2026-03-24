class CloudSoftwareRunner {

    public static void main(String... args) {

        CloudSoftware[] cloudInfo = new CloudSoftware[10];

        CloudSoftware c1 = new CloudSoftware("Google Drive", "Google", 1000, "Free", false, 15);
        CloudSoftwareStore s1 = new CloudSoftwareStore(cloudInfo);
        s1.save(c1);
        c1.info();
        System.out.println("----------->>>-------------------");

        CloudSoftware c2 = new CloudSoftware("Dropbox", "Dropbox", 500, "Paid", true, 100);
        CloudSoftwareStore s2 = new CloudSoftwareStore(cloudInfo);
        s2.save(c2);
        c2.info();
        System.out.println("----------->>>-------------------");

        CloudSoftware c3 = new CloudSoftware("OneDrive", "Microsoft", 800, "Free", false, 5);
        CloudSoftwareStore s3 = new CloudSoftwareStore(cloudInfo);
        s3.save(c3);
        c3.info();
        System.out.println("----------->>>-------------------");

        CloudSoftware c4 = new CloudSoftware("iCloud", "Apple", 600, "Paid", true, 50);
        CloudSoftwareStore s4 = new CloudSoftwareStore(cloudInfo);
        s4.save(c4);
        c4.info();
        System.out.println("----------->>>-------------------");

        CloudSoftware c5 = new CloudSoftware("Mega", "Mega", 300, "Free", false, 20);
        CloudSoftwareStore s5 = new CloudSoftwareStore(cloudInfo);
        s5.save(c5);
        c5.info();
        System.out.println("----------->>>-------------------");

        CloudSoftware c6 = new CloudSoftware("Box", "Box Inc", 400, "Paid", true, 100);
        CloudSoftwareStore s6 = new CloudSoftwareStore(cloudInfo);
        s6.save(c6);
        c6.info();
        System.out.println("----------->>>-------------------");

        CloudSoftware c7 = new CloudSoftware("pCloud", "pCloud", 200, "Paid", true, 200);
        CloudSoftwareStore s7 = new CloudSoftwareStore(cloudInfo);
        s7.save(c7);
        c7.info();
        System.out.println("----------->>>-------------------");

        CloudSoftware c8 = new CloudSoftware("MediaFire", "MediaFire", 150, "Free", false, 10);
        CloudSoftwareStore s8 = new CloudSoftwareStore(cloudInfo);
        s8.save(c8);
        c8.info();
        System.out.println("----------->>>-------------------");

        CloudSoftware c9 = new CloudSoftware("Sync", "Sync", 250, "Paid", true, 50);
        CloudSoftwareStore s9 = new CloudSoftwareStore(cloudInfo);
        s9.save(c9);
        c9.info();
        System.out.println("----------->>>-------------------");

        CloudSoftware c10 = new CloudSoftware("Zoho Docs", "Zoho", 300, "Free", false, 5);
        CloudSoftwareStore s10 = new CloudSoftwareStore(cloudInfo);
        s10.save(c10);
        c10.info();
        System.out.println("----------->>>-------------------");

    }
}