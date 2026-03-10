class Parliament{
	String state;
	District district;
	Members members;
	
	Parliament(String state, District district, Members members){
		this.state=state;
		this.district=district;
		this.members=members;
	}
	void printInfo(){
		System.out.println("State:"+this.state);
		System.out.println("District:"+this.district);
		
		if(this.members!=null){
			this.members.getCount();
		}
		else{
			System.out.println("state cannot be null");
		}
	}
}