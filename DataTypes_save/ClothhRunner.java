class ClothhRunner{
	
	public static void main(String...values){
		
		Clothh [] cloths= new Clothh[10]; 
		
		
		Clothh clothh=new Clothh("zara","farmals",4500,"sagarExeclusive",true,"black&white");
		StoreCloth storeCloth= new StoreCloth(cloths);
		storeCloth.save(clothh);
		clothh.getInfo();
		System.out.println("=======================================");
		
		Clothh clothh2=new Clothh("puma","farmals",6600,"BSCExeclusive",true,"white");
		StoreCloth storeCloth2= new StoreCloth(cloths);
		storeCloth2.save(clothh2);
		clothh2.getInfo();
		System.out.println("=======================================");

		
		Clothh clothh3=new Clothh("focus","jeans",1800,"Execlusive",true,"black");
		StoreCloth storeCloth3= new StoreCloth(cloths);
		storeCloth3.save(clothh3);
		clothh3.getInfo();
		System.out.println("=======================================");
		

		Clothh clothh4=new Clothh("Crest & Crown","shirt",99900,"royalcollections",true,"purple");
		StoreCloth storeCloth4= new StoreCloth(cloths);
		storeCloth.save(clothh4);
		clothh4.getInfo();
		System.out.println("=======================================");
		
		
		Clothh clothh5=new Clothh("neo","kurta",7866,"royalcollections",true,"pink mix");
		StoreCloth storeCloth5= new StoreCloth(cloths);
		storeCloth.save(clothh5);
		clothh5.getInfo();
		System.out.println("=======================================");
		
		Clothh clothh6=new Clothh("golden","palzo",9900,"prices",true,"cream");
		StoreCloth storeCloth6= new StoreCloth(cloths);
		storeCloth.save(clothh6);
		clothh6.getInfo();
		System.out.println("=======================================");
		
		Clothh clothh7=new Clothh("valenne","t-shirt",4500,"royal",true,"red");
		StoreCloth storeCloth7= new StoreCloth(cloths);
		storeCloth.save(clothh7);
		clothh7.getInfo();
		System.out.println("=======================================");
		
		Clothh clothh8=new Clothh("butterfly","laggins",8800,"BSC",true,"GREY");
		StoreCloth storeCloth8= new StoreCloth(cloths);
		storeCloth.save(clothh8);
		clothh8.getInfo();
		System.out.println("=======================================");
		
		Clothh clothh9=new Clothh("ELAN","shorts",9900,"lulumall",true,"green");
		StoreCloth storeCloth9= new StoreCloth(cloths);
		storeCloth.save(clothh9);
		clothh9.getInfo();
		System.out.println("=======================================");
		
		Clothh clothh10=new Clothh("crenew mode","saree",654330,"mall of asia",true,"goldmix");
		StoreCloth storeCloth10= new StoreCloth(cloths);
		storeCloth.save(clothh10);
		clothh10.getInfo();
		System.out.println("=======================================");
		
	}
}