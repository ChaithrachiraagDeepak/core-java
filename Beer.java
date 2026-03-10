class Beer{
	String brand;
	BeerArea area;
	BeerShops shops;
	Beer(String brand,BeerArea area,BeerShops shops){
		this.brand=brand;
		this.area=area;
		this.shops=shops;
	}

	void printInfo(){
		System.out.println("Brand:"+this.brand);
		System.out.println("Area:"+this.area);

		if(this.shops!=null){
			this.shops.getCount();
		}
	}
}