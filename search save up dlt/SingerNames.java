class SingerNames{
	
	String[]singers;
	int currenctIndex=0;
	
	SingerNames(String[]singers)
	{
		this.singers=singers;
		
	}
	void music(String singer)
	{
		System.out.println("executing music in singersname");
		System.out.println("singers:"+singer);
		if(this.singers!=null)
		{
			System.out.println("checking the singers");
			int singersIndex=this.singers.length-1;
			if(this.currenctIndex<=singersIndex)
			{
				System.out.println("music storing to sing"+this.currenctIndex);
				this.singers[this.currenctIndex]=singer;
				this.currenctIndex++;;
				System.out.println("music is stroing ins index"+this.currenctIndex);
			}else{
				System.out.println("array is full cannot store the musics");
			}
		}else{
			
			System.out.println("singers are not initial with array");
		}
	}
	
	boolean search(String name)
	{
		System.out.println("executing the seach.......");
		if(name!=null)
		{
		System.out.println("name is not null....");
		if(this.trees!=null)
		{
			for(String sing:this.trees)
			{
				System.out.println("comparing with:"+sing);
				if(sing == name)
				{
					System.out.println("tree name:"+sing);
					return true;
				}
			}
		}
		}
		else
		{
			System.out.println("name cannot be ..........");
		}
		return false;
	}
	
	
	
	
	boolean update(int index,String name)
	{
		System.out.println("index"+index);
		System.out.println("name:"+name);
		if(name!=null)
		{
			System.out.println("name is not null");
			if(types!=null){
				System.out.println("array is existed");
				if(index>=0 && index<=this.types.length-1){
					this.types[index] == name;
					return true;
						
					}
				}
			}
			return false;
		}
		
		
		boolean update(String oldName, String newName)
		{
			System.out.println("oldName:"+oldName);
			System.out.println("newName:"+newName);
			
			if(oldName!=null){
				System.out.println("update oldName");
				if(newName!=null){
					System.out.println("update newname");
					for(int i=0; i<=this.types.length-1;i++){
						if(this.types[i]==oldName)
						{
							this.types[i]= newName;
							return true;
						}
					}
				
				}
			}
			return false;
			
		}
		
		
		boolean delete (int dltvalue)
	{
		System.out.println("dltvalue:"+dltvalue);
		if(dltvalue!=0){
			System.out.println("deleting currenctIndex");
				for(int index=0; index<=this.types.length-1;index++){
						if(index== dltvalue){
							this.types[index] = null;
							return true;
						}
				}
					
		}
		return false ;
	}
	
	boolean delete (String value)
	{
		System.out.println("value:"+value);
		if(value!=null){
			System.out.println("deleting currenctIndex");
			for(int i=0; i<this.types.length-1;i++){
				if(this.types[i]== value){
					this.types[i]= null;
					return true;
				}
					
				}
			}
			return false;
		}	
}