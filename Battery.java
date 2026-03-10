class Battery{
    String brand;
    double capacity;
    String type;
    boolean rechargeable;
    int warranty;

    Battery(){}
    Battery(String brand){ this.brand=brand; }
    Battery(String brand,double capacity){ this.brand=brand; this.capacity=capacity; }
    Battery(String brand,double capacity,String type){ this.brand=brand; this.capacity=capacity; this.type=type; }
    Battery(String brand,double capacity,String type,boolean rechargeable){
        this.brand=brand; this.capacity=capacity; this.type=type; this.rechargeable=rechargeable;
    }
    Battery(String brand,double capacity,String type,boolean rechargeable,int warranty){
        this.brand=brand; this.capacity=capacity; this.type=type; this.rechargeable=rechargeable; this.warranty=warranty;
    }
}