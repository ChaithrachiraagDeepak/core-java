class Vehicles
{
	
	static void details(String vtype,int noplate)
	
	{
		System.out.println("Vehile  name:"+vtype + "Vehicle noplate info:"+noplate);
		if(vtype==null)
		{
			
			System.out.println("no vehile mentioned");
		}
		if(noplate>10000)
		{
		   System.out.println("given no is invalied");
		   
		}
		
	}
	static void details(String colour,boolean condition,int enginno)
	
	{
	System.out.println("Vehile  colour:" +colour + "Vehicle condition:" + condition + "engin no:" + enginno);
	
		if(colour==null)
		{
			
			System.out.println("colour not mentioned");
		}
		
	if(condition==false)
		{
		   System.out.println("vehicles condition");
		   
		   
		}	
		if(enginno>5000)
		{
		 System.out.println("enginno is greater than 5k");
	
			
		}
		
	}
}