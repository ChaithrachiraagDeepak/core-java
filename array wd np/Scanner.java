class Scanner{
	String[] brandsname;
	Scan[] scans;

	Scanner(String[] brandsname,Scan[] scans){
		this.brandsname=brandsname;
		this.scans=scans;
	}

	void printInfo(){
		System.out.println("\n------ Scanner Information ------");

		if(this.brandsname!=null){
			for(String brand:this.brandsname){
				System.out.println("brand:"+brand);
			}
		}

		if(this.scans!=null){
			for(Scan scan:this.scans){
				scan.getInfo();
			}
		}
	}
}