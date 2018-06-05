package pl.piasecki;

/**
 * Created by Patrick on 04 cze 2018
 */
public abstract class Team implements Comparable<Team> {
    private String name;

    private int played;
    private int won;
    private int tied;
    private int lost;

    public Team(String name) {
        this.name = name;
    }

    public void matchResult(Team opponent, int ourScore, int theirScore){
        played++;
        String message;
        if (ourScore > theirScore){
            won++;
            message = "won";
        } else if (ourScore < theirScore){
            lost++;
            message = "lost";
        } else {
            tied++;
            message = "tied";
        }
        if (opponent != null){
            opponent.matchResult(null, theirScore, ourScore);
            System.out.println(this.name + message + " with " + opponent.getName());
        }
    }

    public int points(){
        return (2*won) + tied;
    }

    public String getName() {
        return name;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getTied() {
        return tied;
    }

    public int getLost() {
        return lost;
    }

    @Override
    public int compareTo(Team team) {
        if (this.points() > team.points()){
            return -1;
        } else if(this.points() < team.points()){
            return 1;
        } else {
            return 0;
        }
    }
}
