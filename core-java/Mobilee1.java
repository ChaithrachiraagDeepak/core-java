class Mobilee1{

	static void register(String patientName,String symptom,String email,long mobile)
	{
		System.out.println("patientName:"+patientName);
		System.out.println("symptom:"+symptom);
		System.out.println("email:"+email);
		System.out.println("mobile:"+mobile);
	Reception.book(patientName, symptom, email, mobile);
		
		
		
	}
	
	
}
	
	
