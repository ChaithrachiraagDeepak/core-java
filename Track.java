class Track{
    String name;
    double length;
    String location;
    boolean active;
    int lanes;

    Track(){
    }

    Track(String name){
        this.name = name;
    }

    Track(String name, double length){
        this.name = name;
        this.length = length;
    }

    Track(String name, double length, String location){
        this.name = name;
        this.length = length;
        this.location = location;
    }

    Track(String name, double length, String location, boolean active){
        this.name = name;
        this.length = length;
        this.location = location;
        this.active = active;
    }

    Track(String name, double length, String location, boolean active, int lanes){
        this.name = name;
        this.length = length;
        this.location = location;
        this.active = active;
        this.lanes = lanes;
    }
}