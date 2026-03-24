class Clothh{
	
	String brand;
	String types;
	int price;
	String shopeName;
	boolean quality;
	String colour;
	
	Clothh (String brand, String types, int price, String shopeName,boolean quality,String colour)
	{
		
		 this.brand=brand;
		 this.types=types;
		 this.price=price;
		 this.shopeName=shopeName;
		 this.quality=quality;
		 this.colour=colour;
	}	 
		 
		void getInfo()
	{ 
		 System.out.println("brand:"+this.brand);
		 System.out.println("types:"+this.types); 
		 System.out.println("price:"+this.price);
		 System.out.println("shopeName:"+this.shopeName);
		 System.out.println("quality:"+this.quality);
		 System.out.println("colour:"+this.colour);
		 	 
	}
	
}