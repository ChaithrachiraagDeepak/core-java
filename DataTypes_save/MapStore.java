class MapStore {

    Map[] mapInfo;
    int currentIndex = 0;

    MapStore(Map[] mapInfo)
	{
        this.mapInfo = mapInfo;
    }

    void save(Map map)
	{
        System.out.println("executing map in mapInfo");

        if (this.mapInfo != null && map != null) 
		{
            if (this.currentIndex < this.mapInfo.length)
				{
                this.mapInfo[currentIndex] = map;
                this.currentIndex++;
            } else {
                System.out.println("cannot store here array is full");
            }
        } else {
            System.out.println("array is null");
        }
    }
}