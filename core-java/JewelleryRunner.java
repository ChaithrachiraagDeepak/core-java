class JewelleryRunner{
    public static void main(String[] args){

        Jewellery j1 = new Jewellery();
        Jewellery j2 = new Jewellery("Necklace");
        Jewellery j3 = new Jewellery("Ring", 10);
        Jewellery j4 = new Jewellery("Bangle", 20, "Gold");
        Jewellery j5 = new Jewellery("Chain", 15, "Silver", true);
        Jewellery j6 = new Jewellery("Bracelet", 25, "Gold", true, 50000);

        System.out.println("Jewellery objects created successfully");
    }
}