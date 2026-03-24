class RacketRunner{

    public static void main(String[] args) {

        
        String brand = "Yonex";
        String sportType = "Badminton";
        double weight = 85.5;
        String gripType = "Rubber";
        String color = "Blue";
        double price = 4500.75;
        String material = "Carbon Fiber";
        int length = 67;
        boolean isProfessional = true;
        int warrantyYears = 2;

       
        Racket racket = new Racket(brand, sportType, weight,gripType, color, price,material, length,
		                           isProfessional, warrantyYears);

        System.out.println("Brand: " + racket.brand);
        System.out.println("Sport Type: " + racket.sportType);
        System.out.println("Weight: " + racket.weight);
        System.out.println("Grip Type: " + racket.gripType);
        System.out.println("Color: " + racket.color);
        System.out.println("Price: " + racket.price);
        System.out.println("Material: " + racket.material);
        System.out.println("Length: " + racket.length);
        System.out.println("Is Professional: " + racket.isProfessional);
        System.out.println("Warranty Years: " + racket.warrantyYears);
    }
}