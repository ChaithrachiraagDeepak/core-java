class OfficeRunner {
    public static void main(String... args) {
        Office o1 = new Office("TechHub Bengaluru", "OFF001", "Bengaluru", "India", "MG Road",
                2005, 500, "IT", "Ravi Kumar", "080-12345678", "techhub@office.com",
                true, true, true, "9 AM - 6 PM", "Corporate", true, 10);
        o1.display();

        Office o2 = new Office("Finance Tower Delhi", "OFF002", "Delhi", "India", "Connaught Place",
                2010, 300, "Finance", "Anita Singh", "011-87654321", "finance@office.com",
                false, true, true, "9 AM - 5 PM", "Corporate", true, 8);
        o2.display();

        Office o3 = new Office("Global Corp NYC", "OFF003", "New York", "USA", "5th Avenue",
                1998, 1000, "Management", "John Doe", "001-11223344", "global@office.com",
                true, true, true, "8 AM - 6 PM", "Headquarters", true, 20);
        o3.display();

        Office o4 = new Office("HealthCare Toronto", "OFF004", "Toronto", "Canada", "Bay Street",
                2015, 250, "Medical", "Mary Jane", "001-55667788", "health@office.com",
                true, true, false, "9 AM - 5 PM", "Branch", true, 6);
        o4.display();

        Office o5 = new Office("EduCenter Hyderabad", "OFF005", "Hyderabad", "India", "Banjara Hills",
                2008, 400, "Education", "Suresh Reddy", "040-99887766", "edu@office.com",
                true, true, true, "9 AM - 6 PM", "Corporate", true, 12);
        o5.display();

        Office o6 = new Office("Innovation Hub Kochi", "OFF006", "Kochi", "India", "Marine Drive",
                2012, 200, "Research", "Priya Nair", "0484-1234567", "innovation@office.com",
                true, true, false, "10 AM - 7 PM", "Branch", true, 5);
        o6.display();

        Office o7 = new Office("Cleveland Business Center", "OFF007", "Ohio", "USA", "Main Street",
                2007, 350, "Operations", "David Smith", "001-7654321", "cleveland@office.com",
                true, false, true, "9 AM - 6 PM", "Regional", true, 9);
        o7.display();

        Office o8 = new Office("Saudi Tech Riyadh", "OFF008", "Riyadh", "Saudi Arabia", "King Fahd Road",
                2018, 600, "IT", "Fatima Khan", "00966-1234567", "sauditech@office.com",
                true, true, true, "8 AM - 5 PM", "Corporate", true, 15);
        o8.display();

        Office o9 = new Office("Madrid General Office", "OFF009", "Madrid", "Spain", "Gran Via",
                2005, 450, "Administration", "Carlos Lopez", "0034-9876543", "madrid@office.com",
                true, true, true, "9 AM - 6 PM", "Regional", true, 10);
        o9.display();

        Office o10 = new Office("London HQ", "OFF010", "London", "UK", "Oxford Street",
                2000, 1200, "Management", "Emma Watson", "0044-22334455", "london@office.com",
                true, true, true, "8 AM - 6 PM", "Headquarters", true, 25);
        o10.display();

        Office o11 = new Office("Ahmedabad Business Park", "OFF011", "Ahmedabad", "India", "SG Highway",
                2011, 280, "Finance", "Rajesh Patel", "079-33445566", "ahmedabad@office.com",
                true, true, false, "9 AM - 5 PM", "Branch", true, 7);
        o11.display();

        Office o12 = new Office("Singapore General Office", "OFF012", "Singapore", "Singapore", "Orchard Road",
                2016, 500, "Operations", "Sophia Lee", "0065-44556677", "singapore@office.com",
                true, true, true, "9 AM - 6 PM", "Regional", true, 12);
        o12.display();

        Office o13 = new Office("Houston Corporate Center", "OFF013", "Houston", "USA", "Downtown",
                2009, 700, "IT", "Michael Johnson", "001-55667788", "houston@office.com",
                true, true, true, "8 AM - 6 PM", "Corporate", true, 18);
        o13.display();

        Office o14 = new Office("Dubai Business Hub", "OFF014", "Dubai", "UAE", "Sheikh Zayed Road",
                2014, 650, "Finance", "Aisha Ahmed", "00971-66778899", "dubai@office.com",
                true, true, true, "9 AM - 6 PM", "Corporate", true, 14);
        o14.display();

        Office o15 = new Office("Queens Office NY", "OFF015", "New York", "USA", "Queens Blvd",
                2012, 300, "Operations", "Peter Parker", "001-123456", "queens@office.com",
                true, true, true, "9 AM - 6 PM", "Branch", true, 8);
        o15.display();

        Office o16 = new Office("Chennai Corporate Office", "OFF016", "Chennai", "India", "Mount Road",
                2018, 400, "Administration", "Lakshmi Iyer", "044-33445566", "chennai@office.com",
                true, true, true, "9 AM - 6 PM", "Corporate", true, 11);
        o16.display();

	}
}
