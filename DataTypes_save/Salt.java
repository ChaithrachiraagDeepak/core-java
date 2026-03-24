class Salt {

    String brand;
    String type;
    int price;
    String use;
    String color;

    Salt(String brand, String type, int price, String use,  String color)
	{
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.use = use;
        this.color = color;
    }

    void info() 
	{
        System.out.println("brand: " + brand);
        System.out.println("type: " + type);
        System.out.println("price: " + price);
        System.out.println("use: " + use);
        System.out.println("color: " + color);
    }
}