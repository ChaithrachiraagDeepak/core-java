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
		
		
		
		
		
		boolean found = storepasta.search("white sauce pasta");
		System.out.println("kettle name found:" + found);
		System.out.println("-----------------------------------------------");
		
		
		boolean get = storepasta.update( 3 ,"5star hotel");
		System.out.println("we updated new hotel:"+get);
		System.out.println("-----------------------------------------------");
		
		
		boolean view = storepasta.update("cheese pasta", "chessecorn pasta");
		System.out.println("updated oldname to newname:"+view);
		System.out.println("-----------------------------------------------");
		
		
		boolean dltname = storepasta.delet (9);
		System.out.println("deleting the 9th index"+dltname);
		System.out.println("-----------------------------------------------");
		
		
		boolean dltStrng = storepasta.delet ("green sauce pasta");
		System.out.println("deleting the indexname using string"+dltStrng);
		System.out.println("-----------------------------------------------");
		
	}	
		
}