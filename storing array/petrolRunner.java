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
		
		
	}
}