class Gum {

    String brand;
    String flavor;
    int price;
    int pieces;
    boolean sweet;
    String color;

    Gum(String brand, String flavor, int price, int pieces, boolean sweet, String color) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.pieces = pieces;
        this.sweet = sweet;
        this.color = color;
    }

    void info() {
        System.out.println("brand: " + brand);
        System.out.println("flavor: " + flavor);
        System.out.println("price: " + price);
        System.out.println("pieces: " + pieces);
        System.out.println("isSweet: " + sweet);
        System.out.println("color: " + color);
    }
}