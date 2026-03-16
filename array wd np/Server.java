class Server{
	String[] types;
	DataCenter[] centers;

	Server(String[] types,DataCenter[] centers){
		this.types=types;
		this.centers=centers;
	}

	void printInfo(){
		System.out.println("\n------ Server Information ------");

		if(this.types!=null){
			for(String type:this.types){
				System.out.println("type:"+type);
			}
		}

		if(this.centers!=null){
			for(DataCenter center:this.centers){
				center.getInfo();
			}
		}
	}
}