class  Farmer{
	
	String crop;
	String season;
	int investment;
	String farmerName;
	String seedName;
	boolean profit;
	
	Farmer(String crop, String season, int investment, String farmerName,String seedName,boolean
	profit)
	{
		this.crop=crop;
		this.season=season;
		this.investment=investment;
		this.farmerName=farmerName;
		this.seedName=seedName;
		this.profit=profit;	
	}
	
	
	void info()
	{
		System.out.println("crop:"+crop);
		System.out.println("season:"+season);
		System.out.println("investment:"+investment);
		System.out.println("farmerName:"+farmerName);
		System.out.println("seedName:"+seedName);
		System.out.println("profit:"+profit);
	}

	
}