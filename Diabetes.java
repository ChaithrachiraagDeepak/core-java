class Diabetes {
    String patientName;
    int patientAge;
	
    String gender;
    String type;              
    int diagnosisYear;
    double bloodSugarLevel;
    boolean insulinRequired;
    boolean medicationRequired;
    String medicationName;
    String doctorName;
    String hospitalName;
    String city;
    String country;
    String contactNumber;
    String email;
    boolean dietControl;
    boolean exerciseRoutine;
    String dietPlan;
    String exercisePlan;
    String patientID;
    
   
    public Diabetes(String patientName, int patientAge, String gender, String type, int diagnosisYear,
                    double bloodSugarLevel, boolean insulinRequired, boolean medicationRequired,
                    String medicationName, String doctorName, String hospitalName, String city,
                    String country, String contactNumber, String email, boolean dietControl,
                   
				   boolean exerciseRoutine, String dietPlan, String exercisePlan, String patientID) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.gender = gender;
        this.type = type;
        this.diagnosisYear = diagnosisYear;
        this.bloodSugarLevel = bloodSugarLevel;
        this.insulinRequired = insulinRequired;
        this.medicationRequired = medicationRequired;
        this.medicationName = medicationName;
        this.doctorName = doctorName;
        this.hospitalName = hospitalName;
        this.city = city;
        this.country = country;
        this.contactNumber = contactNumber;
        this.email = email;
        this.dietControl = dietControl;
        this.exerciseRoutine = exerciseRoutine;
        this.dietPlan = dietPlan;
        this.exercisePlan = exercisePlan;
        this.patientID = patientID;
    }
	void display() {
    System.out.println("patientName:" + patientName);
    System.out.println("patientAge:" + patientAge);
    System.out.println("gender:" + gender);
    System.out.println("type:" + type);
    System.out.println("diagnosisYear:" + diagnosisYear);
    System.out.println("bloodSugarLevel:" + bloodSugarLevel);
    System.out.println("insulinRequired:" + insulinRequired);
    System.out.println("medicationRequired:" + medicationRequired);
    System.out.println("medicationName:" + medicationName);
    System.out.println("doctorName:" + doctorName);
    System.out.println("hospitalName:" + hospitalName);
    System.out.println("city:" + city);
    System.out.println("country:" + country);
    System.out.println("contactNumber:" + contactNumber);
    System.out.println("email:" + email);
    System.out.println("dietControl:" + dietControl);
    System.out.println("exerciseRoutine:" + exerciseRoutine);
    System.out.println("dietPlan:" + dietPlan);
    System.out.println("exercisePlan:" + exercisePlan);
    System.out.println("patientID:" + patientID);
}

}

