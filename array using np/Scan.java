class Scan{
	String mode;
	int image;

	Scan(String mode,int image){
		this.mode=mode;
		this.image=image;
	}

	void getInfo(){
		System.out.println("mode:"+mode);
		System.out.println("image:"+image);
	}
}