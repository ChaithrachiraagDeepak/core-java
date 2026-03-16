class Cloth{
	String material;
	double size;

	Cloth(String material,double size){
		this.material=material;
		this.size=size;
	}

	void getInfo(){
		System.out.println("material:"+material);
		System.out.println("size:"+size);
	}
}