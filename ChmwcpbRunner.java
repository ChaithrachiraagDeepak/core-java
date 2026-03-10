class ChmwcpbRunner{
	public static void main(String...anything1){
		
		System.out.println("\n----Calendar----");
		CalendarSellers cs=new CalendarSellers(50);
		Calendar cal=new Calendar("Sony",CalendarArea.BANGALORE,cs);
		cal.printInfo();
		
		System.out.println("\n");

		CalendarSellers cs2 = new CalendarSellers(60);
		Calendar cal2 = new Calendar("LG", CalendarArea.MYSORE, cs2);
		cal2.printInfo();

		System.out.println("\n");

		CalendarSellers cs3 = new CalendarSellers(70);
		Calendar cal3 = new Calendar("Samsung", CalendarArea.MANGALORE, cs3);
		cal3.printInfo();

		System.out.println("\n");

		CalendarSellers cs4 = new CalendarSellers(80);
		Calendar cal4 = new Calendar("Panasonic", CalendarArea.UDUPI, cs4);
		cal4.printInfo();

		System.out.println("\n");

		CalendarSellers cs5 = new CalendarSellers(90);
		Calendar cal5 = new Calendar("Canon", CalendarArea.BANGALORE, cs5);
		cal5.printInfo();
		System.out.println("==========================calendar==================");
		
		
		
		
		
		
		System.out.println("\n----Horlicks----");
		HorlicksCustomers hc=new HorlicksCustomers(200);
		Horlicks hor=new Horlicks("Chocolate",HorlicksArea.CHENNAI,hc);
		hor.printInfo();
		
		System.out.println("\n");

		HorlicksCustomers hc2 = new HorlicksCustomers(250);
		Horlicks hor2 = new Horlicks("Classic", HorlicksArea.HYDERABAD, hc2);
		hor2.printInfo();

		System.out.println("\n");

		HorlicksCustomers hc3 = new HorlicksCustomers(300);
		Horlicks hor3 = new Horlicks("Protein", HorlicksArea.PUNE, hc3);
		hor3.printInfo();

		System.out.println("\n");

		HorlicksCustomers hc4 = new HorlicksCustomers(350);
		Horlicks hor4 = new Horlicks("Vanilla", HorlicksArea.DELHI, hc4);
		hor4.printInfo();

		System.out.println("\n");

		HorlicksCustomers hc5 = new HorlicksCustomers(400);
		Horlicks hor5 = new Horlicks("Almond", HorlicksArea.CHENNAI, hc5);
		hor5.printInfo();
		System.out.println("==========================horlicks==================");
				
		
		System.out.println("\n----Mushroom----");
		MushroomGrowers mg=new MushroomGrowers(25);
		Mushroom mush=new Mushroom("Button",MushroomArea.OOTY,mg);
		mush.printInfo();
		
		System.out.println("\n");

		MushroomGrowers mg2 = new MushroomGrowers(30);
		Mushroom mush2 = new Mushroom("Oyster", MushroomArea.COORG, mg2);
		mush2.printInfo();

		System.out.println("\n");

		MushroomGrowers mg3 = new MushroomGrowers(35);
		Mushroom mush3 = new Mushroom("Shiitake", MushroomArea.SHIMLA, mg3);
		mush3.printInfo();

		System.out.println("\n");

		MushroomGrowers mg4 = new MushroomGrowers(40);
		Mushroom mush4 = new Mushroom("Portobello", MushroomArea.MANALI, mg4);
		mush4.printInfo();

		System.out.println("\n");

		MushroomGrowers mg5 = new MushroomGrowers(45);
		Mushroom mush5 = new Mushroom("Cremini", MushroomArea.OOTY, mg5);
		mush5.printInfo();
		System.out.println("==========================mushroom==================");
		
				
		
		
		
		
		
		System.out.println("\n----Walnut----");
		WalnutTraders wt=new WalnutTraders(30);
		Walnut wal=new Walnut("Premium",WalnutArea.KASHMIR,wt);
		wal.printInfo();
		
		System.out.println("\n");

		WalnutTraders wt2 = new WalnutTraders(40);
		Walnut wal2 = new Walnut("Standard", WalnutArea.HIMACHAL, wt2);
		wal2.printInfo();

		System.out.println("\n");

		WalnutTraders wt3 = new WalnutTraders(50);
		Walnut wal3 = new Walnut("Export", WalnutArea.PUNJAB, wt3);
		wal3.printInfo();

		System.out.println("\n");

		WalnutTraders wt4 = new WalnutTraders(60);
		Walnut wal4 = new Walnut("GradeA", WalnutArea.UTTARAKHAND, wt4);
		wal4.printInfo();

		System.out.println("\n");

		WalnutTraders wt5 = new WalnutTraders(70);
		Walnut wal5 = new Walnut("Organic", WalnutArea.KASHMIR, wt5);
		wal5.printInfo();
		System.out.println("======================Walnut=================");
		
		

		System.out.println("\n----Cashew----");
		CashewFarmers cf=new CashewFarmers(90);
		Cashew cas=new Cashew("W180",CashewArea.GOA,cf);
		cas.printInfo();
		System.out.println("\n");

		CashewFarmers cf2 = new CashewFarmers(100);
		Cashew cas2 = new Cashew("W210", CashewArea.KERALA, cf2);
		cas2.printInfo();

		System.out.println("\n");

		CashewFarmers cf3 = new CashewFarmers(110);
		Cashew cas3 = new Cashew("W240", CashewArea.MANGALORE, cf3);
		cas3.printInfo();

		System.out.println("\n");

		CashewFarmers cf4 = new CashewFarmers(120);
		Cashew cas4 = new Cashew("W320", CashewArea.KOLLAM, cf4);
		cas4.printInfo();

		System.out.println("\n");

		CashewFarmers cf5 = new CashewFarmers(130);
		Cashew cas5 = new Cashew("W450", CashewArea.GOA, cf5);
		cas5.printInfo();
		System.out.println("==========================cashew=================");
		

		System.out.println("\n----Paneer----");
		PaneerShops ps=new PaneerShops(60);
		Paneer pan=new Paneer("Amul",PaneerArea.DELHI,ps);
		pan.printInfo();
		
		
		System.out.println("\n");

		PaneerShops ps2 = new PaneerShops(70);
		Paneer pan2 = new Paneer("Nandini", PaneerArea.AMRITSAR, ps2);
		pan2.printInfo();

		System.out.println("\n");

		PaneerShops ps3 = new PaneerShops(80);
		Paneer pan3 = new Paneer("MilkyMist", PaneerArea.LUDHIANA, ps3);
		pan3.printInfo();

		System.out.println("\n");

		PaneerShops ps4 = new PaneerShops(90);
		Paneer pan4 = new Paneer("Heritage", PaneerArea.JAIPUR, ps4);
		pan4.printInfo();

		System.out.println("\n");

		PaneerShops ps5 = new PaneerShops(100);
		Paneer pan5 = new Paneer("Britannia", PaneerArea.DELHI, ps5);
		pan5.printInfo();
		System.out.println("==========================panner================");
		

	
		System.out.println("\n----Beer----");
		BeerShops bs=new BeerShops(70);
		Beer beer=new Beer("Kingfisher",BeerArea.GOA,bs);
		beer.printInfo();
		
		
		BeerShops bs2 = new BeerShops(80);
		Beer beer2 = new Beer("Budweiser", BeerArea.BANGALORE, bs2);
		beer2.printInfo();

		System.out.println("\n");

		BeerShops bs3 = new BeerShops(90);
		Beer beer3 = new Beer("Heineken", BeerArea.PUNE, bs3);
		beer3.printInfo();

		System.out.println("\n");

		BeerShops bs4 = new BeerShops(100);
		Beer beer4 = new Beer("Corona", BeerArea.MUMBAI, bs4);
		beer4.printInfo();

		System.out.println("\n");

		BeerShops bs5 = new BeerShops(110);
		Beer beer5 = new Beer("Carlsberg", BeerArea.GOA, bs5);
		beer5.printInfo();
		System.out.println("==========================beer=================");
		

				
      }
}