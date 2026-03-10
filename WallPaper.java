class WallPaper {
    String designName;
    String productID;
    String brandName;
    String material;          // e.g., Vinyl, Fabric, Paper
    String color;
    String pattern;           // e.g., Floral, Geometric, Abstract
    double pricePerRoll;
    int rollLength;           // in meters
    int rollWidth;            // in centimeters
    boolean washable;
    boolean ecoFriendly;
    boolean peelAndStick;
    String suitableRoom;      // e.g., Living Room, Bedroom
    String manufacturer;
    String countryOfOrigin;
    String contactNumber;
    String email;
    String durability;        // e.g., 5 years
    boolean UVResistant;
    String finishType;        // e.g., Matte, Glossy, Textured

    public WallPaper(String designName, String productID, String brandName, String material, String color,
                     String pattern, double pricePerRoll, int rollLength, int rollWidth, boolean washable,
                     boolean ecoFriendly, boolean peelAndStick, String suitableRoom, String manufacturer,
                     String countryOfOrigin, String contactNumber, String email, String durability,
                     boolean UVResistant, String finishType) {
        this.designName = designName;
        this.productID = productID;
        this.brandName = brandName;
        this.material = material;
        this.color = color;
        this.pattern = pattern;
        this.pricePerRoll = pricePerRoll;
        this.rollLength = rollLength;
        this.rollWidth = rollWidth;
        this.washable = washable;
        this.ecoFriendly = ecoFriendly;
        this.peelAndStick = peelAndStick;
        this.suitableRoom = suitableRoom;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.contactNumber = contactNumber;
        this.email = email;
        this.durability = durability;
        this.UVResistant = UVResistant;
        this.finishType = finishType;
    }

    void display() {
        System.out.println("designName: " + designName);
        System.out.println("productID: " + productID);
        System.out.println("brandName: " + brandName);
        System.out.println("material: " + material);
        System.out.println("color: " + color);
        System.out.println("pattern: " + pattern);
        System.out.println("pricePerRoll: " + pricePerRoll);
        System.out.println("rollLength: " + rollLength + " meters");
        System.out.println("rollWidth: " + rollWidth + " cm");
        System.out.println("washable: " + washable);
        System.out.println("ecoFriendly: " + ecoFriendly);
        System.out.println("peelAndStick: " + peelAndStick);
        System.out.println("suitableRoom: " + suitableRoom);
        System.out.println("manufacturer: " + manufacturer);
        System.out.println("countryOfOrigin: " + countryOfOrigin);
        System.out.println("contactNumber: " + contactNumber);
        System.out.println("email: " + email);
        System.out.println("durability: " + durability);
        System.out.println("UVResistant: " + UVResistant);
        System.out.println("finishType: " + finishType);
        System.out.println("-----------------------------------");
    }
}

