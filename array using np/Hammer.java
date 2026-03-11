class Hammer{
	String[] types;
	Metal[] metals;

	Hammer(String[] types,Metal[] metals){
		this.types=types;
		this.metals=metals;
	}

	void printInfo(){
		System.out.println("\n------ Hammer Information ------");

		if(this.types!=null){
			for(String type:this.types){
				System.out.println("type:"+type);
			}
		}

		if(this.metals!=null){
			for(Metal metal:this.metals){
				metal.getInfo();
			}
		}
	}
}