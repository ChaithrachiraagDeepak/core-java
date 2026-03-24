class TurbineRunner
{
	public static void main(String... values)
	{
		String[] types = new String[10];

		Turbine turbine = new Turbine(types);

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
		System.out.println("-----------------------------------------------");
		
		boolean values1 = turbine.update(5, "chirag");
		System.out.println("the array is updated :"+values1);
	
	
		boolean abc = turbine.updates("Gas turbine", "hero");
		System.out.println("the new name is updated :"+abc);
		System.out.println("-----------------------------------------------");
		
		boolean xyz = turbine.delete(3);
		System.out.println("name is dleted:"+xyz);
		System.out.println("-----------------------------------------------");
		
		boolean qwe = turbine.delete("Impulse turbine");
		System.out.println("removing vaue");
		System.out.println("-----------------------------------------------");
		
		
		
		
	}
}