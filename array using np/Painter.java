class Painter{
	
	String[] brands;
	Paint[] paints;
	
	Painter(String[]brands,Paint[] paints)
	{
		this.brands=brands;
		this.paints=paints;
	}
	void getInfo()
	{
		System.out.println("==============getiing info of paints");
		if(this.brands!=null){
			System.out.println("brands of paints:"+this.brands.length);
			for(String brand:this.brands){
				System.out.println("brand:"+brand);
			}
		}
		
		if(this.paints!=null){
			System.out.println("total paints:"+this.paints.length);
			for(Paint paint:this.paints){
				paint.printInfo();
			}
		}
	}
}