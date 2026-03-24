class Profile {

    String name;
    int age;
    String city;
    String job;
    String hobby;

    Profile(String name, int age, String city, String job, boolean isActive, String hobby)
	{
        this.name = name;
        this.age = age;
        this.city = city;
        this.job = job;
        this.hobby = hobby;
    }

    void info() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("city: " + city);
        System.out.println("job: " + job);
        System.out.println("hobby: " + hobby);
    }
}