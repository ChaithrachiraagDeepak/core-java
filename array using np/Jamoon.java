class Jamoon{
	String[] flavours;
	Sweet[] sweets;

	Jamoon(String[] flavours, Sweet[] sweets){
		this.flavours=flavours;
		this.sweets=sweets;
	}

	void printInfo(){
		System.out.println("\n------ Jamoon Information ------");

		if(this.flavours!=null){
			System.out.println("flavours length:"+this.flavours.length);
			for(String flavour:this.flavours){
				System.out.println("flavour:"+flavour);
			}
		}

		if(this.sweets!=null){
			System.out.println("sweet length:"+this.sweets.length);
			for(Sweet sweet:this.sweets){
				sweet.getInfo();
			}
		}
	}
}