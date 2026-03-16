class TurbineRunner
{
	public static void main(String... values)
	{
		String[] types = new String[10];

		StoreTurbineTypes turbine = new StoreTurbineTypes(types);

		turbine.save("Steam turbine");
		turbine.save("Gas turbine");
		turbine.save("Water turbine");
		turbine.save("Wind turbine");
		turbine.save("Kaplan turbine");
		turbine.save("Pelton turbine");
		turbine.save("Francis turbine");
		turbine.save("Impulse turbine");
		turbine.save("Reaction turbine");
		turbine.save("Hydraulic turbine");

		System.out.println("-----------------------------------------------");

		boolean found = turbine.search("Wind turbine");
		System.out.println("turbine name found:" + found);
	}
}