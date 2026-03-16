class Calendar{
	String brand;
	CalendarArea area;
	CalendarSellers sellers;

	Calendar(String brand,CalendarArea area,CalendarSellers sellers){
		this.brand=brand;
		this.area=area;
		this.sellers=sellers;
	}

	void printInfo(){
		System.out.println("Calendar Brand:"+this.brand);
		System.out.println("Area:"+this.area);

		if(this.sellers!=null){
			this.sellers.getCount();
		}
	}
}