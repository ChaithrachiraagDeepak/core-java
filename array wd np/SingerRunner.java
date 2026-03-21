class SingerRunner{
	
	public static void main(String[]args){
		
		String[]singers=new String[20];
		SingerNames singerNames= new SingerNames(singers);
		singerNames.music("punithrajkumar");
		System.out.println("<---------->");
		singerNames.music("sanjith hegde");
		System.out.println("<---------->");
		
		singerNames.music("arman malik");
		System.out.println("<---------->");
		
		singerNames.music("chitra");
		System.out.println("<---------->");
		
		singerNames.music("anuaradha batt");
		System.out.println("<---------->");
		
		singerNames.music("rajesh krishnan");
		System.out.println("<---------->");
		
		singerNames.music("indu ");
		System.out.println("<---------->");
		
		singerNames.music("lakshmi");
		System.out.println("<---------->");
		
		singerNames.music("janaki");
		System.out.println("<---------->");
		
		singerNames.music("vijay prakash");
		System.out.println("<---------->");
		
		singerNames.music("SPB");
		System.out.println("<---------->");
		
		singerNames.music("dhanusha");
		System.out.println("<---------->");
		
		singerNames.music("sahana");
		System.out.println("<---------->");
		
		singerNames.music("bhavana");
		System.out.println("<---------->");
		
		singerNames.music("rajkumar");
		System.out.println("<---------->");
		
		singerNames.music("sudeepa");
		System.out.println("<---------->");
		
		singerNames.music("chirag");
		System.out.println("<---------->");
		
		singerNames.music("sadhu kokila");
	
		singerNames.music("hemanth");
		singerNames.music("shreya goshal");
		
		
		boolean found=singerNames.search("punithrajkumar");
		System.out.println("singerNames name found:"+found);
		System.out.println("-----------------------------------------------");
		
		
		boolean take = singerNames.update(3,"baby");
		System.out.println("we updated new name:"+take);
		System.out.println("-----------------------------------------------");
		
		boolean get = singerNames.update("anuaradha batt", "sleeping");
		System.out.println("we updated name using string:"+get);
		System.out.println("-----------------------------------------------");
		
		boolean store = singerNames.delete(8);
		System.out.println("deleing the mentioned index:"+store);
		System.out.println("-----------------------------------------------");
		
		boolean storing = singerNames.delete("lakshmi");
		System.out.println("deleting index using stirng");
		System.out.println("-----------------------------------------------");

		
	}
}