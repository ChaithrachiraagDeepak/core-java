class JacketRunner{

    public static void main(String[] args){

  
        String brand = "Puma";
        String size = "L";
        String color = "Black";
        double price = 3499.99;
        String material = "Leather";

        Jacket jacket = new Jacket(brand, size, color,price, material);

        System.out.println("Brand: " + jacket.brand);
        System.out.println("Size: " + jacket.size);
        System.out.println("Color: " + jacket.color);
        System.out.println("Price: " + jacket.price);
        System.out.println("Material: " + jacket.material);
    }
}