class Dmart{
	int noOfFloors;
	Product product;
	ProtienBar protienBar;
	
	Dmart(int noOfFloors,Product product,ProtienBar protienBar)
	{
		this.noOfFloors=noOfFloors;
		this.product=product;	
		this.protienBar=protienBar;
	}
	
	void printInfo()
	{
		System.out.println("noOfFloors:"+this.noOfFloors);
		System.out.println("product:"+this.product);
		if(this.protienBar!=null)
		{
			this.protienBar.getCount();
		}
		else{
			System.out.println("state cannont be null");
		}
	}
}