class Spa{
	
	String name;
	double price;
	int services;
	boolean quality;
	String product;
	
	ShopName shopName;
	Owner owner;
	Location location;
	Branch branch;
	 
	 Spa(String name,double price,int services,boolean quality,String product,
	 ShopName shopName,Owner owner,Location location,Branch branch)
	 {
		 this.name=name;
		 this.price=price;
		 this.services=services;
		 this.quality=quality;
		 this.product=product;
		 this.shopeName=shopeName;
		 this.owner=owner;
		 this.location=location;
		 this.branch=branch;	 
	 }
	void getInfo()
	{
		System.out.println("name of spa:"+name);
		System.out.println("price of one services:"+price);
		System.out.println("services available:"+services);
		System.out.println("quality of services:"+quality);
		System.out.println("product uses in services:"+product);
		System.out.println("shopeName:"+shopName);
		System.out.println("owner Name:"+owner);
		System.out.println("location:"+location);
		System.out.println("branch:"+branch);
		
	}
	
}