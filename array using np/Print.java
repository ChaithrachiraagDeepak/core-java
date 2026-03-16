class Print{
	
	String name;
	int count;
	 
	 
	 Print(String name,int count)
	 {
		 this.name=name;
		 this.count=count;
	 }
	 
	 void getInfo()
	 {
		 System.out.println("name of printer:"+this.name);
		 System.out.println("count of copies:"+this.count);
	 }
	
}