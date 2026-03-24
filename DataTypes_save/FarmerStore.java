class  FarmerStore{
	
	Farmer[] farmerinfo;
	int currenctIndex=0;
	
	FarmerStore (Farmer[] farmerinfo)
	{
		this.farmerinfo=farmerinfo;
	}
	
	void save (Farmer farmer)
	{
		System.out.println("executing farmer in farmerinfo");
		if(this.farmerinfo!= null && farmer!=null){
			if(this.currenctIndex<this.farmerinfo.length){
				this.farmerinfo[currenctIndex]=farmer;
				this.currenctIndex++;
			}
		}else{
			System.out.println("array is full cannot store farmerinfo");
		}
		
		
	}
	
}