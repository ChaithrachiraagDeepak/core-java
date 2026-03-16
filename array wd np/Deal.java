class Deal{
	String company;
	double amount;

	Deal(String company,double amount){
		this.company=company;
		this.amount=amount;
	}

	void getInfo(){
		System.out.println("company:"+company);
		System.out.println("amount:"+amount);
	}
}
