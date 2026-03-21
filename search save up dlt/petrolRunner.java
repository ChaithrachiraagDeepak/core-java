class petrolRunner{
	
	
	
	public static void main(String[]arg){
		
		
		String[]companies= new String[4];
		StorePetrol storepetrol = new StorePetrol(companies);
		storepetrol.comp("EUR");
		System.out.println("<======******========>");
		storepetrol.comp("CAD");
		System.out.println("<======******========>");
		storepetrol.comp("AUD");
		System.out.println("<======******========>");
		storepetrol.comp("SGD");
		System.out.println("<======******========>");
		storepetrol.comp("INR");
		System.out.println("<======******========>");
		
		
		
		boolean found=storepetrol.search("CAD");
		System.out.println("petrol name found:"+found);
		System.out.println("-----------------------------------------------");
		
		
		boolean take = storepetrol.update(3,"dont know");
		System.out.println("we updated new name:"+take);
		System.out.println("-----------------------------------------------");
		
		boolean get = singerNames.update("INR", "newpetroo");
		System.out.println("we updated name using string:"+get);
		System.out.println("-----------------------------------------------");
		
		boolean store = singerNames.delete(8);
		System.out.println("deleing the mentioned index:"+store);
		System.out.println("-----------------------------------------------");
		
		boolean storing = singerNames.delete("SGD");
		System.out.println("deleting index using stirng");
		System.out.println("-----------------------------------------------");

		
	}
}