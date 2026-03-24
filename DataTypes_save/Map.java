class Map {

    String placeName;
    String location;
    int distance;
    String transportType;
    boolean open;
    String famousThing;

    Map(String placeName, String location, int distance, String transportType, boolean open, String famousThing) 
	{
        this.placeName = placeName;
        this.location = location;
        this.distance = distance;
        this.transportType = transportType;
        this.open = open;
        this.famousThing = famousThing;
    }

    void info() 
	{
        System.out.println("placeName:" + placeName);
        System.out.println("location:" + location);
        System.out.println("distance:" + distance);
        System.out.println("transportType:" + transportType);
        System.out.println("isOpen:" + open);
        System.out.println("famousThing:" + famousThing);
    }
}