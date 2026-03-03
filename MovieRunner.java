class MovieRunner{
    public static void main(String[] args){

        Movie movie1 = new Movie();
        System.out.println("Movie 1");
        System.out.println("Title:"+movie1.title);
        System.out.println("Budget:"+movie1.budget);
        System.out.println("Hero:"+movie1.hero);
        System.out.println("Hit:"+movie1.hit);
        System.out.println("Duration:"+movie1.duration);
        System.out.println("==========================");

        Movie movie2 = new Movie("KGF");
        System.out.println("Movie 2");
        System.out.println("Title:"+movie2.title);
        System.out.println("Budget:"+movie2.budget);
        System.out.println("Hero:"+movie2.hero);
        System.out.println("Hit:"+movie2.hit);
        System.out.println("Duration:"+movie2.duration);
        System.out.println("==========================");

        Movie movie3 = new Movie("Leo", 250);
        System.out.println("Movie 3");
        System.out.println("Title:"+movie3.title);
        System.out.println("Budget:"+movie3.budget);
        System.out.println("Hero:"+movie3.hero);
        System.out.println("Hit:"+movie3.hit);
        System.out.println("Duration:"+movie3.duration);
        System.out.println("==========================");

        Movie movie4 = new Movie("RRR", 300, "RamCharan");
        System.out.println("Movie 4");
        System.out.println("Title:"+movie4.title);
        System.out.println("Budget:"+movie4.budget);
        System.out.println("Hero:"+movie4.hero);
        System.out.println("Hit:"+movie4.hit);
        System.out.println("Duration:"+movie4.duration);
        System.out.println("==========================");

        Movie movie5 = new Movie("Pushpa", 200, "AlluArjun", true);
        System.out.println("Movie 5");
        System.out.println("Title:"+movie5.title);
        System.out.println("Budget:"+movie5.budget);
        System.out.println("Hero:"+movie5.hero);
        System.out.println("Hit:"+movie5.hit);
        System.out.println("Duration:"+movie5.duration);
        System.out.println("==========================");

        Movie movie6 = new Movie("Salaar", 400, "Prabhas", true, 180);
        System.out.println("Movie 6");
        System.out.println("Title:"+movie6.title);
        System.out.println("Budget:"+movie6.budget);
        System.out.println("Hero:"+movie6.hero);
        System.out.println("Hit:"+movie6.hit);
        System.out.println("Duration:"+movie6.duration);
        System.out.println("==========================");
    }
}