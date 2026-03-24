class MobileRecharge
{
    public static void main(String[] args)
    {
        int amount = 399;
        String plan = "DATA";
        int days = 3;

        if(amount >= 999)
        {
            System.out.println("Premium Plan");
        }
        else if(amount >= 499)
        {
            System.out.println("Standard Plan");
        }
        else
        {
            System.out.println("Basic Plan");
        }

        switch(plan)
        {
            case "DATA":
                System.out.println("Data Plan Selected");
                break;
            case "CALL":
                System.out.println("Call Plan Selected");
                break;
            default:
                System.out.println("Invalid Plan");
        }

        for(int i = 1; i <= 2; i++)
        {
            System.out.println("Recharge Step " + i);
        }

        int validity = 1;
        while(validity <= days)
        {
            System.out.println("Day " + validity);
            validity++;
        }

        int confirm = 1;
        do
        {
            System.out.println("Recharge Successful");
            confirm++;
        }
        while(confirm <= 1);
    }
}