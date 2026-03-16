class Nut{
	String name;
	int quantity;

	Nut(String name,int quantity){
		this.name=name;
		this.quantity=quantity;
	}

	void getInfo(){
		System.out.println("nut:"+name);
		System.out.println("quantity:"+quantity);
	}
}