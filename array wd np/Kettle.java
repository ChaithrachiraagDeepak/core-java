class Kettle {
	
	String[] types;
	int currenctIndex = 0;

	Kettle(String[] types)
	{
		this.types = types;
	}

	void save(String type)
	{
		System.out.println("executing createin Kettle:");
		System.out.println("type:" + type);

		if(this.types != null)
		{
			System.out.println("checking to store");
			int typesIndex = this.types.length - 1;

			if(this.currenctIndex <= typesIndex)
			{
				System.out.println("storing in index:" + this.currenctIndex);
				this.types[this.currenctIndex] = type;
				this.currenctIndex++;
				System.out.println("Storing in next index:" + this.currenctIndex);
			}
			else{
				System.out.println("array is full cannot store more types");
			}
		}
		else{
			System.out.println("types are not inital with array");
		}
	}

	boolean search(String type)
	{
		System.out.println("executing search in Kettle");

		if(type != null)
		{
			System.out.println("name is not null");

			if(this.types != null)
			{
				for(String kettles : this.types)
				{
					System.out.println("comparing with types:" + kettles);

					if(kettles == type)
					{
						System.out.println("kettlename:" + type);
						return true;
					}
				}
			}
			else{
				System.out.println("type is null");
			}
		}

		return false;
	}
	
	boolean  update(int index ,String name)
	{
		System.out.println("index:"+index);
		System.out.println("name:"+name);
		
		
		if(name!=null){
			System.out.println("name is not null");
			if(types!=null){
				System.out.println("type array is exist");
				if(index>=0 && index<= this.types.length-1)
				{
					this.types[index]=name;
					return true;
				
				}
			}else{
				System.out.println("name is null,array not found");
			}
		}
		return false;
	}
	
	boolean update (String oldName, String newName)
	{
		System.out.println("oldName:"+oldName);
		System.out.println("newName:"+newName);
		
		if(oldName!=null){
			System.out.println("u can update oldName");
			if(newName!=null){
				System.out.println("yes give newNameto update");
				for(int i=0; i<=this.types.length-1;i++){
					if(this.types[i]==oldName){
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
	
	boolean delete(String value)
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

