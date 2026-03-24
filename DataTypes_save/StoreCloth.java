class StoreCloth{
	

	 Clothh[] cloths;
	int currentIndex=0;
	
	StoreCloth (Clothh[]cloths)
	{
		this.cloths=cloths;
	}
	
	void save (Clothh clothh)
	{
		
		if(this.cloths != null && clothh != null)	
		{
			System.out.println("executing cloths in storecloths");
			
			if(this.currentIndex<this.cloths.length){
				
				this.cloths[this.currentIndex]=clothh;
				this.currentIndex++;	
			}
		}else{
			System.out.println("array is full cannont store cloths");
		}
		
	}
	
}