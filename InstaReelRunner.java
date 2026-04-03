class InstaReelRunner{
	
	public static void main(String...values)
	{
		InstaReel instareel1 = new InstaReel();
		System.out.println("platform:"+instareel1.platfrom);
		System.out.println("song:"+instareel1.song);
		System.out.println("likes:"+instareel1.likes);
		System.out.println("============================");
		
		InstaReel instareel2 = new InstaReel("tiktok", "ninne-ninne", 480);
		System.out.println("platform:" +instareel2.platfrom);
		System.out.println("song:" +instareel2.song);
		System.out.println("likes:" +instareel2.likes);
		System.out.println("============================");
		
		InstaReel instareel3 = new InstaReel(900);
		System.out.println("platform:" +instareel3.platfrom);
		System.out.println("song:" + instareel3.song);
		System.out.println("likes:" +instareel3.likes);
		System.out.println("============================");
		
		
		
		
		
		
		
		
	}
	
	
	
}