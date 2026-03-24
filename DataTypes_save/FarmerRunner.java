class FarmerRunner{
	
	public static void main(String...args)
	{
		
		Farmer[] farmerInfo = new Farmer[10];
		
		
		Farmer farmer = new Farmer("sugarcane","rainy",34222,"manjappa","peas",true);
		FarmerStore farmerStore = new FarmerStore(farmerInfo);
		farmerStore.save(farmer);
		farmer.info();
		System.out.println("----------->>>-------------------");
		
		
		Farmer farmer2 = new Farmer("corn","rainy",6642,"manjappa","chia",true);
		FarmerStore farmerStore2 = new FarmerStore(farmerInfo);
		farmerStore2.save(farmer2);
		farmer2.info();
		System.out.println("----------->>>-------------------");
		
		Farmer farmer3 = new Farmer("lupini beans","rainy",5464,"manjappa","chias",true);
		FarmerStore farmerStore3 = new FarmerStore(farmerInfo);
		farmerStore3.save(farmer3);
		farmer3.info();
		System.out.println("----------->>>-------------------");
		
		Farmer farmer4 = new Farmer("tomato","rainy",6642,"manjappa","watermelon",true);
		FarmerStore farmerStore4 = new FarmerStore(farmerInfo);
		farmerStore4.save(farmer4);
		farmer4.info();
		System.out.println("----------->>>-------------------");
		
		Farmer farmer5 = new Farmer("chilly","rainy",6642,"manjappa","pumkin",true);
		FarmerStore farmerStore5 = new FarmerStore(farmerInfo);
		farmerStore5.save(farmer5);
		farmer5.info();
		System.out.println("----------->>>-------------------");
		
		Farmer farmer6 = new Farmer("coriander","winter",8742,"madappa","cheery",true);
		FarmerStore farmerStore6 = new FarmerStore(farmerInfo);
		farmerStore6.save(farmer6);
		farmer6.info();
		System.out.println("----------->>>-------------------");
		
		Farmer farmer7 = new Farmer("spinich","rainy",5652,"ajju","apple",true);
		FarmerStore farmerStore7 = new FarmerStore(farmerInfo);
		farmerStore7.save(farmer7);
		farmer7.info();
		System.out.println("----------->>>-------------------");
		
		Farmer farmer8 = new Farmer("lemon","rainy",98409,"linganna","lemonseed",true);
		FarmerStore farmerStore8 = new FarmerStore(farmerInfo);
		farmerStore8.save(farmer8);
		farmer8.info();
		System.out.println("----------->>>-------------------");
		
		Farmer farmer9 = new Farmer("curryleaves","summer",2345,"chandrappa","chillyseeds",true);
		FarmerStore farmerStore9 = new FarmerStore(farmerInfo);
		farmerStore9.save(farmer9);
		farmer9.info();
		System.out.println("----------->>>-------------------");
		
		
		Farmer farmer10 = new Farmer("cucmber","winter",6839,"kenchappa","cucumber seeds",true);
		FarmerStore farmerStore10 = new FarmerStore(farmerInfo);
		farmerStore10.save(farmer10);
		farmer10.info();
		System.out.println("----------->>>-------------------");
		
		
	}
	
	
}