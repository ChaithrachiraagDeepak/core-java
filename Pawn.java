class Pawn{
    String color;
    double weight;
    String material;
    boolean active;
    int position;
	
	Pawn()
	{
		
	}
	Pawn(String color)
	{
		this.color=color;
	}
	
	Pawn(String color,double weight)
	{
		this.color=color;
		this.weight=weight;
	}
	Pawn(String color,double weight, String material)
	{
		this.color=color;
		this.weight=weight;
		this.material=material;
	}
	Pawn(String color,double weight, String material, boolean active)
	{
		this.color=color;
		this.weight=weight;
		this.material=material;
		this.active=active;
	}
	Pawn(String color,double weight, String material, boolean active, int position)
	{
		this.color=color;
		this.weight=weight;
		this.material=material;
		this.active=active;
		this.position=position;	
	}