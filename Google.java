class Google {
    String officeName;
    String officeID;
    String city;
    String country;
    String address;
    int establishedYear;
    int employeeCount;
    String department;
    String managerName;
    String contactNumber;
    String email;
    boolean cafeteriaAvailable;
    boolean parkingAvailable;
    boolean openSpace;
    String workingHours;
    String buildingType;   // e.g., Headquarters, Branch, Regional
    boolean conferenceRooms;
    int floorCount;
    String productFocus;   // e.g., Search, Cloud, Ads, Android

    public Google(String officeName, String officeID, String city, String country, String address,
                  int establishedYear, int employeeCount, String department, String managerName,
                  String contactNumber, String email, boolean cafeteriaAvailable, boolean parkingAvailable,
                  boolean openSpace, String workingHours, String buildingType, boolean conferenceRooms,
                  int floorCount, String productFocus) {
        this.officeName = officeName;
        this.officeID = officeID;
        this.city = city;
        this.country = country;
        this.address = address;
        this.establishedYear = establishedYear;
        this.employeeCount = employeeCount;
        this.department = department;
        this.managerName = managerName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.cafeteriaAvailable = cafeteriaAvailable;
        this.parkingAvailable = parkingAvailable;
        this.openSpace = openSpace;
        this.workingHours = workingHours;
        this.buildingType = buildingType;
        this.conferenceRooms = conferenceRooms;
        this.floorCount = floorCount;
        this.productFocus = productFocus;
    }

    void display() {
        System.out.println("officeName: " + officeName);
        System.out.println("officeID: " + officeID);
        System.out.println("city: " + city);
        System.out.println("country: " + country);
        System.out.println("address: " + address);
        System.out.println("establishedYear: " + establishedYear);
        System.out.println("employeeCount: " + employeeCount);
        System.out.println("department: " + department);
        System.out.println("managerName: " + managerName);
        System.out.println("contactNumber: " + contactNumber);
        System.out.println("email: " + email);
        System.out.println("cafeteriaAvailable: " + cafeteriaAvailable);
        System.out.println("parkingAvailable: " + parkingAvailable);
        System.out.println("openSpace: " + openSpace);
        System.out.println("workingHours: " + workingHours);
        System.out.println("buildingType: " + buildingType);
        System.out.println("conferenceRooms: " + conferenceRooms);
        System.out.println("floorCount: " + floorCount);
        System.out.println("productFocus: " + productFocus);
        System.out.println("-----------------------------------");
    }
}

