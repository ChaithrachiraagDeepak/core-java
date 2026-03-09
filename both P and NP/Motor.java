class Motor{
	
	int motorId;
    double price;
    String power;
	String quality;
    boolean isWorking;
	
	BrandName brandName;
    ModelName modelName;
    Color color;
    SpeedLevels  speedLevels;
    SpareMotor spareMotor;
	
	Motor(int motorId,double price,String power,String quality,boolean isWorking,BrandName brandName,
    ModelName modelName,Color color,SpeedLevels  speedLevels,SpareMotor spareMotor)
	{
		this.motorId=motorId;
		this.price=price;
		this.power=power;;
		this.quality=quality;
		this.isWorking=isWorking;
		this.brandName=brandName;
		this.modelName=modelName;
		this.color=color;
		this.speedLevels=speedLevels;
		this.spareMotor=spareMotor;
		
	}
	void getInfo()
	{
		System.out.println("motorId:"+motorId);
		System.out.println("price:"+price);
		System.out.println("power:"+power);
		System.out.println("quality:"+quality);
		System.out.println("isWorking:"+isWorking);
		System.out.println("brandName:"+brandName);
		System.out.println("modelName:"+modelName);
		System.out.println("color:"+color);
		System.out.println("spareMotor:"+spareMotor);
		System.out.println("speedLevels:"+speedLevels);
		
	}
	
}