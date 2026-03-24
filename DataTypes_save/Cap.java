class Cap {

    String brand;
    String color;
    int price;
    String size;
    String type;
    boolean available;

    Cap(String brand, String color, int price, String size, String type, boolean available) 
	{
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.size = size;
        this.type = type;
        this.available = available;
    }

    void info()
	{
        System.out.println("brand:" + brand);
        System.out.println("color:" + color);
        System.out.println("price:" + price);
        System.out.println("size:" + size);
        System.out.println("type:" + type);
        System.out.println("available:" + available);
    }
}