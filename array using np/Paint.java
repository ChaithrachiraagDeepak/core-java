class Paint{
	
	String color;
	int price;
	
	Paint(String color,int price)
	{
		this.color=color;
		this.price=price;
	}
	void printInfo()
	{
		System.out.println("color:"+color);
		System.out.println("price:"+price);
	}
}