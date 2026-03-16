class Paper {
    String paperName;
    String productID;
    String brandName;
    String type;              // e.g., A4, Notebook, Cardboard
    String color;
    int gsm;                  // thickness in grams per square meter
    int sheetsCount;
    double price;
    boolean recycled;
    boolean ecoFriendly;
    String packagingType;     // e.g., Ream, Box, Roll
    String manufacturer;
    String originCountry;
    String contactNumber;
    String email;
    String shelfLife;         // e.g., 3 years
    boolean exportQuality;
    String certification;     // e.g., ISO, FSC

    public Paper(String paperName, String productID, String brandName, String type, String color,
                 int gsm, int sheetsCount, double price, boolean recycled, boolean ecoFriendly,
                 String packagingType, String manufacturer, String originCountry, String contactNumber,
                 String email, String shelfLife, boolean exportQuality, String certification) {
        this.paperName = paperName;
        this.productID = productID;
        this.brandName = brandName;
        this.type = type;
        this.color = color;
        this.gsm = gsm;
        this.sheetsCount = sheetsCount;
        this.price = price;
        this.recycled = recycled;
        this.ecoFriendly = ecoFriendly;
        this.packagingType = packagingType;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;
        this.contactNumber = contactNumber;
        this.email = email;
        this.shelfLife = shelfLife;
        this.exportQuality = exportQuality;
        this.certification = certification;
    }

    void display() {
        System.out.println("paperName: " + paperName);
        System.out.println("productID: " + productID);
        System.out.println("brandName: " + brandName);
        System.out.println("type: " + type);
        System.out.println("color: " + color);
        System.out.println("gsm: " + gsm);
        System.out.println("sheetsCount: " + sheetsCount);
        System.out.println("price: " + price);
        System.out.println("recycled: " + recycled);
        System.out.println("ecoFriendly: " + ecoFriendly);
        System.out.println("packagingType: " + packagingType);
        System.out.println("manufacturer: " + manufacturer);
        System.out.println("originCountry: " + originCountry);
        System.out.println("contactNumber: " + contactNumber);
        System.out.println("email: " + email);
        System.out.println("shelfLife: " + shelfLife);
        System.out.println("exportQuality: " + exportQuality);
        System.out.println("certification: " + certification);
        System.out.println("-----------------------------------");
    }
}


