class CollegeAdmission
{
    public static void main(String[] args)
    {
        int marks = 85;
        String department = "CSE";
        int feePaid = 2;

        // IF - ELSE IF - ELSE (Grade Checking)
        if(marks >= 90)
        {
            System.out.println("Grade: A+");
        }
        else if(marks >= 75)
        {
            System.out.println("Grade: A");
        }
        else if(marks >= 60)
        {
            System.out.println("Grade: B");
        }
        else if(marks >= 40)
        {
            System.out.println("Grade: C");
        }
        else
        {
            System.out.println("Fail");
        }

        System.out.println("------------------");
		
		
	
		
		switch(department)
        {
			
			case "ECE":
                System.out.println("Electronics Selected");
                break;

            case "CSE":
                System.out.println("Computer Science Selected");
                break;

            
            case "MECH":
                System.out.println("Mechanical Selected");
                break;

            default:
                System.out.println("Invalid Department");
        }

        System.out.println("------------------");
		
		
		//FOR
		System.out.println("Subjects in Semester:");
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Subject " + i);
        }

        System.out.println("------------------");
		
		
		//While
		int installment = 1;
        while(installment <= feePaid)
        {
            System.out.println("Installment Paid: " + installment);
            installment++;
        }

        System.out.println("------------------");
		
		
		
		//DO WHILE
		int idProcess = 1;
        do
        {
            System.out.println("Processing Student ID Card...");
            idProcess++;
        }
        while(idProcess <= 1);
		
		
		
		
	}
}