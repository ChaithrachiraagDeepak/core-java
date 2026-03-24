class CloudSoftware {

    String name;
    String company;
    int users;
    String planType;
    boolean paid;
    int storage;

    CloudSoftware(String name, String company, int users, String planType, boolean paid, int storage) 
	{
        this.name = name;
        this.company = company;
        this.users = users;
        this.planType = planType;
        this.paid = paid;
        this.storage = storage;
    }

    void info()
	{
        System.out.println("name:" + name);
        System.out.println("company:" + company);
        System.out.println("users:" + users);
        System.out.println("planType:" + planType);
        System.out.println("isPaid:" + paid);
        System.out.println("storage:" + storage);
    }
}