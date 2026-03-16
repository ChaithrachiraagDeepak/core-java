class Paneer{
	String brand;
	PaneerArea area;
	PaneerShops shops;

	Paneer(String brand,PaneerArea area,PaneerShops shops){
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