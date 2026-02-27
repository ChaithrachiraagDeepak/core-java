class Cricket{

    String teamName;
    String captainName;
    String coachName;
    String homeGround;
    String format;
    String country;

    int totalPlayers;
    int totalMatches;
    int matchesWon;
    int matchesLost;
    int matchesDrawn;
    int totalRuns;
    int totalWickets;
    int oversPlayed;

    double runRate;
    double teamRanking;

    boolean isInternationalTeam;
    boolean hasWonWorldCup;

    String sponsorName;
    String jerseyColor;


    Cricket(String teamName, String captainName, String coachName,
            String homeGround, String format, String country,
            int totalPlayers, int totalMatches, int matchesWon,
            int matchesLost, int matchesDrawn, int totalRuns,
            int totalWickets, int oversPlayed, double runRate,
            double teamRanking, boolean isInternationalTeam,
            boolean hasWonWorldCup, String sponsorName,
            String jerseyColor) {

        this.teamName = teamName;
        this.captainName = captainName;
        this.coachName = coachName;
        this.homeGround = homeGround;
        this.format = format;
        this.country = country;
        this.totalPlayers = totalPlayers;
        this.totalMatches = totalMatches;
        this.matchesWon = matchesWon;
        this.matchesLost = matchesLost;
        this.matchesDrawn = matchesDrawn;
        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
        this.oversPlayed = oversPlayed;
        this.runRate = runRate;
        this.teamRanking = teamRanking;
        this.isInternationalTeam = isInternationalTeam;
        this.hasWonWorldCup = hasWonWorldCup;
        this.sponsorName = sponsorName;
        this.jerseyColor = jerseyColor;
    }
}