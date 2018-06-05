package pl.piasecki;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Patrick on 05 cze 2018
 */
public class LeagueTable<T extends Team> {
    private String name;

    private List<T> table = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public boolean addTeam(T team){
        if (table.contains(team)){
            System.out.println(team.getName() + " is already in this league.");
            return false;
        } else {
            table.add(team);
            System.out.println(team.getName() + " added to the " + this.name + " league table.");
            return true;
        }
    }

    public void printLeagueTable(){
        Collections.sort(table);
        System.out.println(name.toUpperCase());
        for (int i = 0; i<table.size(); i++){
            System.out.println((i+1) + ". " + table.get(i).getName()
                    + ", points: " + table.get(i).points()
                    + ", played: " + table.get(i).getPlayed()
                    + ", wins: " + table.get(i).getWon()
                    + ", draws: " + table.get(i).getTied()
                    + ", lost: " + table.get(i).getLost());
        }
    }

    public String getName() {
        return name;
    }
}
