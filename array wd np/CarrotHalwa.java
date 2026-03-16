class CarrotHalwa{
	String[] ingredients;
	Nut[] nuts;

	CarrotHalwa(String[] ingredients,Nut[] nuts){
		this.ingredients=ingredients;
		this.nuts=nuts;
	}

	void printInfo(){
		System.out.println("\n------ CarrotHalwa Information ------");

		if(this.ingredients!=null){
			for(String ingredient:this.ingredients){
				System.out.println("ingredient:"+ingredient);
			}
		}

		if(this.nuts!=null){
			for(Nut nut:this.nuts){
				nut.getInfo();
			}
		}
	}
}