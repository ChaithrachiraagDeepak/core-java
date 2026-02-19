class FmRadio{
	static void turnOnOrOff()
	{
		System.out.println("");
	}
	
	
	static void setFrequency(double frequency)
	{
		System.out.println("frequency is floating between some value:"+frequency);
		if(frequency>108.0)
		{
			System.out.println("give info is less than 108.0Mhz");
			return;
		}
		System.out.println("given frequencyis valid");
	}
	
	
	static void increaseVolume(int increment)
	{
		System.out.println("frequencyis increaseVolume:"+increment);
		if(increment>100)
		{
			System.out.println("sound is greater  than 100");
		}
	}
	
	static void decreseVolume(int decrese)
	{
		System.out.println("frequencyis decreseVolume:"+decrese);
		if(decrese<10)
		{
			System.out.println("sound is less than 10");
		}
	}
	
	
	
	static void saveStation(String stationName)
	{
		System.out.println("name of the station :"+stationName);
		if(!=null)
		{
			System.out.println("given station is valid");
		}
	}
}