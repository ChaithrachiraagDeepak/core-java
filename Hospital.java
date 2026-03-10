class Hospital{
	static void bookAppointment(String patientName,String symptom)
	{
		
	System.out.println("Booked:" + patientName);
	System.out.println("reason:" + symptom );
	int bp= 89;
	boolean sugar=true;
	Nurse.basicCheck(patientName,symptom,bp,sugar);
	
	}
	
	
	
}