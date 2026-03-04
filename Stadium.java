class Stadium{
	
	
	String name;
	int games;
	boolean available;
	
	Stadium(String name)
	{
		this.name=name;
		System.out.println("creacting stadium name:");
			
	}
	Stadium(String name,int games)
	{
		this.name=name;
		this.games=games;
		System.out.println("creacting stadium name and games:");
			
	}
	Stadium(String name,int games,boolean available)
	{
		this.name=name;
		this.games=games;
		this.available=available;
		System.out.println("creacting stadium name and games:");
			
	}
	
	
	
	
}