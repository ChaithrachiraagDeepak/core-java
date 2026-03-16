class Tea{
	 String name;
	 double price;
	 int total;
	 boolean quality;
	 String shopName;
	 
	  Teapot teapot;
      Infuser infuser;
      Honey honey;
      Biscuits biscuits;
      ServingTray servingTray;
	  
	  Tea(String name,double price,int total, boolean quality,String shopName, Teapot teapot,
	  Infuser infuser,Honey honey,Biscuits biscuits,ServingTray servingTray)
	  {
		  this.name=name;
		  this.price=price;
		  this.total=total;
		  this.quality=quality;
		  this.shopName=shopName;
		  this.teapot=teapot;
		  this.infuser=infuser;
		  this.honey=honey;
		  this.biscuits=biscuits;
		  this.servingTray=servingTray; 
	  }
	  void getInfo()
	  {
		  System.out.println("getting information about tea");
		  System.out.println("name of tea:"+name);
		  System.out.println("price of tea:"+name);
		  System.out.println("total how much tea ordered:"+total);
		  System.out.println("quality of tea:"+name);
		  System.out.println("shopNameof tea:"+shopName);
		  System.out.println("teapot:"+teapot);
		  System.out.println("infuser:"+infuser);
		  System.out.println("honey is added:"+honey);
		  System.out.println("biscuits is available:"+biscuits);
		  System.out.println("is tea is serving in Tray:"+servingTray);
		  
	  }

	
	
	
	
}