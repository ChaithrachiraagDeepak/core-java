class OrganRunner {
    public static void main(String... args) {
        Organ o1 = new Organ("Heart", "ORG001", "Circulatory", "Pumps blood", 300, "Chest", true, false,
                "Muscle", "Red", "Cardiologist", "Apollo Hospital", "Bengaluru", "India",
                "080-12345678", "heart@apollo.com", "1628", true, "Healthy");
        o1.display();

        Organ o2 = new Organ("Lungs", "ORG002", "Respiratory", "Gas exchange", 1000, "Chest", true, true,
                "Tissue", "Pink", "Pulmonologist", "Fortis Hospital", "Delhi", "India",
                "011-87654321", "lungs@fortis.com", "1543", true, "Healthy");
        o2.display();

        Organ o3 = new Organ("Liver", "ORG003", "Digestive", "Filters toxins", 1500, "Abdomen", true, false,
                "Gland", "Brown", "Hepatologist", "Mayo Clinic", "New York", "USA",
                "001-11223344", "liver@mayo.com", "1650", true, "Healthy");
        o3.display();

        Organ o4 = new Organ("Kidneys", "ORG004", "Excretory", "Filter blood", 300, "Abdomen", true, true,
                "Tissue", "Red", "Nephrologist", "Mount Sinai", "Toronto", "Canada",
                "001-55667788", "kidneys@mountsinai.com", "1656", true, "Healthy");
        o4.display();

        Organ o5 = new Organ("Brain", "ORG005", "Nervous", "Controls body", 1400, "Head", true, false,
                "Nerve", "Grey", "Neurologist", "Narayana Hospital", "Hyderabad", "India",
                "040-99887766", "brain@narayana.com", "1700", false, "Healthy");
        o5.display();

        Organ o6 = new Organ("Stomach", "ORG006", "Digestive", "Digests food", 500, "Abdomen", true, false,
                "Muscle", "Pink", "Gastroenterologist", "Aster Hospital", "Kochi", "India",
                "0484-1234567", "stomach@aster.com", "1600", false, "Healthy");
        o6.display();

        Organ o7 = new Organ("Pancreas", "ORG007", "Digestive", "Produces insulin", 80, "Abdomen", true, false,
                "Gland", "Yellow", "Endocrinologist", "Cleveland Clinic", "Ohio", "USA",
                "001-7654321", "pancreas@cleveland.com", "1889", true, "Healthy");
        o7.display();

        Organ o8 = new Organ("Spleen", "ORG008", "Immune", "Filters blood", 150, "Abdomen", true, false,
                "Tissue", "Purple", "Hematologist", "King Fahd Hospital", "Riyadh", "Saudi Arabia",
                "00966-1234567", "spleen@kingfahd.com", "1650", false, "Healthy");
        o8.display();

        Organ o9 = new Organ("Skin", "ORG009", "Integumentary", "Protects body", 5000, "External", true, false,
                "Tissue", "Varies", "Dermatologist", "Madrid General", "Madrid", "Spain",
                "0034-9876543", "skin@madrid.com", "1700", false, "Healthy");
        o9.display();

        Organ o10 = new Organ("Eyes", "ORG010", "Sensory", "Vision", 30, "Head", true, true,
                "Tissue", "Brown", "Ophthalmologist", "London Hospital", "London", "UK",
                "0044-22334455", "eyes@london.com", "1600", true, "Healthy");
        o10.display();

        Organ o11 = new Organ("Ears", "ORG011", "Sensory", "Hearing", 20, "Head", true, true,
                "Tissue", "Pink", "ENT Specialist", "Ahmedabad Hospital", "Ahmedabad", "India",
                "079-33445566", "ears@ahmedabad.com", "1600", false, "Healthy");
        o11.display();

        Organ o12 = new Organ("Bladder", "ORG012", "Excretory", "Stores urine", 400, "Pelvis", true, false,
                "Muscle", "Pink", "Urologist", "Singapore General", "Singapore", "Singapore",
                "0065-44556677", "bladder@singapore.com", "1600", true, "Healthy");
        o12.display();

        Organ o13 = new Organ("Intestines", "ORG013", "Digestive", "Absorbs nutrients", 7000, "Abdomen", true, false,
                "Tissue", "Pink", "Gastroenterologist", "Houston Medical", "Houston", "USA",
                "001-55667788", "intestines@houston.com", "1600", false, "Healthy");
        o13.display();

        Organ o14 = new Organ("Thyroid", "ORG014", "Endocrine", "Regulates metabolism", 25, "Neck", true, false,
                "Gland", "Brown", "Endocrinologist", "Dubai Hospital", "Dubai", "UAE",
                "00971-66778899", "thyroid@dubai.com", "1650", true, "Healthy");
        o14.display();

        Organ o15 = new Organ("Gallbladder", "ORG015", "Digestive", "Stores bile", 50, "Abdomen", true, false,
                "Tissue", "Green", "Gastroenterologist", "Queens Hospital", "New York", "USA",
                "001-123456", "gallbladder@queens.com", "1600", false, "Healthy");
        o15.display();

        Organ o16 = new Organ("Appendix", "ORG016", "Digestive", "Immune function", 10, "Abdomen", false, false,
                "Tissue", "Pink", "Surgeon", "Chennai Hospital", "Chennai", "India",
                "044-33445566", "appendix@chennai.com", "1600", false, "Healthy");
        o16.display();

        Organ o17 = new Organ("Esophagus", "ORG017", "Digestive", "Transports food", 25, "Chest", true, false,
                "Muscle", "Pink", "Gastroenterologist", "Boston Medical", "Boston", "USA",
                "001-55667788", "esophagus@boston.com", "1600", false, "Healthy");
        o17.display();

        Organ o18 = new Organ("Tongue", "ORG018", "Digestive", "Taste and speech", 70, "Mouth", true, false,
                "Muscle", "Pink", "ENT Specialist", "Delhi Hospital", "Delhi", "India",
                "011-77889900", "tongue@delhi.com", "1600", false, "Healthy");
        o18.display();

        Organ o19 = new Organ("Teeth", "ORG019", "Digestive", "Chewing food", 500, "Mouth", true, true,
                "Bone", "White", "Dentist", "London Dental", "London", "UK",
                "0044-66778899", "teeth@london.com", "1600", false, "Healthy");
        o19.display();

        Organ o20 = new Organ("Nose", "ORG020", "Respiratory", "Smell and breathing", 50, "Head", true, false,
                "Tissue", "Pink", "ENT Specialist", "Singapore ENT", "Singapore", "Singapore",
                "0065-77889900", "nose@singapore.com", "1600", false, "Healthy");
        o20.display();
    }
}

