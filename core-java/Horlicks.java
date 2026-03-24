class Horlicks{
	String flavour;
	HorlicksArea area;
	HorlicksCustomers customers;

	Horlicks(String flavour,HorlicksArea area,HorlicksCustomers customers){
		this.flavour=flavour;
		this.area=area;
		this.customers=customers;
	}

	void printInfo(){
		System.out.println("Flavour:"+this.flavour);
		System.out.println("Area:"+this.area);

		if(this.customers!=null){
			this.customers.getCount();
		}
	}
}