class DmartRunner{
	
	public static void main(String...values)
	{
		ProtienBar protienbar1=new ProtienBar(10);
		Product product1=Product.CAKE;
		Dmart dmart1 = new Dmart(23,product1,protienbar1);
		dmart1.printInfo();
		
		

		System.out.println("\n=======");
		ProtienBar protienbar2=new ProtienBar(20);
		Product product2= Product.DRYFRUITS;
		Dmart dmart2 = new Dmart(45,product2,protienbar2);
		dmart2.printInfo();
		
		
		System.out.println("\n=======");
		ProtienBar protienbar3=new ProtienBar(30);
		Product product3= Product.VEGETABLES;
		Dmart dmart3 = new Dmart(55,product3,protienbar3);
		dmart3.printInfo();
		
		
		System.out.println("\n=======");
		ProtienBar protienbar4=new ProtienBar(40);
		Product product4= Product.CLOTHES;
		Dmart dmart4 = new Dmart(66,product4,protienbar4);
		dmart4.printInfo();
		
		
		
	}
}