class GoogleRunner {
    public static void main(String... args) {
        Google g1 = new Google("Googleplex Mountain View", "GOO001", "Mountain View", "USA", "Amphitheatre Parkway",
                1998, 20000, "Engineering", "Sundar Pichai", "001-123456", "googleplex@google.com",
                true, true, true, "9 AM - 6 PM", "Headquarters", true, 25, "Search");
        g1.display();

        Google g2 = new Google("Google Bangalore", "GOO002", "Bengaluru", "India", "Whitefield",
                2004, 8000, "Cloud", "Ravi Kumar", "080-12345678", "bangalore@google.com",
                true, true, true, "9 AM - 6 PM", "Corporate", true, 15, "Cloud");
        g2.display();

        Google g3 = new Google("Google London", "GOO003", "London", "UK", "Kings Cross",
                2003, 6000, "Ads", "Emma Watson", "0044-22334455", "london@google.com",
                true, true, true, "9 AM - 6 PM", "Regional", true, 12, "Ads");
        g3.display();

        Google g4 = new Google("Google New York", "GOO004", "New York", "USA", "Chelsea Market",
                2000, 7000, "Android", "Peter Parker", "001-7654321", "ny@google.com",
                true, true, true, "9 AM - 6 PM", "Branch", true, 18, "Android");
        g4.display();

        Google g5 = new Google("Google Hyderabad", "GOO005", "Hyderabad", "India", "Gachibowli",
                2007, 5000, "Engineering", "Suresh Reddy", "040-99887766", "hyderabad@google.com",
                true, true, true, "9 AM - 6 PM", "Corporate", true, 10, "Search");
        g5.display();

        Google g6 = new Google("Google Singapore", "GOO006", "Singapore", "Singapore", "MapleTree Business City",
                2010, 4000, "Cloud", "Sophia Lee", "0065-44556677", "singapore@google.com",
                true, true, true, "9 AM - 6 PM", "Regional", true, 9, "Cloud");
        g6.display();

        Google g7 = new Google("Google Toronto", "GOO007", "Toronto", "Canada", "Bay Street",
                2005, 3500, "Ads", "Mary Jane", "001-55667788", "toronto@google.com",
                true, true, true, "9 AM - 6 PM", "Branch", true, 8, "Ads");
        g7.display();

        Google g8 = new Google("Google Madrid", "GOO008", "Madrid", "Spain", "Gran Via",
                2008, 3000, "Engineering", "Carlos Lopez", "0034-9876543", "madrid@google.com",
                true, true, true, "9 AM - 6 PM", "Branch", true, 7, "Search");
        g8.display();

        Google g9 = new Google("Google Paris", "GOO009", "Paris", "France", "Rue de Londres",
                2002, 4500, "Cloud", "Jean Dupont", "0033-44556677", "paris@google.com",
                true, true, true, "9 AM - 6 PM", "Regional", true, 10, "Cloud");
        g9.display();

        Google g10 = new Google("Google Tokyo", "GOO010", "Tokyo", "Japan", "Shibuya",
                2001, 5500, "Android", "Kenji Tanaka", "0081-22334455", "tokyo@google.com",
                true, true, true, "9 AM - 6 PM", "Regional", true, 14, "Android");
        g10.display();

        // Continue similarly up to 20 records
        Google g11 = new Google("Google Dubai", "GOO011", "Dubai", "UAE", "Sheikh Zayed Road",
                2012, 3000, "Ads", "Aisha Ahmed", "00971-66778899", "dubai@google.com",
                true, true, true, "9 AM - 6 PM", "Branch", true, 9, "Ads");
        g11.display();

        Google g12 = new Google("Google Boston", "GOO012", "Boston", "USA", "Cambridge",
                2006, 4000, "Cloud", "George Miller", "001-55667788", "boston@google.com",
                true, true, true, "9 AM - 6 PM", "Branch", true, 11, "Cloud");
        g12.display();

        Google g13 = new Google("Google Chennai", "GOO013", "Chennai", "India", "Mount Road",
                2015, 3500, "Engineering", "Lakshmi Iyer", "044-33445566", "chennai@google.com",
                true, true, true, "9 AM - 6 PM", "Branch", true, 8, "Search");
        g13.display();

        Google g14 = new Google("Google Berlin", "GOO014", "Berlin", "Germany", "Unter den Linden",
                2009, 3200, "Cloud", "Hans Müller", "0049-33445566", "berlin@google.com",
                true, true, true, "9 AM - 6 PM", "Branch", true, 7, "Cloud");
        g14.display();

        Google g15 = new Google("Google Sydney", "GOO015", "Sydney", "Australia", "George Street",
                2011, 2800, "Ads", "David Smith", "0061-33445566", "sydney@google.com",
                true, true, true, "9 AM - 6 PM", "Branch",true, 9,"andior");
	}
}

