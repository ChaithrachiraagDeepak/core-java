class Pumpkin{
	String type;
	District district;
	Members members;

	Pumpkin(String type, District district, Members members){
		this.type=type;
		this.district=district;
		this.members=members;
	}

	void printInfo(){
		System.out.println("Type:"+this.type);
		System.out.println("District:"+this.district);

		if(this.members!=null){
			this.members.getCount();
		}
		else{
			System.out.println("members cannot be null");
		}
	}
}