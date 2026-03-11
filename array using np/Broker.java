class Broker{
	String[] markets;
	Deal[] deals;

	Broker(String[] markets,Deal[] deals){
		this.markets=markets;
		this.deals=deals;
	}

	void printInfo(){
		System.out.println("\n------ Broker Information ------");

		if(this.markets!=null){
			for(String market:this.markets){
				System.out.println("market:"+market);
			}
		}

		if(this.deals!=null){
			for(Deal deal:this.deals){
				deal.getInfo();
			}
		}
	}
}