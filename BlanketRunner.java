class BlanketRunner {

    public static void main(String[] args) {

        
        String brand = "SleepWell";
        String material = "Wool";
        String color = "Brown";
        double price = 1999.50;
        String size = "King";
        boolean isElectric = false;

        Blanket blanket = new Blanket(brand, material, color,price, size, isElectric);
		
        System.out.println("Brand: " + blanket.brand);
        System.out.println("Material: " + blanket.material);
        System.out.println("Color: " + blanket.color);
        System.out.println("Price: " + blanket.price);
        System.out.println("Size: " + blanket.size);
        System.out.println("Is Electric: " + blanket.isElectric);
    }
}