class Jewellery{
    String type;
    double weight;
    String material;
    boolean hallmarked;
    double price;

    Jewellery(){
    }

    Jewellery(String type){
        this.type = type;
    }

    Jewellery(String type, double weight){
        this.type = type;
        this.weight = weight;
    }

    Jewellery(String type, double weight, String material){
        this.type = type;
        this.weight = weight;
        this.material = material;
    }

    Jewellery(String type, double weight, String material, boolean hallmarked){
        this.type = type;
        this.weight = weight;
        this.material = material;
        this.hallmarked = hallmarked;
    }

    Jewellery(String type, double weight, String material, boolean hallmarked, double price){
        this.type = type;
        this.weight = weight;
        this.material = material;
        this.hallmarked = hallmarked;
        this.price = price;
    }
}