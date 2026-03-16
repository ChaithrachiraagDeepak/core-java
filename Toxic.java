class Toxic {
    String substanceName;
    String substanceID;
    String category;          
    String hazardLevel;      
    String state;            
    double lethalDose;        
    boolean flammable;
    boolean corrosive;
    boolean radioactive;
    String handlingProcedure;
    String storageCondition;
    String manufacturer;
    String originCountry;
    String contactNumber;
    String email;
    String shelfLife;         
    boolean protectiveGearRequired;
    String disposalMethod;    

    public Toxic(String substanceName, String substanceID, String category, String hazardLevel, String state,
                 double lethalDose, boolean flammable, boolean corrosive, boolean radioactive,
                 String handlingProcedure, String storageCondition, String manufacturer, String originCountry,
                 String contactNumber, String email, String shelfLife, boolean protectiveGearRequired,
                 String disposalMethod) {
        this.substanceName = substanceName;
        this.substanceID = substanceID;
        this.category = category;
        this.hazardLevel = hazardLevel;
        this.state = state;
        this.lethalDose = lethalDose;
        this.flammable = flammable;
        this.corrosive = corrosive;
        this.radioactive = radioactive;
        this.handlingProcedure = handlingProcedure;
        this.storageCondition = storageCondition;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;
        this.contactNumber = contactNumber;
        this.email = email;
        this.shelfLife = shelfLife;
        this.protectiveGearRequired = protectiveGearRequired;
        this.disposalMethod = disposalMethod;
    }

    void display() {
        System.out.println("substanceName: " + substanceName);
        System.out.println("substanceID: " + substanceID);
        System.out.println("category: " + category);
        System.out.println("hazardLevel: " + hazardLevel);
        System.out.println("state: " + state);
        System.out.println("lethalDose: " + lethalDose + " mg/kg");
        System.out.println("flammable: " + flammable);
        System.out.println("corrosive: " + corrosive);
        System.out.println("radioactive: " + radioactive);
        System.out.println("handlingProcedure: " + handlingProcedure);
        System.out.println("storageCondition: " + storageCondition);
        System.out.println("manufacturer: " + manufacturer);
        System.out.println("originCountry: " + originCountry);
        System.out.println("contactNumber: " + contactNumber);
        System.out.println("email: " + email);
        System.out.println("shelfLife: " + shelfLife);
        System.out.println("protectiveGearRequired: " + protectiveGearRequired);
        System.out.println("disposalMethod: " + disposalMethod);
        System.out.println("-----------------------------------");
    }
}

