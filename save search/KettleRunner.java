class KettleRunner
{
	public static void main(String... values)
	{
		String[] types = new String[10];

		StoreKettleTypes kettle = new StoreKettleTypes(types);

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
	}
}