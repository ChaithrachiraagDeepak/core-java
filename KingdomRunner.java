class KingdomRunner{
	
	public static void main (String []args) 
	
	{
		boolean king = false;
		String name = "vijayarajendra bahaddur";
		String kingdomName = "maratha";
		String queenName = "mallamma";
		String princessName = "jayamma";
		int populationOfKingdom = 99;
		String territory = "maratii";
		int yearOfBirth = 1850;
		int yearOfDeath = 1920;
		int armySize = 30;
		int yearsRuled = 30;
	
		Kingdom.save(king,name,kingdomName,queenName, princessName,
	    populationOfKingdom,territory,yearOfBirth,yearOfDeath,armySize,yearsRuled);
		
		
	 
	}
}