class TwoWheeler {
	
	String[]types;
	int currenctIndex=0;	
	TwoWheeler(String[] types)
	{
		this.types=types;
	}
	
	void dashboard(String type)
	{
		System.out.println("executing createin  TwoWheeler:");
		System.out.println("type:"+type);
		if(this.types!=null)
		{
			System.out.println("checking to store");
			int typesIndex=this.types.length-1;
			if(this.currenctIndex <=typesIndex)
			{
				System.out.println("storing in index:"+this.currenctIndex);
				this.types[this.currenctIndex]=type;
				this.currenctIndex++;
				System.out.println("Storing in next index:"+this.currenctIndex);
			}else{
				System.out.println("array is full cannot store more types");
			}
			
		}
		else{
			System.out.println("types are not inital with array");
		}
	}
	
	
}
	
