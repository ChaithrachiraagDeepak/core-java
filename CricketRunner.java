class CricketRunner{

    public static void main(String[] args){

   
        String teamName1 = "India";
        String captainName1 = "Rohit Sharma";
        String coachName1 = "Rahul Dravid";
        String homeGround1 = "Wankhede Stadium";
        String format1 = "ODI";
        String country1 = "India";
        int totalPlayers1 = 15;
        int totalMatches1 = 250;
        int matchesWon1 = 180;
        int matchesLost1 = 50;
        int matchesDrawn1 = 20;
        int totalRuns1 = 12000;
        int totalWickets1 = 850;
        int oversPlayed1 = 4000;
        double runRate1 = 5.8;
        double teamRanking1 = 1.0;
        boolean isInternationalTeam1 = true;
        boolean hasWonWorldCup1 = true;
        String sponsorName1 = "BYJUS";
        String jerseyColor1 = "Blue";

        
        Cricket team1 = new Cricket(
                teamName1, captainName1, coachName1,
                homeGround1, format1, country1,
                totalPlayers1, totalMatches1, matchesWon1,
                matchesLost1, matchesDrawn1, totalRuns1,
                totalWickets1, oversPlayed1, runRate1,
                teamRanking1, isInternationalTeam1,
                hasWonWorldCup1, sponsorName1, jerseyColor1);

        System.out.println("Team Name: " + team1.teamName);
        System.out.println("Captain Name: " + team1.captainName);
        System.out.println("Coach Name: " + team1.coachName);
        System.out.println("Home Ground: " + team1.homeGround);
        System.out.println("Format: " + team1.format);
        System.out.println("Country: " + team1.country);
        System.out.println("Total Players: " + team1.totalPlayers);
        System.out.println("Total Matches: " + team1.totalMatches);
        System.out.println("Matches Won: " + team1.matchesWon);
        System.out.println("Matches Lost: " + team1.matchesLost);
        System.out.println("Matches Drawn: " + team1.matchesDrawn);
        System.out.println("Total Runs: " + team1.totalRuns);
        System.out.println("Total Wickets: " + team1.totalWickets);
        System.out.println("Overs Played: " + team1.oversPlayed);
        System.out.println("Run Rate: " + team1.runRate);
        System.out.println("Team Ranking: " + team1.teamRanking);
        System.out.println("Is International Team: " + team1.isInternationalTeam);
        System.out.println("Has Won World Cup: " + team1.hasWonWorldCup);
        System.out.println("Sponsor Name: " + team1.sponsorName);
        System.out.println("Jersey Color: " + team1.jerseyColor);
		
    }
}