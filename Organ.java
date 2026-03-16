class Organ {
    String organName;
    String organID;
    String system;            
    String function;          
    int averageWeight;        
    String location;          
    boolean vital;            
    boolean paired;           
    String tissueType;        
    String color;
    String doctorSpecialist;  
    String hospitalName;
    String city;
    String country;
    String contactNumber;
    String email;
    String discoveryYear;     
    boolean transplantPossible;
    String organFunctionStatus; 

    public Organ(String organName, String organID, String system, String function, int averageWeight,
                 String location, boolean vital, boolean paired, String tissueType, String color,
                 String doctorSpecialist, String hospitalName, String city, String country,
                 String contactNumber, String email, String discoveryYear, boolean transplantPossible,
                 String organFunctionStatus) {
        this.organName = organName;
        this.organID = organID;
        this.system = system;
        this.function = function;
        this.averageWeight = averageWeight;
        this.location = location;
        this.vital = vital;
        this.paired = paired;
        this.tissueType = tissueType;
        this.color = color;
        this.doctorSpecialist = doctorSpecialist;
        this.hospitalName = hospitalName;
        this.city = city;
        this.country = country;
        this.contactNumber = contactNumber;
        this.email = email;
        this.discoveryYear = discoveryYear;
        this.transplantPossible = transplantPossible;
        this.organFunctionStatus = organFunctionStatus;
    }

    void display() {
        System.out.println("organName: " + organName);
        System.out.println("organID: " + organID);
        System.out.println("system: " + system);
        System.out.println("function: " + function);
        System.out.println("averageWeight: " + averageWeight + " g");
        System.out.println("location: " + location);
        System.out.println("vital: " + vital);
        System.out.println("paired: " + paired);
        System.out.println("tissueType: " + tissueType);
        System.out.println("color: " + color);
        System.out.println("doctorSpecialist: " + doctorSpecialist);
        System.out.println("hospitalName: " + hospitalName);
        System.out.println("city: " + city);
        System.out.println("country: " + country);
        System.out.println("contactNumber: " + contactNumber);
        System.out.println("email: " + email);
        System.out.println("discoveryYear: " + discoveryYear);
        System.out.println("transplantPossible: " + transplantPossible);
        System.out.println("organFunctionStatus: " + organFunctionStatus);
        System.out.println("-----------------------------------");
    }
}

