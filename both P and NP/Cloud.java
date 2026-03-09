class Cloud{
	
	int height;
	int density;
	boolean raining;
	String color;
	boolean visible;
	
	Type type;
	Location2 location2;
	Weather weather;
	Sky sky;
	Sun sun;
	
	
	Cloud(int height,int density,boolean raining,String color,boolean visible,
	Type type,Location2 location2,Weather weather,Sky sky,Sun sun)
	{
		this.height=height;
		this.density=density;
		this.raining=raining;
		this.color=color;
		this.visible=visible;
		this.type=type;
		this.location2=location2;
		this.weather=weather;
		this.sky=sky;
		this.sun=sun;
	}
	
	void getInfo()
	{
		System.out.println("height:"+height);
		System.out.println("density:"+density);
		System.out.println("raining:"+raining);
		System.out.println("color:"+color);
		System.out.println("visible:"+visible);
		System.out.println("type:"+type);
		System.out.println("location:"+location2);
		System.out.println("weather:"+weather);
		System.out.println("sky:"+sky);
		System.out.println("sun:"+sun);
	}
	
}