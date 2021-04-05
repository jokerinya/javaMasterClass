package com.jokerinya;
import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team> {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }


    public void addTeam(T team){
        if (teams.contains(team)){
            System.out.println(team.getName()+ " is already on the table.");
        } else {
            teams.add(team);
            System.out.println(team.getName() + " has been added.");
        }
    }

    public int getSize(){
        return this.teams.size();
    }

    public void printTable(){
        Collections.sort(this.teams);
        System.out.println("======= "+ this.name + " ========");
        for (int i = 0; i < teams.size(); i++) {
            Team team = teams.get(i);
            System.out.println((i+1) + ". " + team.getName() + " - " + team.getPoints());
        }
    }


}
