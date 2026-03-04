class FastFood{
    String name;
    double price;
    String taste;
    boolean spicy;
    int calories;

    FastFood(){
    }

    FastFood(String name){
        this.name = name;
    }

    FastFood(String name, double price){
        this.name = name;
        this.price = price;
    }

    FastFood(String name, double price, String taste){
        this.name = name;
        this.price = price;
        this.taste = taste;
    }

    FastFood(String name, double price, String taste, boolean spicy){
        this.name = name;
        this.price = price;
        this.taste = taste;
        this.spicy = spicy;
    }

    FastFood(String name, double price, String taste, boolean spicy, int calories){
        this.name = name;
        this.price = price;
        this.taste = taste;
        this.spicy = spicy;
        this.calories = calories;
    }
}