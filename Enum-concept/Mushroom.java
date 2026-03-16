class Mushroom{
	String type;
	MushroomArea area;
	MushroomGrowers growers;

	Mushroom(String type,MushroomArea area,MushroomGrowers growers){
		this.type=type;
		this.area=area;
		this.growers=growers;
	}

	void printInfo(){
		System.out.println("Type:"+this.type);
		System.out.println("Area:"+this.area);

		if(this.growers!=null){
			this.growers.getCount();
		}
	}
}