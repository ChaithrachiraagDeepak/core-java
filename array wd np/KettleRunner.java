class KettleRunner
{
	public static void main(String... values)
	{
		String[] types = new String[10];

		Kettle kettle = new Kettle(types);

		kettle.save("Electric kettle");
		kettle.save("Steel kettle");
		kettle.save("Glass kettle");
		kettle.save("Whistling kettle");
		kettle.save("Travel kettle");
		kettle.save("Tea kettle");
		kettle.save("Cordless kettle");
		kettle.save("Ceramic kettle");
		kettle.save("Copper kettle");
		kettle.save("Plastic kettle");

		System.out.println("-----------------------------------------------");

		boolean found = kettle.search("Glass kettle");
		System.out.println("kettle name found:" + found);
		System.out.println("-----------------------------------------------");
		
		
		boolean get = kettle.update( 3 ,"5star-kettle");
		System.out.println("we updated new kettle:"+get);
		System.out.println("-----------------------------------------------");
		
		
		boolean view = kettle.update("Plastic kettle", "kitkat");
		System.out.println("updated oldname to newname:"+view);
		System.out.println("-----------------------------------------------");
		
		
		boolean dltname = kettle.delete (9);
		System.out.println("deleting the 9th index"+dltname);
		System.out.println("-----------------------------------------------");
		
		
		boolean dltStrng = kettle.delete ("Electric kettle");
		System.out.println("deleting the indexname using string"+dltStrng);
		System.out.println("-----------------------------------------------");
		
	}
}