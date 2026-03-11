class ArrayyRunner{

    public static void main(String...args){

        String[] brands = new String[3];
        brands[0]="NERLAC";
        brands[1]="Asian Paints";
		brands[2]="Indigo"; 

        Paint paint=new Paint("ORANGE", 850);
        Paint paint1=new Paint("WHITE", 500);
		Paint paint2=new Paint("LAVENDER",900);

        Paint[] paints = new Paint[3];
        paints[0]= paint;
        paints[1]= paint1;
		paints[2]=paint2;

        Painter painter = new Painter(brands, paints);
        painter.getInfo();
		System.out.println("<------..... painter.....---->");
		
		
		
		
		String[] furnitures = new String[3];
		furnitures[0] = "Sofa";
		furnitures[1] = "Bed";
		furnitures[2] = "Table";

		Wood wood1 = new Wood("BANIYAN",150);
		Wood wood2 = new Wood("SANDAL",200);
		Wood wood3 = new Wood("SAGVANI",130);

		Wood[] woods = new Wood[3];
		woods[0] = wood1;
		woods[1] = wood2;
		woods[2] = wood3;

		Carpenter carpenter = new Carpenter(furnitures, woods);
		carpenter.printInfo();
		System.out.println("<------..... carpenter.....---->");
		
		


	
		String[] flavours = new String[3];
		flavours[0] = "Milk";
		flavours[1] = "Rose";
		flavours[2] = "Kesar";

		Sweet sweet1 = new Sweet("GulabJamoon",20);
		Sweet sweet2 = new Sweet("KalaJamoon",25);
		Sweet sweet3 = new Sweet("DryJamoon",30);

		Sweet[] sweets = new Sweet[3];
		sweets[0] = sweet1;
		sweets[1] = sweet2;
		sweets[2] = sweet3;

		Jamoon jamoon = new Jamoon(flavours,sweets);
		jamoon.printInfo();
		System.out.println("<------.......jamoon......------->");
		


		String[] types = new String[3];
		types[0] = "Web";
		types[1] = "Database";
		types[2] = "Cloud";

		DataCenter center1 = new DataCenter("Bangalore",200);
		DataCenter center2 = new DataCenter("Delhi",150);
		DataCenter center3 = new DataCenter("Mumbai",180);

		DataCenter[] centers = new DataCenter[3];
		centers[0] = center1;
		centers[1] = center2;
		centers[2] = center3;

		Server server = new Server(types,centers);
		server.printInfo();
		System.out.println("<------.......server......------->");
		


		
		String[] styles = new String[3];
		styles[0] = "Circus";
		styles[1] = "Comedy";
		styles[2] = "Magic";

		Show show1 = new Show("Delhi",500);
		Show show2 = new Show("Mumbai",700);
		Show show3 = new Show("Chennai",450);

		Show[] shows = new Show[3];
		shows[0] = show1;
		shows[1] = show2;
		shows[2] = show3;

		Joker joker = new Joker(styles,shows);
		joker.printInfo();
		System.out.println("<------.......joker......------->");
		


		
		String[] brandsname = new String[3];
		brandsname[0] = "HP";
		brandsname[1] = "Canon";
		brandsname[2] = "Epson";

		Scan scan1 = new Scan("Color",600);
		Scan scan2 = new Scan("BlackWhite",300);
		Scan scan3 = new Scan("Photo",1200);

		Scan[] scans = new Scan[3];
		scans[0] = scan1;
		scans[1] = scan2;
		scans[2] = scan3;

		Scanner scanner = new Scanner(brandsname,scans);
		scanner.printInfo();
		System.out.println("<------.......scanner......------->");
		


		
		String[] markets = new String[3];
		markets[0] = "Stock";
		markets[1] = "Crypto";
		markets[2] = "Forex";

		Deal deal1 = new Deal("TCS",50000);
		Deal deal2 = new Deal("Infosys",45000);
		Deal deal3 = new Deal("Wipro",30000);

		Deal[] deals = new Deal[3];
		deals[0] = deal1;
		deals[1] = deal2;
		deals[2] = deal3;

		Broker broker = new Broker(markets,deals);
		broker.printInfo();
		System.out.println("<------.......broker......------->");
		


		
		String[] hammerTypes = new String[3];
		hammerTypes[0] = "Claw";
		hammerTypes[1] = "Sledge";
		hammerTypes[2] = "BallPein";

		Metal metal1 = new Metal("Steel",2.5);
		Metal metal2 = new Metal("Iron",3.0);
		Metal metal3 = new Metal("Alloy",2.2);

		Metal[] metals = new Metal[3];
		metals[0] = metal1;
		metals[1] = metal2;
		metals[2] = metal3;

		Hammer hammer = new Hammer(hammerTypes,metals);
		hammer.printInfo();
		System.out.println("<------.......hammer.....------->");
		


		
		String[] colors = new String[3];
		colors[0] = "Red";
		colors[1] = "Blue";
		colors[2] = "Yellow";

		Cloth cloth1 = new Cloth("Cotton",5.5);
		Cloth cloth2 = new Cloth("Silk",6.0);
		Cloth cloth3 = new Cloth("Polyester",4.5);

		Cloth[] cloths = new Cloth[3];
		cloths[0] = cloth1;
		cloths[1] = cloth2;
		cloths[2] = cloth3;

		Banner banner = new Banner(colors,cloths);
		banner.printInfo();
		System.out.println("<------..... Banner.....---->");


		
		String[] ingredients = new String[3];
		ingredients[0] = "Carrot";
		ingredients[1] = "Milk";
		ingredients[2] = "Sugar";

		Nut nut1 = new Nut("Cashew",10);
		Nut nut2 = new Nut("Badam",8);
		Nut nut3 = new Nut("Pista",6);

		Nut[] nuts = new Nut[3];
		nuts[0] = nut1;
		nuts[1] = nut2;
		nuts[2] = nut3;

		CarrotHalwa halwa = new CarrotHalwa(ingredients,nuts);
		halwa.printInfo();
		System.out.println("<------..... carrothalwa.....---->");
		

	}
}
	
