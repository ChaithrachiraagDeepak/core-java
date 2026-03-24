class Ipl{
	
	int totalRuns;
	int totalWickets;
	boolean available;
	String stadium;
	boolean qualifiedForPlayoffs;
	
	TeamName teamName;
	Player player ;
	Captain captain;
	HomeGround homeGround;
	Coach coach;
	
	
	Ipl(int totalRuns,int totalWickets,boolean available,String stadium,boolean qualifiedForPlayoffs,TeamName teamName,
	Player player,Captain captain,HomeGround homeGround,Coach coach)
	{
		this.totalRuns=totalRuns;
		this.totalWickets=totalWickets;
		this.available=available;
		this.stadium=stadium;
		this.qualifiedForPlayoffs=qualifiedForPlayoffs;
		this.teamName=teamName;
		this.player=player;
		this.captain=captain;
		this.homeGround=homeGround;
		this.coach=coach;
	}
	
	void getInfo()
	{
		System.out.println("totalRuns:"+totalRuns);
		System.out.println("totalWickets:"+totalWickets);
		System.out.println("available:"+available);
		System.out.println("stadium:"+stadium);
		System.out.println("qualifiedForPlayoffs:"+qualifiedForPlayoffs);
		System.out.println("teamName:"+teamName);
		System.out.println("player:"+player);
		System.out.println("captain:"+captain);
		System.out.println("homeGround:"+homeGround);
		System.out.println("coach:"+coach);
		
	}
	
}