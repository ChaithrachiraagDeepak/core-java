class Cell {
    String cellName;
    String cellID;
    String type;              
    String function;         
    String organellePresent;  
    boolean multicellular;
    boolean nucleusPresent;
    String geneticMaterial;   
    String shape;             
    String size;             
    String discoveryYear;
    String discoveredBy;
    String organismType;      
    String location;          
    String country;
    String contactNumber;
    String email;
    boolean stemCell;
    String cellStatus;        

    public Cell(String cellName, String cellID, String type, String function, String organellePresent,
                boolean multicellular, boolean nucleusPresent, String geneticMaterial, String shape,
                String size, String discoveryYear, String discoveredBy, String organismType,
                String location, String country, String contactNumber, String email,
                boolean stemCell, String cellStatus) {
        this.cellName = cellName;
        this.cellID = cellID;
        this.type = type;
        this.function = function;
        this.organellePresent = organellePresent;
        this.multicellular = multicellular;
        this.nucleusPresent = nucleusPresent;
        this.geneticMaterial = geneticMaterial;
        this.shape = shape;
        this.size = size;
        this.discoveryYear = discoveryYear;
        this.discoveredBy = discoveredBy;
        this.organismType = organismType;
        this.location = location;
        this.country = country;
        this.contactNumber = contactNumber;
        this.email = email;
        this.stemCell = stemCell;
        this.cellStatus = cellStatus;
    }

    void display() {
        System.out.println("cellName: " + cellName);
        System.out.println("cellID: " + cellID);
        System.out.println("type: " + type);
        System.out.println("function: " + function);
        System.out.println("organellePresent: " + organellePresent);
        System.out.println("multicellular: " + multicellular);
        System.out.println("nucleusPresent: " + nucleusPresent);
        System.out.println("geneticMaterial: " + geneticMaterial);
        System.out.println("shape: " + shape);
        System.out.println("size: " + size);
        System.out.println("discoveryYear: " + discoveryYear);
        System.out.println("discoveredBy: " + discoveredBy);
        System.out.println("organismType: " + organismType);
        System.out.println("location: " + location);
        System.out.println("country: " + country);
        System.out.println("contactNumber: " + contactNumber);
        System.out.println("email: " + email);
        System.out.println("stemCell: " + stemCell);
        System.out.println("cellStatus: " + cellStatus);
        System.out.println("-----------------------------------");
    }
}

