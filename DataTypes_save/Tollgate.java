class Tollgate {

    String tollName;
    String vehicleType;
    int fee;
    String location;
    boolean open;
    int waitingTime;

    Tollgate(String tollName, String vehicleType, int fee, String location, boolean open, int waitingTime)
	{
        this.tollName = tollName;
        this.vehicleType = vehicleType;
        this.fee = fee;
        this.location = location;
        this.open = open;
        this.waitingTime = waitingTime;
    }

    void info() 
	{
        System.out.println("tollName: " + tollName);
        System.out.println("vehicleType: " + vehicleType);
        System.out.println("fee: " + fee);
        System.out.println("location: " + location);
        System.out.println("isOpen: " + open);
        System.out.println("waitingTime: " + waitingTime);
    }
}