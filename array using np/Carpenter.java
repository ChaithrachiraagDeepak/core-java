class Carpenter{
	String[] furnitures;
	Wood[] woods;
	
	Carpenter(String[] furnitures, Wood[] woods){
		this.furnitures=furnitures;
		this.woods=woods;
	}
	void printInfo(){
		System.out.println("\n--------------------->Carpenter informatioon");
		if(this.furnitures!=null){
			System.out.println("furnitures length:"+this.furnitures.length);
			for(String furniture:this.furnitures){
				System.out.println("furniture:"+furniture);
			}
		}
		if(this.woods!=null){
			System.out.println("wood length:"+this.woods.length);
			for(Wood wood:this.woods){
			wood.getInfo();
			}
		}
	}
}