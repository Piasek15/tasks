package pl.piasecki;

public class Main {

    public static void main(String[] args) {
	    LeagueTable<SpeedwayTeam> ekstraliga = new LeagueTable<>("PGE Ekstraliga");
	    SpeedwayTeam team1= new SpeedwayTeam("Stal Rzeszów");
	    SpeedwayTeam team2 = new SpeedwayTeam("Unia Tarnów");
	    SpeedwayTeam team3 = new SpeedwayTeam("KSM Krosno");
	    SpeedwayTeam team4 = new SpeedwayTeam("Wanda Kraków");

	    FootballTeam team5 = new FootballTeam("Chelsea");
	    FootballTeam team6 = new FootballTeam("Real Madrid");
	    FootballTeam team7 = new FootballTeam("Bayern");

	    ekstraliga.addTeam(team1);
	    ekstraliga.addTeam(team2);
	    ekstraliga.addTeam(team3);
	    ekstraliga.addTeam(team4);

	    ekstraliga.printLeagueTable();

	    team1.matchResult(team2, 50, 40);
	    team1.matchResult(team3, 50, 40);
	    team1.matchResult(team4, 45, 45);
	    team2.matchResult(team3, 30, 60);

	    ekstraliga.printLeagueTable();

	    //ekstraliga.addTeam(team5);
    }
}
