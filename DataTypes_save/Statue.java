class Statue {

    String name;
    String material;
    int height;
    String location;
    String color;

    Statue(String name, String material, int height, String location, String color) 
	{
        this.name = name;
        this.material = material;
        this.height = height;
        this.location = location;
        this.color = color;
    }

    void info() 
	{
        System.out.println("name: " + name);
        System.out.println("material: " + material);
        System.out.println("height: " + height);
        System.out.println("location: " + location);
        System.out.println("color: " + color);
    }
}