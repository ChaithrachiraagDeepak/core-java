class SteelRunner
{
	public static void main(String... values)
	{
		String[] types = new String[10];

		StoreSteelTypes steel = new StoreSteelTypes(types);

		steel.save("Alloy steel");
		steel.save("Carbon steel");
		steel.save("Stainless steel");
		steel.save("Tool steel");
		steel.save("Spring steel");
		steel.save("Mild steel");
		steel.save("High speed steel");
		steel.save("Galvanized steel");
		steel.save("Cast steel");
		steel.save("Structural steel");

		System.out.println("-----------------------------------------------");

		boolean found = steel.search("Mild steel");
		System.out.println("steel name found:" + found);
		System.out.println("-----------------------------------------------");
		
		
		boolean get = steel.update(6,"High speed steel");
		System.out.println("name is updated:" + get);
		System.out.println("-----------------------------------------------");)
		
		
		
		boolean get1 = steel.update(6,"High speed steel");
		System.out.println("name is updated:" + get1);
		System.out.println("-----------------------------------------------");)
		
		
		boolean view = steel.update("Structural steel","sky");
		System.out.println("updated vlaue string"+ view);
		System.out.println("-----------------------------------------------");)
		
		
		boolean iot  = steel.delete(7);
		System.out.println("deleting the 7th index"+iot);
		System.out.println("-----------------------------------------------");
		
		
		boolean pop = steel.delete("Cast steel");
		System.out.println("deleting the indexname using string"+pop);
		System.out.println("-----------------------------------------------");)
		
		
	}
}