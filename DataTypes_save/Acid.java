class Acid {

    String name;
    String taste;
    int strength;
    String use;
    boolean dangerous;
    String color;

    Acid(String name, String taste, int strength, String use, boolean dangerous, String color)
	{
        this.name = name;
        this.taste = taste;
        this.strength = strength;
        this.use = use;
        this.dangerous = dangerous;
        this.color = color;
    }

    void info()
	{
        System.out.println("name:" + name);
        System.out.println("taste:" + taste);
        System.out.println("strength:" + strength);
        System.out.println("use:" + use);
        System.out.println("dangerous:" + dangerous);
        System.out.println("color:" + color);
    }
}