class Reception{
	static void book(String patientName,String symptom,String email,long mobile)
	{
		System.out.println("patientName:"+patientName);
		System.out.println("symptom:"+symptom);
		System.out.println("email:"+email);
		System.out.println("mobile:"+mobile);
		Hospital.bookAppointment(patientName, symptom);
		
		
		
	}
	
	
}