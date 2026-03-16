class PastaRunner{
	
	
	public static void main(String[]args){
		
		
		String[]types = new String[4];
		StorePasta storepasta= new StorePasta(types);
		
		storepasta.create("red sauce pasta");
		System.out.println("<--------!!!!!!-------->");
		storepasta.create("white sauce pasta");
		System.out.println("<--------!!!!!!-------->");
		storepasta.create("green sauce pasta");
		System.out.println("<--------!!!!!-------->");
		storepasta.create("cheese pasta");
		System.out.println("<-------!!!!!!--------->");
		storepasta.create("corn pasta");
		System.out.println("<--------!!!!!!!-------->");
		
		
	}	
	
}