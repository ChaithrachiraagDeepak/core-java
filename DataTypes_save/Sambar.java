class Sambar {

    String hotelName;
    String taste;
    int price;
    String mainIngredient;
    boolean hot;
    String color;

    Sambar(String hotelName, String taste, int price, String mainIngredient, boolean hot, String color) {
        this.hotelName = hotelName;
        this.taste = taste;
        this.price = price;
        this.mainIngredient = mainIngredient;
        this.isHot = hot;
        this.color = color;
    }

    void info() {
        System.out.println("hotelName: " + hotelName);
        System.out.println("taste: " + taste);
        System.out.println("price: " + price);
        System.out.println("mainIngredient: " + mainIngredient);
        System.out.println("isHot: " + hot);
        System.out.println("color: " + color);
    }
}