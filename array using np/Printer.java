class Printer{
	
	String[] types;
	Print[] prints;
	
	Printer(String[] types,Print[] prints)
	{
		this.types=types;
		this.prints=prints;
	}
	
	void display()
	{
		System.out.println("<-----------executing print in printer-------------->");
		
		if(this.types!=null)
		{
			System.out.println("total items:"+this.types.length);
			for(String types:this.types)
			{	
			System.out.println("types:"+types);
			}
		}
		
		if(this.prints!=null)
		{
			System.out.println("print length"+this.prints.length);
			for(Print prints:this.prints){
				prints.getInfo();	
			}
		}
	}
	
}