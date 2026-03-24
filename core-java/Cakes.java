class Cakes
{
	static void info(String cakename,int type)
	{
		System.out.println("cake name:"+cakename);
	if(cakename==null)	
	{
		System.out.println("the given value is invallid");

	}
	 
	 System.out.println("type of the cake:"+type);
	 if(type<10)
	 {
		 System.out.println("less than 10");
	 }		
	}
	
	static void info(boolean things,String shopname)
	{
	System.out.println("cake is present in bakery:"+things + "shopname to buy cake:"+shopname);
	if(things==true)
	{
		System.out.println("yes cake is present");
	}
	if(shopname==null)
	{
	System.out.println("shop is invalid");
	}
	}
}