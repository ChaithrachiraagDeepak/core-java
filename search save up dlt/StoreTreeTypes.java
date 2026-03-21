class StoreTreeTypes{
	String[] trees;
	int curIndex=0;
	
	StoreTreeTypes(String[] trees)
	{
		this.trees=trees;
		this.curIndex=curIndex;
	}
	void save(String name)
	{
		System.out.println("executing the save in types..........");
		if(this.trees!=null)
		{
			System.out.println("name:"+name);
			int index=this.trees.length-1;
			if(this.curIndex <= index)
			{
				this.trees[curIndex]=name;
				this.curIndex++;
				System.out.println("Executing the next index:"+this.curIndex);
			}
			else{
				System.out.println("Array is full");
			}
		}
		else
		{
			System.out.println("array cannot be .....");
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
			for(String tree:this.trees)
			{
				System.out.println("comparing with:"+tree);
				if(tree == name)
				{
					System.out.println("tree name:"+tree);
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