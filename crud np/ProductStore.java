class ProductStore{
	
	Product[] productsinfo;
	int currenctIndex=0;
	
	
	ProductStore(Product[] productsinfo)
	{
		this.productsinfo=productsinfo;
	}
	
	void save(Product product)
	{
		System.out.println("executing save in productStore..:");
		if(this.productsinfo!=null && product!=null)
		{
			System.out.println("name is not null");
			
			int index =this.productsinfo.length-1;
			if(this.currenctIndex<= index)
			{
				this.productsinfo[currenctIndex]=product;
				this.currenctIndex++;
				
			}
		}else{
			System.out.println("array is full cannot store the products");
		}
	}
	
	
	/*void save(Product[] products)
	{
		System.out.println("executing save in multiple time in productStore with array");
		if(productsinfo!= null && this.productsinfo != null)
		{
			System.out.println("now array is not null.");
			int index = this.productsinfo.length-1;
			if(this.currenctIndex <= index)
			{
				int counting=0;

				for(Product product:this.products)
				{
					if(product!=null)
					{
						this.productsinfo[this.currenctIndex]=product;
						
						this.currenctIndex++;
						System.out.println("productstored:"+counting);
					}
				counting++;
				if(counting >= 10)
				{
					System.out.println("you cannot store more than 10 items");
					break;
				}
			}
				
		}else{
			System.out.println("productsinformation and array is null");
		}
	}
	}*/
	
	void save(Product[] products)
{
    System.out.println("executing save in multiple time in productStore with array");

    if(products != null && this.productsinfo != null)
    {
        System.out.println("now array is not null.");

        for(Product product : products)
        {
            if(product != null && this.currenctIndex < this.productsinfo.length)
            {
                this.productsinfo[this.currenctIndex] = product;
                System.out.println("Product stored at index: " + this.currenctIndex);
                this.currenctIndex++;
            }
        }
    }
    else
    {
        System.out.println("products information or array is null");
    }
}
	String searchByUniqueId(String id)
	{
		System.out.println("executing searchByUniqeId in productStore");
		if(this.productsinfo!=null)
		{
			for(Product product:this.productsinfo)
			{
				if(product!=null && id.equals(product.uniqueId))
				{
						return "found";
				}
			}
		}else{
			System.out.println("arrayis null or not present");
		}
		return "not found";
	}
	
	String search(String id, String productName)
	{
		System.out.println("executing search in productStore");
		if(this.productsinfo!=null && productName!=null)
		{
			for(Product product:this.productsinfo)
			{
				if(product!=null)
				{
					if( id.equals(product.uniqueId) && productName.equals(product.name))
					{
						return "found";
					}
				}
			}
		}else{
			System.out.println("array is absent");
		}
		return "not found";
	}
	
	
	String searchByUniqeIdAndNameAndOriginCountry(String id,String productName,String country)
	{
		System.out.println("executing search with id,name and originCountry in ProductStore");
		if(this.productsinfo!=null && productName!=null && country!=null)
		{
			for(Product product:this.productsinfo)
			{
				if(product!=null)
				{
					if(id.equals(product.uniqueId) &&productName.equals(product.name) &&country.equals(product.originCountry))
					{
						return "found";
					}
				}
			}
		}
		else
		{
			System.out.println("Array is absent");
		}
		return "notfound";
	}
	
	
	
	void getAllOriginCountry()
	{
		System.out.println("executing getAllOriginCountry in ProductStore");
		if(this.productsinfo!=null)
		{
			for(Product product:this.productsinfo)
			{
				if(product!=null)
				{
					System.out.println(product.originCountry);
				}
			}
		}
		else
		{
			System.out.println("Array is absent");
		}
	}
	
	
	
	boolean checkWarrantyExpired(String id)
	{
		System.out.println("executing checkWarrantyExpired in ProductStore");
		if(this.productsinfo!=null)
		{
			for(Product product:this.productsinfo)
			{
				if(product!=null && id.equals(product.uniqueId))
				{
					return "yes" .equals(product.warrantyExpired);
				}
			}
		}
		else
		{
			System.out.println("Array is absent");
		}
		
		
		return true;
	}
	
	
	
	void displayAllProducts()
	{
		System.out.println("executing displayAllProducts in ProductStore");
		if(this.productsinfo!=null)
		{
			for(Product product:this.productsinfo)
			{
				if(product!=null)
				{
					product.getInfo();
				}
			}
		}
		else
		{
			System.out.println("array is absent");
		}
	}
	
	
	void getProductsByType(ProductTypes productTypes)
 {
    System.out.println("executing getProductsByType");

    if(productTypes != null && this.productsinfo != null)
    {
        for(Product product : this.productsinfo)
        {
            if(product != null && product.productTypes == productTypes)
            {
                System.out.println(product.name);
            }
        }
    }
}
	
	
	
	
		void getProductsByWarrantyYears(warrantyYears warranty)
	{
		System.out.println("executing getProductsByType in ProductStore");
		if(warranty!=null && this.productsinfo!=null)
		{
			for(Product product:this.productsinfo)
			{
				if(product!=null && warranty==product.warrantyYears)
				{
					System.out.println(product.name);
				}
			}
		}
		else
		{
			System.out.println("array is full");
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
