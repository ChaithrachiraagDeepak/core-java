class Banner{
	String[] colors;
	Cloth[] cloths;

	Banner(String[] colors,Cloth[] cloths){
		this.colors=colors;
		this.cloths=cloths;
	}

	void printInfo(){
		System.out.println("\n------ Banner Information ------");

		if(this.colors!=null){
			for(String color:this.colors){
				System.out.println("color:"+color);
			}
		}

		if(this.cloths!=null){
			for(Cloth cloth:this.cloths){
				cloth.getInfo();
			}
		}
	}
}