class CricketWorldCup
   {
	static void  registerTeam(String teamName, String captainNAme, int ranking,
	boolean isHost, int squadSize)
	{
	
	System.out.println("TeamNAme:" + teamName); 
	
     if(teamName==null)	 
     {
		 System.out.println("name of the cricket team is invalid");
	 }

	 System.out.println("captainNAme:" + captainNAme);
	 
     if(captainNAme!=null)
	 {
		 System.out.println("given captain name is valid");
	 }	
	 
	 
	 System.out.println("rank of Cricket:" + ranking);
	 
	if(ranking<10)
	{
		System.out.println("rank is  less than 86");
	}
	
	 System.out.println("cricket host:" + isHost);
	 
	if(isHost==true)
	{
		System.out.println("yes host is valid");
	}
	
	System.out.println("size of the squad:" + squadSize);
	
	if(squadSize<12)
	{
		System.out.println("squadsize is less than 12");
	}
  }



static void saveMatch(String matchID, int team1,int team2,boolean venue, String city,
 int date, int time, int overs, boolean isDayNight,String umpire1, String umpire2)
 {
	System.out.println("matchID:"+matchID + "team members:"+team1 + "team members:"+team2 +
	"venueof match:"+venue + "cityName:"+city + "date of the match:"+date +  "match overs:"+overs +
	"when the match is happend day or night:"+isDayNight + "umpire1:"+umpire1 + "umpire2:"+umpire2);
    

    if(matchID==null)
	{
		System.out.println("given id is inavlid");
	}
     if(team1<10)
	 {
		 System.out.println("less than 10 mem");
	 }		 
	 if(team2<11)
	 {
		 System.out.println("members is less than 11");
		 
	 }
	 if(venue==true)
	 {
		 System.out.println("given veune match is valid");
	 }
	 if(city!=null)
	 {
		 System.out.println("city name is valid ");
	 }
	 if(date<13)
	 {
		 System.out.println("date is less than 13");
		 
	 }
	 if(time>12)
	 {
		 System.out.println("time is below 12opm");
	 }
	 if(overs>20)
	 {
		 System.out.println("over is less than 20");
		
	}
		if (isDayNight==true)
		{
			System.out.println("given info is valid");
		}
		if(umpire1!=null)
		{
			System.out.println("given umpire1 is valid ");
		}
		if(umpire2!=null)
		{
			System.out.println("given umpire2 is valid");
		}
 }
 
 static void savePlayer(String playerName, String teamName, int jerseyNum,
 boolean isCaptain, boolean isviceCaptain,boolean matchPlayed, int runScored,
 int wicketTaken,int battingAverage, String bowlingEconomy)
 {
	 if(playerName!=null)
	 {
		 System.out.println("playerName  is valid ");
	 }
	 if(teamName!=null)
	 {
		 System.out.println("teamName is valid ");
	 }
	 if(jerseyNum>100)
	 {
		 System.out.println("less  than  100");
	 }
	 if (isCaptain==true)
		{
			System.out.println("valid");
		}
		if (isviceCaptain==true)
		{
			System.out.println("given info is valid");
		}
	  if(matchPlayed==true)
	 {
		 System.out.println("yes");
	 }
	  if(runScored>443)
	 {
		 System.out.println("less  than  443");
	 }
	  if(wicketTaken>10)
	 {
		 System.out.println("less  than  10");
	 }
	  if(battingAverage>80)
	 {
		 System.out.println("less  than  80");
	 }
	 if(playerName!=null)
	 {
		 System.out.println("bowlingEconomy is good & valid ");
	 }
	 	 
 }
 
 static void runrate(String totalruns, int overfaced, int wicketloss)
 {
	 System.out.println("totalruns by match:"+totalruns + "overfaced during match:"+overfaced 
	 + "loss of wickets:"+wicketloss);
	 
	 if(totalruns==null)
	 {
		 System.out.println("given info of totaruns is invalid");
	 }
	  if(overfaced>6)
	 {
		 System.out.println("less  than  6");
	 }
	  if(wicketloss>4)
	 {
		 System.out.println("less  than  4");
	 }
	 
 }
 
 
 
 }


