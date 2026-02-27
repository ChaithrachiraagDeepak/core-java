class StadiumCreator{
	
	static void getStadium()
	{
		System.out.println("new stadium is creating...");
		Stadium stadium = new Stadium ("bapuji");
		System.out.println("stadium name:"+stadium.name);
		System.out.println("created...stadium");
	    System.out.println("=======================");
		
		
	}
	static void getStadium(String name)
	{
		System.out.println("anonther ==>new stadium is creating...");
		Stadium stadium = new Stadium (name);
		System.out.println("stadium name:"+stadium.name);
		System.out.println("created...anoanther..stadium");
	    System.out.println("=======================");
		
	}
	
	static void getStadium(String name,int games)
	{
		System.out.println("again ===>new stadium is creating...");
		Stadium stadium = new Stadium (name,games);
		System.out.println("stadium name:"+stadium.name);
		System.out.println("games inside the stadium:"+stadium.games);
		System.out.println("created...stadium successfully with name and games");
	    System.out.println("=======================");
		
		
	}
	static void getStadium(String name,int games,boolean available)
	{
		System.out.println("again anonther one ======>new stadium is creating...");
		Stadium stadium = new Stadium (name,games,available);
		System.out.println("stadium name:"+stadium.name);
		System.out.println("games inside the stadium:"+stadium.games);
		System.out.println("is stadium is opened or not:"+stadium.available);
		System.out.println("created...stadium with name,games and available");
	    System.out.println("=======================");
		
		
	}
	
}