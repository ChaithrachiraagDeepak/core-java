class Aquarium{
	
	int tankSize;
    String fishName;
    int waterLevel;
    String type;
    boolean hasFilter;
	
	AquariumName aquariumName;
    Location1 location1;
    FishType fishType;
    Decoration decoration;
    BranchAquarium branchAquarium;
	
	
	Aquarium(int tankSize,String fishName,int waterLevel,String type,boolean hasFilter,AquariumName aquariumName,
    Location1 location1,FishType fishType,Decoration decoration,BranchAquarium branchAquarium)
	{
	 this.tankSize=tankSize;
	 this.fishName=fishName;
	 this.waterLevel=waterLevel;
	 this.type=type;
	 this.hasFilter=hasFilter;
	 this.aquariumName=aquariumName;
	 this.location1=location1;
	 this.fishType=fishType;
	 this.decoration=decoration;
	 this.branchAquarium=branchAquarium;
	}
	void getInfo()
	{
		System.out.println("tankSize:"+tankSize);
		System.out.println("fishName:"+fishName);
		System.out.println("waterLevel:"+waterLevel);
		System.out.println("type:"+type);
		System.out.println("hasFilter:"+hasFilter);
		System.out.println("aquariumName:"+aquariumName);
		System.out.println("location:"+location1);
		System.out.println("fishType:"+fishType);
		System.out.println("decoration:"+decoration);
		System.out.println("branchAquarium:"+branchAquarium);
		
	}

}