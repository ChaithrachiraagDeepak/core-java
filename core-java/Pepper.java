class Pepper {
    String varietyName;       // e.g., Black Pepper, White Pepper
    String productID;
    String brandName;
    String originCountry;
    String originCity;
    int harvestYear;
    double pricePerKg;
    String flavorProfile;     // e.g., Spicy, Mild, Smoky
    boolean organic;
    boolean fairTrade;
    boolean wholeOrGround;    // true = Whole, false = Ground
    String packagingType;     // e.g., Pouch, Bottle, Jar
    int netWeight;            // grams
    String manufacturer;
    String contactNumber;
    String email;
    String shelfLife;         // e.g., 2 years
    boolean exportQuality;
    String certification;     // e.g., ISO, FSSAI

    public Pepper(String varietyName, String productID, String brandName, String originCountry, String originCity,
                  int harvestYear, double pricePerKg, String flavorProfile, boolean organic, boolean fairTrade,
                  boolean wholeOrGround, String packagingType, int netWeight, String manufacturer,
                  String contactNumber, String email, String shelfLife, boolean exportQuality,
                  String certification) {
        this.varietyName = varietyName;
        this.productID = productID;
        this.brandName = brandName;
        this.originCountry = originCountry;
        this.originCity = originCity;
        this.harvestYear = harvestYear;
        this.pricePerKg = pricePerKg;
        this.flavorProfile = flavorProfile;
        this.organic = organic;
        this.fairTrade = fairTrade;
        this.wholeOrGround = wholeOrGround;
        this.packagingType = packagingType;
        this.netWeight = netWeight;
        this.manufacturer = manufacturer;
        this.contactNumber = contactNumber;
        this.email = email;
        this.shelfLife = shelfLife;
        this.exportQuality = exportQuality;
        this.certification = certification;
    }

    void display() {
        System.out.println("varietyName: " + varietyName);
        System.out.println("productID: " + productID);
        System.out.println("brandName: " + brandName);
        System.out.println("originCountry: " + originCountry);
        System.out.println("originCity: " + originCity);
        System.out.println("harvestYear: " + harvestYear);
        System.out.println("pricePerKg: " + pricePerKg);
        System.out.println("flavorProfile: " + flavorProfile);
        System.out.println("organic: " + organic);
        System.out.println("fairTrade: " + fairTrade);
        System.out.println("wholeOrGround: " + (wholeOrGround ? "Whole" : "Ground"));
        System.out.println("packagingType: " + packagingType);
        System.out.println("netWeight: " + netWeight + " g");
        System.out.println("manufacturer: " + manufacturer);
        System.out.println("contactNumber: " + contactNumber);
        System.out.println("email: " + email);
        System.out.println("shelfLife: " + shelfLife);
        System.out.println("exportQuality: " + exportQuality);
        System.out.println("certification: " + certification);
        System.out.println("-----------------------------------");
    }
}

