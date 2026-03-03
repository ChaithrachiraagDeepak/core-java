class ShoeLaceRunner{

    public static void main(String[] args){

        String brand = "Nike";
        String color = "Black";
        double length = 120.5;
        String material = "Cotton";
        double price = 199.99;
        boolean isElastic = false;
        String size = "Medium";
        String pattern = "Plain";
        int stock = 100;
        String quality = "High";

        ShoeLace lace = new ShoeLace(
                brand, color, length, material,
                price, isElastic, size,
                pattern, stock, quality
        );

        System.out.println("Brand: " + lace.brand);
        System.out.println("Color: " + lace.color);
        System.out.println("Length: " + lace.length);
        System.out.println("Material: " + lace.material);
        System.out.println("Price: " + lace.price);
        System.out.println("Is Elastic: " + lace.isElastic);
        System.out.println("Size: " + lace.size);
        System.out.println("Pattern: " + lace.pattern);
        System.out.println("Stock: " + lace.stock);
        System.out.println("Quality: " + lace.quality);
    }
}