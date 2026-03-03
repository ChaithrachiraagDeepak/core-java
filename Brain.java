    class Brain {
    String patientName;
	int patientAge;
    String gender;
    String condition;         
    int diagnosisYear;
    String severity;           
    boolean surgeryRequired;
    boolean medicationRequired;
    String medicationName;
    String doctorName;
    String hospitalName;
    String city;
    String country;
    String contactNumber;
    String email;
    boolean therapyRequired;
    String therapyType;       
    String patientID;

    public Brain(String patientName, int patientAge, String gender, String condition, int diagnosisYear,
                 String severity, boolean surgeryRequired, boolean medicationRequired, String medicationName,
                 String doctorName, String hospitalName, String city, String country, String contactNumber,
                 String email, boolean therapyRequired, String therapyType, String patientID)
	 {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.gender = gender;
        this.condition = condition;
        this.diagnosisYear = diagnosisYear;
        this.severity = severity;
        this.surgeryRequired = surgeryRequired;
        this.medicationRequired = medicationRequired;
        this.medicationName = medicationName;
        this.doctorName = doctorName;
        this.hospitalName = hospitalName;
        this.city = city;
        this.country = country;
        this.contactNumber = contactNumber;
        this.email = email;
        this.therapyRequired = therapyRequired;
        this.therapyType = therapyType;
        this.patientID = patientID;
    }

    void display() {
        System.out.println("patientName: " + patientName);
        System.out.println("patientAge: " + patientAge);
        System.out.println("gender: " + gender);
        System.out.println("condition: " + condition);
        System.out.println("diagnosisYear: " + diagnosisYear);
        System.out.println("severity: " + severity);
        System.out.println("surgeryRequired: " + surgeryRequired);
        System.out.println("medicationRequired: " + medicationRequired);
        System.out.println("medicationName: " + medicationName);
        System.out.println("doctorName: " + doctorName);
        System.out.println("hospitalName: " + hospitalName);
        System.out.println("city: " + city);
        System.out.println("country: " + country);
        System.out.println("contactNumber: " + contactNumber);
        System.out.println("email: " + email);
        System.out.println("therapyRequired: " + therapyRequired);
        System.out.println("therapyType: " + therapyType);
        System.out.println("patientID: " + patientID);
        System.out.println("-----------------------------------");
    }
	}
