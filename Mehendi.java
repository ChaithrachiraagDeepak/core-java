class Mehendi{
    String designType;
    double price;
    String color;
    boolean chemicalFree;
    int duration;

    Mehendi(){
    }

    Mehendi(String designType){
        this.designType = designType;
    }

    Mehendi(String designType, double price){
        this.designType = designType;
        this.price = price;
    }

    Mehendi(String designType, double price, String color){
        this.designType = designType;
        this.price = price;
        this.color = color;
    }

    Mehendi(String designType, double price, String color, boolean chemicalFree){
        this.designType = designType;
        this.price = price;
        this.color = color;
        this.chemicalFree = chemicalFree;
    }

    Mehendi(String designType, double price, String color, boolean chemicalFree, int duration){
        this.designType = designType;
        this.price = price;
        this.color = color;
        this.chemicalFree = chemicalFree;
        this.duration = duration;
    }
}