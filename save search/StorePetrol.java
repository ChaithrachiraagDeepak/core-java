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
	
	
}