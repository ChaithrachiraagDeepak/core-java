class WaterFall{
	static void info (String name, String location, int size, boolean view)
	{
	System.out.println("Name of waterfall:"+ name);
	if(name==null)
	{
		System.out.println("given name is invalid");
	}
	System.out.println("location of waterfall:"+ location);
	if(location!=null)
	{
		System.out.println("location of thr waterfall is correct");
	}
	System.out.println("size of waterfall:"+ size);
	if(size>85)
	{
		System.out.println("less than 85");
	}
	System.out.println("waterfall view:"+ view);
	if(view==true)
	{
		System.out.println("yes waterfallis very beautifull");
	}
	
	}
	static void stateOwningInfo(String statename,long length,boolean value,String type,String colour)
	{
	
	System.out.println("state owning waterfall:"+ statename);
	if(statename==null)
	{
		System.out.println("given state name is invalid");
	}
	System.out.println("length of the waterfall :"+ length);
	if(length>2341234705633l)
	{
		System.out.println("less than given value");
	}
	System.out.println("waterfall or not:"+ value);
	if(value==false)
	{
		System.out.println("mentin correct waterfall");
	}
	System.out.println("type of the water :"+ type);
	if(type==null)
	{
		System.out.println("type of the water in waterfall is invalid");
	}
	System.out.println("colour of water:"+ colour);
	if(colour!=null)
	{
		System.out.println("colour of the waterfall  is good");
	}
	
		
	}
}