class MehendiRunner{
    public static void main(String[] args){

        Mehendi m1 = new Mehendi();
        System.out.println("Mehendi 1");
        System.out.println("Design:"+m1.designType);
        System.out.println("Price:"+m1.price);
        System.out.println("Color:"+m1.color);
        System.out.println("ChemicalFree:"+m1.chemicalFree);
        System.out.println("Duration:"+m1.duration);
        System.out.println("==========================");

        Mehendi m2 = new Mehendi("Arabic");
        Mehendi m3 = new Mehendi("Bridal", 1500);
        Mehendi m4 = new Mehendi("Traditional", 2000, "DarkBrown");
        Mehendi m5 = new Mehendi("Modern", 2500, "Black", true);
        Mehendi m6 = new Mehendi("Royal", 3000, "Maroon", true, 5);

        System.out.println("Mehendi 2 to 6 created successfully");
    }
}