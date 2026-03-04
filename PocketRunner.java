class PocketRunner{

    public static void main(String[] args){
        String type = "Front Pocket";
        String material = "Cotton";
        int capacity = 2;

        Pocket pocket = new Pocket(type, material, capacity);

        System.out.println("Type: " + pocket.type);
        System.out.println("Material: " + pocket.material);
        System.out.println("Capacity: " + pocket.capacity);
    }
}