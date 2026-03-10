class Task7Runner{

    public static void main(String[] args) {

        MouseCompany mousecompany = new MouseCompany("Zebronics");
        Scroller scroller = new Scroller("Scroller is Working");
        Connection connection = new Connection("Bluetooth");
        Applicable applicable = new Applicable("Applicable for all Laptops");
        MouseColor mousecolor = new MouseColor("White");

        Mouse mouse = new Mouse("Razer", 399, true, false, 5,
                                mousecompany, scroller, connection, applicable, mousecolor);

        mouse.getMouseDetails();
		System.out.println("----!!!-----!!!-----!!!-----");
		
		
		
		Teapot teapot=new Teapot("wood");
		Infuser infuser=new Infuser("yes infuser");
		Honey honey=new Honey("yes honey in tea");
		Biscuits biscuits=new Biscuits("goodday");
		ServingTray servingTray=new ServingTray("yes serving with tray");
	  
		Tea tea = new Tea("elachiTea", 20, 4,true,"shahukarChai",teapot,infuser,honey,biscuits,servingTray);		
		
		tea.getInfo();
		
		
		ShopName shopName = new ShopName("unisexual spa salon");
		Owner owner = new Owner("karthik");
		Location location = new Location("BTM");
		Branch branch = new Branch("RR");
		
		Spa spa = new Spa("royal",500,20,true,"loreal",shopName,owner,location,branch);
		
		spa.getInfo();
		System.out.println("----!!!-----!!!-----!!!-----");
		
		
		
		BrandName brandName= new BrandName("mahindre");
		ModelName modelName=ModelName("2w12w")
		Color color=Color("blue");
		SpeedLevels  speedLevels= SpeedLevels("23");
		SpareMotor spareMotor= SpareMotor("good spareMotor");
		
		Motor motor = new Motor(12,63.2,"highpower","goodquality",true,brandName,modelName,color,speedLevels,spareMotor);
		
		motor.getInfo();
		System.out.println("----!!!-----!!!-----!!!-----");
		
		
		
		AquariumName aquariumName= new AquariumName("liqiii");
		Location1 location1= new Location1("silkboard");
		FishType fishType=new FishType("goldfish")
		Decoration decoration=new Decoration("decorated");
		BranchAquarium branchAquarium= new BranchAquarium("dvg");
		
		Aquarium aquarium = new Aquarium(23,"starFish",15,"gelly",true,aquariumName,location1,fishType,decoration,branchAquarium);
		
		aquarium.getInfo();
		System.out.println("----!!!-----!!!-----!!!-----");
		
		
		
			
		TeamName teamName=new TeamName("RCB");
		Player player = new Player("batting");
		Captain captain= new Captain("virat");
		HomeGround homeGround= new HomeGround("chinnaswamy");
		Coach coach= new Coach("bumruh");
		
		Ipl ipl = new Ipl(543,7,true,"chinnaswamy",true,teamName,player,captain,homeGround,coach);
		
		ipl.getInfo();
		System.out.println("----!!!-----!!!-----!!!-----");
		
		
		
		Type type = new Type("Cumulus");
		Location location = new Location("Sky");
		Weather weather = new Weather("Rainy");
		Sky sky = new Sky("Blue");
		Sun sun = new Sun("Bright");

		Cloud cloud = new Cloud(5000,80,true,"White",true,type,location,weather,sky,sun);

		cloud.getInfo();
		System.out.println("----!!!-----!!!-----!!!-----");
		
		
	}
}