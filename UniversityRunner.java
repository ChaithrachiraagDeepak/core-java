class UniversityRunner{
	
	public static void main(String[]args)
	{
	String[] universityNames = University.getCoursesByCollegeName("GM-university");
	System.out.println("courses available");
	if(universityNames!=null)
	{
		for(int index =0; index < universityNames.length; index++)
		{
			System.out.println(universityNames[index]);
		}
	}
		else
		{
			System.out.println("universityNames is null");
		}
	}
	
}