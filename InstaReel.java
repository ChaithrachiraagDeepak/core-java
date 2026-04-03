class InstaReel extends Reel
{
		InstaReel()
		{
			super("instagram", "kannada songs", 500);
			System.out.println("no constructore arg.......");
		}
		
		InstaReel(String platfrom, String song, int likes)
		{
			super(platfrom, song, likes);
			System.out.println("String int constructor in instareels");
		}
	
		InstaReel(int likes)
		{
			super("social media", "appu songs",600);
			System.out.println("int constructor in instareels ");
		}

	
}