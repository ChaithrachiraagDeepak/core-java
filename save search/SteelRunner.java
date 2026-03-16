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
	}
}