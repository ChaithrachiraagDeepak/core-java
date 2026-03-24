class Cashew{
	String grade;
	CashewArea area;
	CashewFarmers farmers;

	Cashew(String grade,CashewArea area,CashewFarmers farmers){
		this.grade=grade;
		this.area=area;
		this.farmers=farmers;
	}

	void printInfo(){
		System.out.println("Grade:"+this.grade);
		System.out.println("Area:"+this.area);

		if(this.farmers!=null){
			this.farmers.getCount();
		}
	}
}