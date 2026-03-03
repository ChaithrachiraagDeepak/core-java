class Bird{
	
	static String  getColorByName(String name){
		
		System.out.println("Name of the bird:"+name);
		if(name==null)
		{
			System.out.println("Name cannot be null");
	    	return null;
		}
		
		if(name=="Sparrow")
		{
			return "Brownmix";
		}
		
		if(name=="Pigeon")
		{	
			return "white";
		}
		if(name=="Flamingo")
		{
			return "Pinky";
		}
		if(name=="Swan")
		{			
			return "Whitee";
		}
		if(name=="Eagle")
		{
			return "Dark Brownn";
		}
		if(name=="Myna")
		{
			return "Brown";
		}
		if(name=="Koel")
		{	
			return"Black";
		}
		if(name=="Indian peafowl")
		{	
			return"Bright Blue";
		}
		if(name=="Bulbul")
		{
			return "Brown";	
		}
		if(name=="Robin")
		{
			return"Black and White";
		}
		if(name=="Owl")
		{
			return "Golden brown";
		}
		if (name=="Peacock")
		{
			return "Blue and Green";
		}                                                               
		if (name=="Parrot")
		{
			return "Green";
		}
		
		if(name=="Crow")
		{
			return "Black";	
		}
		if(name=="Dove"){
			return"Black and white";
		}
		if(name=="Indian Roller")
		{
			return "Bright blue";
		}
		if(name=="Black kite")
		{	
			return "Dark brown";
		}
		if(name=="Baya Weaver")
		{
			return "Yellow";
		}
		if(name=="Bee eater")
		{
			return "Bright Green";
		}
		if(name=="Indian Robbin")
		{
			return "Darkbrown";
		}
		if(name=="sunbird"){
			return "Purple";
		}
		System.out.println("Name is not matching with Database");
		return null;
	}
}