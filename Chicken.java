class  Chicken
{
	static void item(String type)
	{
		System.out.println("name of the chicken  item:"+type); 
		if(type!=null)
		{
		System.out.println("yes the chickenitem in valid");	
		}
		
	}
	
	static void item(boolean value, int noOfItems)
	{
		System.out.println("yes it is chicken:"+value + "number of chicken items in hotel:"+noOfItems);
		if(value==true)
		{
			System.out.println("correct chicken  item is delivered");
		}
		if(noOfItems<24)
		{
			System.out.println("less than 24");
		}
	}
	
	
	
}