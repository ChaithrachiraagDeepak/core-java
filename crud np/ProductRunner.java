class ProductRunner{
	
	public static void main(String...values){
		
		Product[] productsinfo = new Product[137];
		ProductStore productStore = new ProductStore(productsinfo);
		
		
		Product product1 = new Product("milk","cow","28-3-26",30,"shopman","no","milk@123",
		"india",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
	


		Product product2 = new Product("Gold Ring","Tanishq","27-03-26",50000,"Store","no","p@102","India",
		ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);

		Product product3 = new Product("Drill Machine","Bosch","26-03-26",4500,"IndustryShop","no","p@103","Germany"
		,ProductTypes.INDUSTRY,warrantyYears.TWO_YEARS);

		Product product4 = new Product("Fan","Usha","25-03-26",2200,"Amazon","no","p@104","India"
		,ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);

		Product product5 = new Product("Rice","IndiaGate","24-03-26",1200,"Supermarket","yes","p@105","India"
		,ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);

		Product product6 = new Product("Necklace","Kalyan","23-03-26",75000,"Store","no","p@106","India"
		,ProductTypes.JEWLLERY,warrantyYears.TWELVE_YEARS);

		Product product7 = new Product("Generator","Kirloskar","22-03-26",85000,"Dealer","no","p@107","India"
		,ProductTypes.INDUSTRY,warrantyYears.TEN_YEARS);

		Product product8 = new Product("Iron Box","Philips","21-03-26",2000,"Amazon","no","p@108","India"
		,ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);

		Product product9 = new Product("Oil","Fortune","20-03-26",180,"Store","yes","p@109","India"
		,ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);

		Product product10 = new Product("Bracelet","Malabar","19-03-26",30000,"Store","no","p@110","India"
		,ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);

		Product product11 = new Product("Lathe Machine","HMT","18-03-26",150000,"Industry","no","p@111","India"
		,ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);

		Product product12 = new Product("Mixer","Prestige","17-03-26",3500,"Flipkart","no","p@112","India"
		,ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);

		Product product13 = new Product("Sugar","Dhampur","16-03-26",50,"Market","yes","p@113","India"
		,ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);

		Product product14 = new Product("Earrings","Joyalukkas","15-03-26",25000,"Store","no","p@114","India"
		,ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);

		Product product15 = new Product("Welding Machine","ESAB","14-03-26",12000,"Dealer","no","p@115","Sweden"
		,ProductTypes.INDUSTRY,warrantyYears.TWO_YEARS);
			
		Product product16 = new Product("Motor","ABB","13-03-26",25000,"Dealer","no","p@116","Sweden"
		,ProductTypes.INDUSTRY,warrantyYears.TEN_YEARS);
		
		Product product17 = new Product("Heater","Bajaj","12-03-26",3000,"Amazon","no","p@117","India",
		ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		
		Product product18 = new Product("Wheat","Aashirvaad","11-03-26",900,"Store","yes","p@118","India"
		,ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		
		Product product19 = new Product("Diamond Ring","Tanishq","10-03-26",85000,"Store","no","p@119",
		"India",ProductTypes.JEWLLERY,warrantyYears.TWELVE_YEARS);
		
		Product product20 = new Product("Compressor","Atlas","09-03-26",95000,"Industry","no","p@120","USA"
		,ProductTypes.INDUSTRY,warrantyYears.TEN_YEARS);
		
		Product product21 = new Product("Cooler","Symphony","08-03-26",12000,"Flipkart","no","p@121","India"
		,ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		
		Product product22 = new Product("Salt","Tata","07-03-26",30,"Market","yes","p@122","India"
		,ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		
		Product product23 = new Product("Chain","Malabar","06-03-26",40000,"Store","no","p@123","India"
		,ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		
		Product product24 = new Product("Pump","Kirloskar","05-03-26",18000,"Dealer","no","p@124"
		,"India",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		
		Product product25 = new Product("Kettle","Prestige","04-03-26",1800,"Amazon","no","p@125","India"
		,ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		
		Product product26 = new Product("Tea","Tata","03-03-26",250,"Store","yes","p@126","India"
		,ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		
		Product product27 = new Product("Bangles","Kalyan","02-03-26",60000,"Store","no","p@127","India"
		,ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		
		Product product28 = new Product("Crane","Liebherr","01-03-26",500000,"Industry","no","p@128"
		,"Germany",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		
		Product product29 = new Product("Grinder","Butterfly","28-02-26",4000,"Amazon","no","p@129"
		,"India",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		
		Product product30 = new Product("Dal","Fortune","27-02-26",150,"Store","yes","p@130","India"
		,ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
			
	
		Product product31 = new Product("Pendant","Joyalukkas","26-02-26",20000,"Store","no","p@131",
		"India",ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product32 = new Product("Boiler","Thermax","25-02-26",200000,"Industry","no","p@132",
		"India",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		Product product33 = new Product("Toaster","Bajaj","24-02-26",1500,"Flipkart","no","p@133","India"
		,ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product34 = new Product("Coffee","Nescafe","23-02-26",350,"Store","yes","p@134","India"
		,ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product35 = new Product("Ring","Malabar","22-02-26",30000,"Store","no","p@135","India"
		,ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product36 = new Product("Forklift","Toyota","21-02-26",700000,"Industry","no","p@136"
		,"Japan",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		Product product37 = new Product("Microwave","IFB","20-02-26",12000,"Croma","no","p@137",
		"India",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product38 = new Product("Biscuits","Britannia","19-02-26",50,"Market","yes","p@138",
		"India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product39 = new Product("Earrings","Tanishq","18-02-26",28000,"Store","no","p@139","India"
		,ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product40 = new Product("Excavator","JCB","17-02-26",1200000,"Industry","no","p@140","UK"
		,ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		Product product41 = new Product("AC","Voltas","16-02-26",38000,"Amazon","no","p@141","India"
		,ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product42 = new Product("Noodles","Maggi","15-02-26",40,"Store","yes","p@142","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product43 = new Product("Gold Coin","Kalyan","14-02-26",60000,"Store","no","p@143","India",ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product44 = new Product("Drill","Bosch","13-02-26",5000,"Dealer","no","p@144","Germany",ProductTypes.INDUSTRY,warrantyYears.TWO_YEARS);
		Product product45 = new Product("TV","Sony","12-02-26",65000,"Croma","no","p@145","Japan",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product46 = new Product("Sugar","Madhur","11-02-26",45,"Store","yes","p@146","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product47 = new Product("Chain","Tanishq","10-02-26",55000,"Store","no","p@147","India",ProductTypes.JEWLLERY,warrantyYears.TWELVE_YEARS);
		Product product48 = new Product("Lathe","HMT","09-02-26",180000,"Industry","no","p@148","India",ProductTypes.INDUSTRY,warrantyYears.TEN_YEARS);
		Product product49 = new Product("Speaker","JBL","08-02-26",5000,"Amazon","no","p@149","USA",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product50 = new Product("Oil","Saffola","07-02-26",200,"Store","yes","p@150","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product51 = new Product("Necklace","Malabar","06-02-26",95000,"Store","no","p@151","India",ProductTypes.JEWLLERY,warrantyYears.TWELVE_YEARS);
		Product product52 = new Product("Generator","Cummins","05-02-26",120000,"Dealer","no","p@152","USA",ProductTypes.INDUSTRY,warrantyYears.TEN_YEARS);
		Product product53 = new Product("Laptop","HP","04-02-26",70000,"Amazon","no","p@153","USA",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product54 = new Product("Rice","Daawat","03-02-26",1100,"Store","yes","p@154","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product55 = new Product("Bracelet","Kalyan","02-02-26",45000,"Store","no","p@155","India",ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product56 = new Product("Pump","CRI","01-02-26",15000,"Dealer","no","p@156","India",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		Product product57 = new Product("Mobile","Apple","31-01-26",80000,"Store","no","p@157","USA",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product58 = new Product("Tea","RedLabel","30-01-26",300,"Store","yes","p@158","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product59 = new Product("Ring","Joyalukkas","29-01-26",35000,"Store","no","p@159","India",ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product60 = new Product("Crane","Tata","28-01-26",900000,"Industry","no","p@160","India",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		Product product61 = new Product("Tablet","Samsung","27-01-26",25000,"Flipkart","no","p@161","Korea",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product62 = new Product("Salt","Aashirvaad","26-01-26",25,"Store","yes","p@162","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product63 = new Product("Earrings","Malabar","25-01-26",30000,"Store","no","p@163","India",ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product64 = new Product("Boiler","BHEL","24-01-26",300000,"Industry","no","p@164","India",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		Product product65 = new Product("Charger","Mi","23-01-26",1200,"Amazon","no","p@165","China",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product66 = new Product("Coffee","Bru","22-01-26",280,"Store","yes","p@166","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product67 = new Product("Pendant","Tanishq","21-01-26",22000,"Store","no","p@167","India",ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product68 = new Product("Excavator","CAT","20-01-26",1500000,"Industry","no","p@168","USA",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		Product product69 = new Product("Router","TP-Link","19-01-26",2500,"Amazon","no","p@169","China",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product70 = new Product("Dal","Tata","18-01-26",160,"Store","yes","p@170","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product71 = new Product("Bangles","Joyalukkas","17-01-26",70000,"Store","no","p@171","India",ProductTypes.JEWLLERY,warrantyYears.TWELVE_YEARS);
		Product product72 = new Product("Lathe","Kirloskar","16-01-26",200000,"Industry","no","p@172","India",ProductTypes.INDUSTRY,warrantyYears.TEN_YEARS);
		Product product73 = new Product("Monitor","Dell","15-01-26",12000,"Amazon","no","p@173","India",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product74 = new Product("Biscuits","Parle","14-01-26",20,"Store","yes","p@174","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product75 = new Product("Chain","Kalyan","13-01-26",50000,"Store","no","p@175","India",ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product76 = new Product("Generator","Kirloskar","12-01-26",130000,"Dealer","no","p@176","India",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		Product product77 = new Product("TV","LG","11-01-26",45000,"Croma","no","p@177","India",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product78 = new Product("Oil","Fortune","10-01-26",190,"Store","yes","p@178","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product79 = new Product("Ring","Malabar","09-01-26",32000,"Store","no","p@179","India",ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product80 = new Product("Pump","CRI","08-01-26",14000,"Dealer","no","p@180","India",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		Product product81 = new Product("Speaker","Sony","07-01-26",6000,"Amazon","no","p@181","Japan",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product82 = new Product("Rice","IndiaGate","06-01-26",1300,"Store","yes","p@182","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product83 = new Product("Necklace","Tanishq","05-01-26",88000,"Store","no","p@183","India",ProductTypes.JEWLLERY,warrantyYears.TWELVE_YEARS);
		Product product84 = new Product("Crane","L&T","04-01-26",1000000,"Industry","no","p@184","India",ProductTypes.INDUSTRY,warrantyYears.TEN_YEARS);
		Product product85 = new Product("Mobile","OnePlus","03-01-26",40000,"Amazon","no","p@185","China",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product86 = new Product("Tea","Tata","02-01-26",270,"Store","yes","p@186","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product87 = new Product("Bracelet","Malabar","01-01-26",47000,"Store","no","p@187","India",ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product88 = new Product("Boiler","Thermax","31-12-25",280000,"Industry","no","p@188","India",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		Product product89 = new Product("Laptop","Asus","30-12-25",75000,"Amazon","no","p@189","Taiwan",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product90 = new Product("Sugar","Madhur","29-12-25",48,"Store","yes","p@190","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product91 = new Product("Pendant","Kalyan","28-12-25",21000,"Store","no","p@191","India",ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product92 = new Product("Excavator","JCB","27-12-25",1100000,"Industry","no","p@192","UK",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		Product product93 = new Product("Router","D-Link","26-12-25",2300,"Amazon","no","p@193","Taiwan",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product94 = new Product("Dal","Aashirvaad","25-12-25",155,"Store","yes","p@194","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product95 = new Product("Bangles","Tanishq","24-12-25",72000,"Store","no","p@195","India",ProductTypes.JEWLLERY,warrantyYears.TWELVE_YEARS);
		Product product96 = new Product("Lathe","HMT","23-12-25",210000,"Industry","no","p@196","India",ProductTypes.INDUSTRY,warrantyYears.TEN_YEARS);
		Product product97 = new Product("Monitor","HP","22-12-25",11000,"Amazon","no","p@197","USA",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product98 = new Product("Biscuits","GoodDay","21-12-25",25,"Store","yes","p@198","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product99 = new Product("Chain","Malabar","20-12-25",53000,"Store","no","p@199","India",ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product100 = new Product("Generator","Cummins","19-12-25",140000,"Dealer","no","p@200","USA",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);			
		Product product101 = new Product("AC","Daikin","18-12-25",42000,"Amazon","no","p@201","Japan",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product102 = new Product("Rice","Daawat","17-12-25",1400,"Store","yes","p@202","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product103 = new Product("Necklace","Kalyan","16-12-25",92000,"Store","no","p@203","India",ProductTypes.JEWLLERY,warrantyYears.TWELVE_YEARS);
		Product product104 = new Product("Crane","Tata","15-12-25",1100000,"Industry","no","p@204","India",ProductTypes.INDUSTRY,warrantyYears.TEN_YEARS);
		Product product105 = new Product("Mobile","Vivo","14-12-25",25000,"Flipkart","no","p@205","China",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product106 = new Product("Tea","BrookeBond","13-12-25",260,"Store","yes","p@206","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product107 = new Product("Bracelet","Tanishq","12-12-25",48000,"Store","no","p@207","India",ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product108 = new Product("Boiler","BHEL","11-12-25",320000,"Industry","no","p@208","India",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		Product product109 = new Product("Laptop","Lenovo","10-12-25",68000,"Amazon","no","p@209","China",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product110 = new Product("Sugar","Dhampur","09-12-25",52,"Store","yes","p@210","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product111 = new Product("Pendant","Malabar","08-12-25",23000,"Store","no","p@211","India",ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product112 = new Product("Excavator","CAT","07-12-25",1300000,"Industry","no","p@212","USA",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		Product product113 = new Product("Router","Netgear","06-12-25",2700,"Amazon","no","p@213","USA",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product114 = new Product("Dal","Fortune","05-12-25",165,"Store","yes","p@214","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product115 = new Product("Bangles","Kalyan","04-12-25",75000,"Store","no","p@215","India",ProductTypes.JEWLLERY,warrantyYears.TWELVE_YEARS);
		Product product116 = new Product("Lathe","Kirloskar","03-12-25",220000,"Industry","no","p@216","India",ProductTypes.INDUSTRY,warrantyYears.TEN_YEARS);
		Product product117 = new Product("Monitor","Acer","02-12-25",11500,"Amazon","no","p@217","Taiwan",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product118 = new Product("Biscuits","Oreo","01-12-25",30,"Store","yes","p@218","USA",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product119 = new Product("Chain","Joyalukkas","30-11-25",54000,"Store","no","p@219","India",ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product120 = new Product("Generator","Honda","29-11-25",150000,"Dealer","no","p@220","Japan",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		Product product121 = new Product("Speaker","Boat","28-11-25",3500,"Amazon","no","p@221","India",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product122 = new Product("Rice","IndiaGate","27-11-25",1250,"Store","yes","p@222","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product123 = new Product("Necklace","Tanishq","26-11-25",97000,"Store","no","p@223","India",ProductTypes.JEWLLERY,warrantyYears.TWELVE_YEARS);
		Product product124 = new Product("Crane","Liebherr","25-11-25",1200000,"Industry","no","p@224","Germany",ProductTypes.INDUSTRY,warrantyYears.TEN_YEARS);
		Product product125 = new Product("Mobile","Realme","24-11-25",18000,"Flipkart","no","p@225","India",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product126 = new Product("Tea","TataGold","23-11-25",280,"Store","yes","p@226","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product127 = new Product("Bracelet","Malabar","22-11-25",50000,"Store","no","p@227","India",ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product128 = new Product("Boiler","Thermax","21-11-25",350000,"Industry","no","p@228","India",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		Product product129 = new Product("Laptop","MSI","20-11-25",90000,"Amazon","no","p@229","Taiwan",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product130 = new Product("Sugar","Madhur","19-11-25",55,"Store","yes","p@230","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product131 = new Product("Pendant","Kalyan","18-11-25",24000,"Store","no","p@231","India",ProductTypes.JEWLLERY,warrantyYears.TEN_YEARS);
		Product product132 = new Product("Excavator","Volvo","17-11-25",1400000,"Industry","no","p@232","Sweden",ProductTypes.INDUSTRY,warrantyYears.TWELVE_YEARS);
		Product product133 = new Product("Router","TP-Link","16-11-25",2600,"Amazon","no","p@233","China",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);
		Product product134 = new Product("Dal","Tata","15-11-25",170,"Store","yes","p@234","India",ProductTypes.GROCERYS,warrantyYears.FIVE_YEARS);
		Product product135 = new Product("Bangles","Tanishq","14-11-25",78000,"Store","no","p@235","India",ProductTypes.JEWLLERY,warrantyYears.TWELVE_YEARS);
		Product product136 = new Product("Lathe","HMT","13-11-25",230000,"Industry","no","p@236","India",ProductTypes.INDUSTRY,warrantyYears.TEN_YEARS);
		Product product137 = new Product("Monitor","LG","12-11-25",12500,"Amazon","no","p@237","India",ProductTypes.ELECTRIC,warrantyYears.TWO_YEARS);	
				

		Product[] items1={product2,product3,product4,product5,product6,product7,product8,product9,product10,product11};
		productStore.save(items1);
		System.out.println("=======================================");
		
		Product[] items2={product12,product13,product14,product15,product16,product17,product18,product19,product20,product21};
		productStore.save(items2);
		System.out.println("=======================================");
		
		
		Product[] items3={product22,product23,product24,product25,product26,product27,product28,product29,product30,product31};
		productStore.save(items3);
		System.out.println("=======================================");
		
		
		Product[] items4={product32,product33,product34,product35,product36,product37,product38,product39,product40,product41};
		productStore.save(items4);
		System.out.println("=======================================");
		
		Product[] items5={product42,product43,product44,product45,product46,product47,product48,product49,product50,product51};
		productStore.save(items5);
		System.out.println("=======================================");
		
		
		Product[] items6={product52,product53,product54,product55,product56,product57,product58,product59,product60,product61};
		productStore.save(items6);
		System.out.println("=======================================");
		
		
		Product[] items7={product62,product63,product64,product65,product66,product67,product68,product69,product70,product71};
		productStore.save(items7);
		System.out.println("=======================================");
		
		
		Product[] items8={product72,product73,product74,product75,product76,product77,product78,product79,product80,product81};
		productStore.save(items8);
		System.out.println("=======================================");
		
		
		Product[] items9={product82,product83,product84,product85,product86,product87,product88,product89,product90,product91};
		productStore.save(items9);
		System.out.println("=======================================");
		
		
		Product[] items10={product92,product93,product94,product95,product96,product97,product98,product99,product100,product101};
		productStore.save(items10);
		System.out.println("=======================================");
		
		
		Product[] items11={product102,product103,product104,product105,product106,product107,product108,product109,product110,product111};
		productStore.save(items11);
		System.out.println("=======================================");
		
		
		Product[] items12={product112,product113,product114,product115,product116,product117,product118,product119,product120,product121};
		productStore.save(items12);
		System.out.println("=======================================");
		
		Product[] items13={product122,product123,product124,product125,product126,product127,product128,product129,product130,product131};
		productStore.save(items13);
		System.out.println("=======================================");
		
		Product[] items14={product132,product133,product134,product135,product136,product137};
		productStore.save(items14);
		System.out.println("=======================================");
		
		System.out.println(productStore.search("p@105" , "milk"));
		System.out.println("=======================================");
		
		System.out.println(productStore.search("p@106","Shirt"));
		System.out.println("=======================================");
		
		System.out.println(productStore.checkWarrantyExpired("p@113"));
		System.out.println("=======================================");
		
		productStore.getAllOriginCountry();
		System.out.println("=======================================");
		
		System.out.println(productStore.checkWarrantyExpired("p@113"));
		System.out.println("=======================================");
		
		
		
		productStore.displayAllProducts();
		System.out.println("=======================================");
		
		productStore.getProductsByType(ProductTypes.ELECTRIC);
		System.out.println("=======================================");
		
		productStore.getProductsByWarrantyYears(warrantyYears.FIVE_YEARS);
		System.out.println("=======================================");
	

	
		
	}
}
		
		
		
	
	
	
