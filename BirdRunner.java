class BirdRunner {

    public static void main(String[] args) {
        String[] birds = {"Peacock","Parrot","Crow","Sparrow","Pigeon","Flamingo","Swan","Eagle","Myna","Koel",
		"Indian Peafowl","Bulbul","Robin","Owl","Dove","Indian Roller","Black Kite","Baya Weaver","Bee Eater","Sunbird" };

        for (int index = 0; index < birds.length; index++)
			{
            String color = Bird.getColorByName(birds[index]);
			
            System.out.println("Colour of " + birds[index] + "is:" + colour);
			
            System.out.println("-!----!-----!-------!------!----!---!-");
           }
    }
}