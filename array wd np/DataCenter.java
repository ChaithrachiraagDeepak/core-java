class DataCenter{
	String location;
	int servers;

	DataCenter(String location,int servers){
		this.location=location;
		this.servers=servers;
	}

	void getInfo(){
		System.out.println("location:"+location);
		System.out.println("servers:"+servers);
	}
}