class Bnglr{
	
	static void metro(String name)
	{
		
	System.out.println("executing metro in bnglr:"+name);

	if (name==null)
	{
		System.out.println("there is  no metro mentioned");
		return;
	}
	}
	static void metro(int noOfMetros,String linesInMetro,boolean open)
	{
	System.out.println("number of metros mentioned:"+ noOfMetros+ "different lines in  metro:" + linesInMetro +
	"is metro station is open  or close:" +open);	
	if (noOfMetros<5)
	{
		
		System.out.println("metros are  less than 5");
	}
	if (linesInMetro!=null)
	{
		System.out.println("valid");
	}
		if(open==true)
		{
		System.out.println("metro is opened");	
			
		}
	} 


		static void metro (int length) 
		{
		System.out.println("length of a  metro :"+length);
		if(length<100)
		{
		System.out.println("length is invalid");
	
		}
       }		
	}
	

	
	
	