class FastFoodRunner{
    public static void main(String[] args){

        FastFood f1 = new FastFood();
        FastFood f2 = new FastFood("Burger");
        FastFood f3 = new FastFood("Pizza", 299);
        FastFood f4 = new FastFood("Fries", 150, "Salty");
        FastFood f5 = new FastFood("Noodles", 180, "Spicy", true);
        FastFood f6 = new FastFood("Sandwich", 120, "Cheesy", false, 350);

        System.out.println("FastFood objects created successfully");
    }
}