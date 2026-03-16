class BullshitRunner{
	
	public static void main(String...args){
		
		String[]types= new String[3];
		types[0]="laser printer";
		types[1]="3D printer";
		types[2]="thermal printer";
		
		Print print1=  new Print("black & white",5);
		Print print2= new Print("color",10);
		Print print3= new Print("front back",3);
		
		Print[] print = new Print[3];
		print[0]= print1;
		print[1]=print2;
		print[2]=print3;
		
		Printer printer = new Printer(types,print);
		printer.display();
		  
		
		
	}
	
}