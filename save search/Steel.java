class Steel {
	
	String[] types;
	int currenctIndex = 0;

	Steel(String[] types)
	{
		this.types = types;
	}

	void dashboard(String type)
	{
		System.out.println("executing createin Steel:");
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
		System.out.println("executing search in Steel");

		if(type != null)
		{
			System.out.println("name is not null");

			if(this.types != null)
			{
				for(String iron : this.types)
				{
					System.out.println("comparing with types:" + iron);

					if(iron == type)
					{
						System.out.println("steelname:" + type);
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
}