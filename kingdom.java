class Kingdom{
	static void save(boolean king,String name,String kingdomName,String queenName,String princessName,
	int populationOfKingdom,String territory,int yearOfBirth,int yearOfDeath,int armySize,int yearsRuled)
	{
		System.out.println("if king is real or not"+king);
		if(king !=true)
	 {
		 System.out.println("the given value is invalid");
		  
	 }
		System.out.println("name of king"+name);
		System.out.println("kingdomName"+kingdomName);
		System.out.println("wife of king(queen)"+queenName);
	    System.out.println("nameof princes"+princessName);
		System.out.println("kingdom population"+populationOfKingdom);
		 if(populationOfKingdom<100)
	 {
		 System.out.println("kingdom population is less than 100  ");
		 
	 }
		System.out.println("name of territory:"+territory);
		System.out.println("kings born year"+yearOfBirth);
		System.out.println("king death:"+yearOfDeath);
		System.out.println("army size:"+armySize);
		System.out.println("ruled no of years"+yearsRuled);
		
			
	}

	
}