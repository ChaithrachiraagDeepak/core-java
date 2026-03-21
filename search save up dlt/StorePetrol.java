class StorePetrol{
	
	String[]companies;
	int currenctIndex=0;	
	StorePetrol(String[] companies)
	{
		this.companies=companies;
	}
	
	void comp(String company)
	{
		System.out.println("executing comp in  storepetrol:");
		System.out.println("company:"+company);
		if(this.companies!=null)
		{
			System.out.println("checking to comp");
			int companiesIndex=this.companies.length-1;
			if(this.currenctIndex <=companiesIndex)
			{
				System.out.println("storing comp in index:"+this.currenctIndex);
				this.companies[this.currenctIndex]=company;
				this.currenctIndex++;
				System.out.println("Storing comp in next index:"+this.currenctIndex);
			}else{
				System.out.println("array is full cannot store more types");
			}
			
		}
		else{
			System.out.println("types are not inital with array");
		}
	}
	
	boolean search(String name)
	{
		System.out.println("executing the seach.......");
		if(name!=null)
		{
		System.out.println("name is not null....");
		if(this.companies!=null)
		{
			for(String compy:this.companies)
			{
				System.out.println("comparing with:"+compy);
				if(compy == name)
				{
					System.out.println("companies name:"+compy);
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
			if(companies!=null){
				System.out.println("array is existed");
				if(index>=0 && index<=this.companies.length-1){
					this.companies[index] == name;
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
					for(int i=0; i<=this.companies.length-1;i++){
						if(this.companies[i]==oldName)
						{
							this.companies[i]= newName;
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
				for(int index=0; index<=this.companies.length-1;index++){
						if(index== dltvalue){
							this.companies[index] = null;
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
			for(int i=0; i<this.companies.length-1;i++){
				if(this.companies[i]== value){
					this.singers[i]= null;
					return true;
				}
					
				}
			}
			return false;
		}	
	
}