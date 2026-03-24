class Education {
    String institutionName;
    String institutionID;
    String city;
    String country;
    String address;
    int establishedYear;
    int studentCount;
    String department;
    String principalName;
    String contactNumber;
    String email;
    boolean libraryAvailable;
    boolean sportsFacilities;
    boolean hostelAvailable;
    String coursesOffered;
    String institutionType;   
    boolean researchCenter;
    int campusArea;           

    public Education(String institutionName, String institutionID, String city, String country, String address,
                     int establishedYear, int studentCount, String department, String principalName,
                     String contactNumber, String email, boolean libraryAvailable, boolean sportsFacilities,
                     boolean hostelAvailable, String coursesOffered, String institutionType,
                     boolean researchCenter, int campusArea) {
        this.institutionName = institutionName;
        this.institutionID = institutionID;
        this.city = city;
        this.country = country;
        this.address = address;
        this.establishedYear = establishedYear;
        this.studentCount = studentCount;
        this.department = department;
        this.principalName = principalName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.libraryAvailable = libraryAvailable;
        this.sportsFacilities = sportsFacilities;
        this.hostelAvailable = hostelAvailable;
        this.coursesOffered = coursesOffered;
        this.institutionType = institutionType;
        this.researchCenter = researchCenter;
        this.campusArea = campusArea;
    }

    void display() {
        System.out.println("institutionName: " + institutionName);
        System.out.println("institutionID: " + institutionID);
        System.out.println("city: " + city);
        System.out.println("country: " + country);
        System.out.println("address: " + address);
        System.out.println("establishedYear: " + establishedYear);
        System.out.println("studentCount: " + studentCount);
        System.out.println("department: " + department);
        System.out.println("principalName: " + principalName);
        System.out.println("contactNumber: " + contactNumber);
        System.out.println("email: " + email);
        System.out.println("libraryAvailable: " + libraryAvailable);
        System.out.println("sportsFacilities: " + sportsFacilities);
        System.out.println("hostelAvailable: " + hostelAvailable);
        System.out.println("coursesOffered: " + coursesOffered);
        System.out.println("institutionType: " + institutionType);
        System.out.println("researchCenter: " + researchCenter);
        System.out.println("campusArea: " + campusArea + " acres");
        System.out.println("-----------------------------------");
    }
}

