class Mobile{
	static void register(String patientName,String symtom,String email,long mobile)
	{
		System.out.println("Patient Name:"+patientName);
		System.out.println(" Symptom:"+symtom);
		System.out.println("Email:"+email);
		System.out.println("Mobile Number:"+mobile);
		patientName="ganesh";
		symtom="stomachache";
		email="gani@gmal.com";
		mobile=7993847892;
		Reception.book(patientName,symtom,email,mobile);
	}
}