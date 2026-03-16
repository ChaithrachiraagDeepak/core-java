class Show{
	String place;
	int audience;

	Show(String place,int audience){
		this.place=place;
		this.audience=audience;
	}

	void getInfo(){
		System.out.println("place:"+place);
		System.out.println("audience:"+audience);
	}
}