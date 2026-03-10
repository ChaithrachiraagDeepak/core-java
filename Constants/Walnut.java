class Walnut{
	String quality;
	WalnutArea area;
	WalnutTraders traders;

	Walnut(String quality,WalnutArea area,WalnutTraders traders){
		this.quality=quality;
		this.area=area;
		this.traders=traders;
	}

	void printInfo(){
		System.out.println("Quality:"+this.quality);
		System.out.println("Area:"+this.area);

		if(this.traders!=null){
			this.traders.getCount();
		}
	}
}