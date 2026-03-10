class Mouse{

    String brand;
    double price;
    boolean bluetooth;
    boolean wired;
    int quantity;

    MouseCompany mousecompany;
    Scroller scroller;
    Connection connection;
    Applicable applicable;
    MouseColor mousecolor;

    Mouse(String brand, double price, boolean bluetooth, boolean wired, int quantity,
          MouseCompany mousecompany, Scroller scroller, Connection connection,
          Applicable applicable, MouseColor mousecolor){

        this.brand = brand;
        this.price = price;
        this.bluetooth = bluetooth;
        this.wired = wired;
        this.quantity = quantity;
        this.mousecompany = mousecompany;
        this.scroller = scroller;
        this.connection = connection;
        this.applicable = applicable;
        this.mousecolor = mousecolor;
    }
	
	void getMouseDetails(){

        System.out.println("Getting Mouse Details");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Bluetooth: " + this.bluetooth);
        System.out.println("Wired: " + this.wired);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Company: " + this.mousecompany);
        System.out.println("Scroller: " + this.scroller);
        System.out.println("Connection: " + this.connection);
        System.out.println("Applicable: " + this.applicable);
        System.out.println("Color: " + this.mousecolor);
    }
}