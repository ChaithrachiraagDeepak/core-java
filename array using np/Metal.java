class Metal{
	String type;
	double weight;

	Metal(String type,double weight){
		this.type=type;
		this.weight=weight;
	}

	void getInfo(){
		System.out.println("metal:"+type);
		System.out.println("weight:"+weight);
	}
}