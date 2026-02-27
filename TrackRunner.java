class TrackRunner{
    public static void main(String[] args){

        Track t1 = new Track();
        System.out.println("Track 1");
        System.out.println("Name:"+t1.name);
        System.out.println("Length:"+t1.length);
        System.out.println("Location:"+t1.location);
        System.out.println("Active:"+t1.active);
        System.out.println("Lanes:"+t1.lanes);
        System.out.println("==========================");

        Track t2 = new Track("Metro Track");
		 System.out.println("Track 1");
        System.out.println("Name:"+t2.name);
        System.out.println("Length:"+t2.length);
        System.out.println("Location:"+t2.location);
        System.out.println("Active:"+t2.active);
        System.out.println("Lanes:"+t2.lanes);
        System.out.println("==========================");
		
        Track t3 = new Track("Railway Track", 500);
		 System.out.println("Track 1");
        System.out.println("Name:"+t3.name);
        System.out.println("Length:"+t3.length);
        System.out.println("Location:"+t3.location);
        System.out.println("Active:"+t3.active);
        System.out.println("Lanes:"+t3.lanes);
        System.out.println("==========================");
		
        Track t4 = new Track("Race Track", 800, "Bangalore");
		 System.out.println("Track 1");
        System.out.println("Name:"+t4.name);
        System.out.println("Length:"+t4.length);
        System.out.println("Location:"+t4.location);
        System.out.println("Active:"+t4.active);
        System.out.println("Lanes:"+t4.lanes);
        System.out.println("==========================");
		
        Track t5 = new Track("Sports Track", 400, "Delhi", true);
		 System.out.println("Track 1");
        System.out.println("Name:"+t1.name);
        System.out.println("Length:"+t1.length);
        System.out.println("Location:"+t1.location);
        System.out.println("Active:"+t1.active);
        System.out.println("Lanes:"+t1.lanes);
        System.out.println("==========================");
		
		
        Track t6 = new Track("Test Track", 600, "Mumbai", true, 6);
		 System.out.println("Track 1");
        System.out.println("Name:"+t5.name);
        System.out.println("Length:"+t5.length);
        System.out.println("Location:"+t5.location);
        System.out.println("Active:"+t5.active);
        System.out.println("Lanes:"+t5.lanes);
        System.out.println("==========================");
		

        System.out.println("Other Track objects created successfully");
    }
}