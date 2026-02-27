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