class Movie{
    String title;
    double budget;
    String hero;
    boolean hit;
    int duration;

    Movie(){
    }

    Movie(String title){
        this.title = title;
    }

    Movie(String title, double budget){
        this.title = title;
        this.budget = budget;
    }

    Movie(String title, double budget, String hero){
        this.title = title;
        this.budget = budget;
        this.hero = hero;
    }

    Movie(String title, double budget, String hero, boolean hit){
        this.title = title;
        this.budget = budget;
        this.hero = hero;
        this.hit = hit;
    }

    Movie(String title, double budget, String hero, boolean hit, int duration){
        this.title = title;
        this.budget = budget;
        this.hero = hero;
        this.hit = hit;
        this.duration = duration;
    }
}