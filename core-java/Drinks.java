class  Drinks{
	static void information(String drinkname, int type)
	{
		System.out.println("name of the drink u drunk:"+drinkname + "type of the drink:"+type);
		if(drinkname==null)
		{
			System.out.println("given data is invalid");
		}
		
		if(type<15)
		{
			System.out.println("less than 15");
		}
	}
	
	
	
	static void information(boolean thing, String colour)
	{
		System.out.println("is it drinks:"+thing + "colour of the drink:"+colour);
		if(thing== true)
		{
	     System.out.println("yes the drink is correct");
		}
		if(colour!=null)
		{
			System.out.println("yes the drinks colour is good");
		}
	}
}