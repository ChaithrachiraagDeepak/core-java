class Product{
	
	String name;
	String make;
	String mfgDate;
	int cost;
	String seller;
	String warrantyExpired;
	String uniqueId;
	String originCountry;
	ProductTypes productTypes;
	warrantyYears warrantyYears;
	
	Product(String name,String make,String mfgDate,int cost,String seller,String warrantyExpired,
	String uniqueId,String originCountry, ProductTypes productTypes,warrantyYears warrantyYears)
	{
		this.name=name;
		this.make=make;
		this.mfgDate=mfgDate;
		this.cost=cost;
		this.seller=seller;
		this.warrantyExpired=warrantyExpired;
		this.uniqueId=uniqueId;
		this.originCountry=originCountry;
		this.warrantyYears=warrantyYears;
		this.productTypes=productTypes;
		
	}
	 
	void getInfo()
	{
		System.out.println("name:"+name);
		System.out.println("make:"+make);
		System.out.println("mfgDate:"+mfgDate);
		System.out.println("cost:"+cost);
		System.out.println("seller:"+seller);
		System.out.println("warrantyExpired:"+warrantyExpired);
		System.out.println("uniqueId:"+uniqueId);
		System.out.println("originCountry:"+originCountry);
		System.out.println("warrantyYears:"+warrantyYears);
		System.out.println("productTypes:"+productTypes);
	}
}