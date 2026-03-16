class Wood{
	String type;
	double length;
	
	Wood(String type,double length){
	  this.type=type;
	  this.length=length;
	}
	void getInfo(){
	System.out.println("wood type:"+this.type);
		System.out.println("wood length:"+this.length);
	}
}