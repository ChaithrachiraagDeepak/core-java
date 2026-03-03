class BodyLotion {
    String productName;
    String productID;
    String brandName;
    String type;              
    String fragrance;         
    int volumeML;             
    double price;
    String skinType;          
    boolean dermatTested;
    boolean parabenFree;
    boolean organic;
    String keyIngredients;
    String manufacturer;
    String countryOfOrigin;
    String contactNumber;
    String email;
    String shelfLife;         
    boolean travelFriendly;
    String packagingType;     

    public BodyLotion(String productName, String productID, String brandName, String type, String fragrance,
                      int volumeML, double price, String skinType, boolean dermatTested, boolean parabenFree,
                      boolean organic, String keyIngredients, String manufacturer, String countryOfOrigin,
                      String contactNumber, String email, String shelfLife, boolean travelFriendly,
                      String packagingType) {
        this.productName = productName;
        this.productID = productID;
        this.brandName = brandName;
        this.type = type;
        this.fragrance = fragrance;
        this.volumeML = volumeML;
        this.price = price;
        this.skinType = skinType;
        this.dermatTested = dermatTested;
        this.parabenFree = parabenFree;
        this.organic = organic;
        this.keyIngredients = keyIngredients;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.contactNumber = contactNumber;
        this.email = email;
        this.shelfLife = shelfLife;
        this.travelFriendly = travelFriendly;
        this.packagingType = packagingType;
    }

    void display() {
        System.out.println("productName: " + productName);
        System.out.println("productID: " + productID);
        System.out.println("brandName: " + brandName);
        System.out.println("type: " + type);
        System.out.println("fragrance: " + fragrance);
        System.out.println("volumeML: " + volumeML);
        System.out.println("price: " + price);
        System.out.println("skinType: " + skinType);
        System.out.println("dermatTested: " + dermatTested);
        System.out.println("parabenFree: " + parabenFree);
        System.out.println("organic: " + organic);
        System.out.println("keyIngredients: " + keyIngredients);
        System.out.println("manufacturer: " + manufacturer);
        System.out.println("countryOfOrigin: " + countryOfOrigin);
        System.out.println("contactNumber: " + contactNumber);
        System.out.println("email: " + email);
        System.out.println("shelfLife: " + shelfLife);
        System.out.println("travelFriendly: " + travelFriendly);
        System.out.println("packagingType: " + packagingType);
        System.out.println("-----------------------------------");
    }
}

