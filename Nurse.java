class Nurse {
	
	static void basicCheck (String patientName, String symptom, int bp, boolean sugar)
	{
		System.out.println("Nurse checking:" + patientName);
		System.out.println("symptom:" + symptom);
		System.out.println("BP:" + bp);
		System.out.println("sugar level:" + sugar);	
		String name ="rohit";
		Doctor.treat(name,symptom);
	}
	
	
	
}