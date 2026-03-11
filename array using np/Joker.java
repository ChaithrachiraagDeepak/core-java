class Joker{
	String[] styles;
	Show[] shows;

	Joker(String[] styles,Show[] shows){
		this.styles=styles;
		this.shows=shows;
	}

	void printInfo(){
		System.out.println("\n------ Joker Information ------");

		if(this.styles!=null){
			for(String style:this.styles){
				System.out.println("style:"+style);
			}
		}

		if(this.shows!=null){
			for(Show show:this.shows){
				show.getInfo();
			}
		}
	}
}