class CHMWCPBRunner{
	public static void main(String...anything1){
		
		System.out.println("\n----Calendar----");
		CalendarSellers cs=new CalendarSellers(50);
		Calendar cal=new Calendar("Sony",CalendarArea.BANGALORE,cs);
		cal.printInfo();
		
		System.out.println("\n----Horlicks----");
		HorlicksCustomers hc=new HorlicksCustomers(200);
		Horlicks hor=new Horlicks("Chocolate",HorlicksArea.CHENNAI,hc);
		hor.printInfo();
		
		
		System.out.println("\n----Mushroom----");
		MushroomGrowers mg=new MushroomGrowers(25);
		Mushroom mush=new Mushroom("Button",MushroomArea.OOTY,mg);
		mush.printInfo();
		
		System.out.println("\n----Walnut----");
		WalnutTraders wt=new WalnutTraders(30);
		Walnut wal=new Walnut("Premium",WalnutArea.KASHMIR,wt);
		wal.printInfo();

		System.out.println("\n----Cashew----");
		CashewFarmers cf=new CashewFarmers(90);
		Cashew cas=new Cashew("W180",CashewArea.GOA,cf);
		cas.printInfo();

		System.out.println("\n----Paneer----");
		PaneerShops ps=new PaneerShops(60);
		Paneer pan=new Paneer("Amul",PaneerArea.DELHI,ps);
		pan.printInfo();

	
		System.out.println("\n----Beer----");
		BeerShops bs=new BeerShops(70);
		Beer beer=new Beer("Kingfisher",BeerArea.GOA,bs);
		beer.printInfo();
		
		
		

		
	}
}