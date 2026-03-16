class Carrom{

    String brand;
    double size;
    String color;
    boolean strikerIncluded;
    int coins;

    Carrom(){
    }

    Carrom(String brand){
        this.brand = brand;
    }

    Carrom(String brand, double size){
        this.brand = brand;
        this.size = size;
    }

    Carrom(String brand, double size, String color){
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    Carrom(String brand, double size, String color, boolean strikerIncluded){
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.strikerIncluded = strikerIncluded;
    }

    Carrom(String brand, double size, String color, boolean strikerIncluded, int coins){
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.strikerIncluded = strikerIncluded;
        this.coins = coins;
    }
}