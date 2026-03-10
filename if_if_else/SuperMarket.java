class SuperMarket
{
	public static void main(String[]args)
	{
	    int amount= 2000;
		String paymentMode= "CARD";
		int items =3;
		
		if(amount>=2000)
		{
			System.out.println("20% discount is applied");
		}
		else if (amount>1000)
		{
			System.out.println("10% discountis applied");
		}
		else if (amount>500)
		{
			System.out.println("5% discount applied");	
		}
		else 
		{
			System.out.println("no discount");	
		}
		
		
		switch(paymentMode)
		 {
			case "card":
			System.out.println("card payment");
			break;
			
			case "cash":
			System.out.println("cash payment");
			break;
			
			case  "UPI":
			System.out.println("UPI payment");
			break;
			
			default: 
			System.out.println("invalid payment");
			
		 }
			System.out.println("--------------");
			
			for (int i=1; i<=items;i++)
			{
				System.out.println("items:"+i);
			}
			
		int counter= 1;
        while (counter<=2)
		{
			System.out.println("printing bill copy:"+counter);
			counter++;
		}	
		
		int bill=1;
		do
		{
			System.out.println("bill generated");
			bill++;
		}
		while(bill<=1);
		
	}	
		
	}
	

	
