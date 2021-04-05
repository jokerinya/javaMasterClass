package com.jokerinya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootballTeam liverpool = new FootballTeam("Liverpool", 15);
        FootballTeam mun = new FootballTeam("Manchester United", 2);
        FootballTeam chelsea = new FootballTeam("Chelsea", 9);

        BasketballTeam losAnglesLakers = new BasketballTeam("Los Angles Lakers", 88);
        BasketballTeam chicagoBulls = new BasketballTeam("Chicago Bulls", 98);

        LeagueTable<FootballTeam> footballTable = new LeagueTable<>("Football Table");

        footballTable.addTeam(liverpool);
        // footballTable.addTeam(chicagoBulls); // doesn't add
        footballTable.addTeam(mun);
        footballTable.addTeam(chelsea);
        System.out.println(footballTable.getSize());
        footballTable.printTable();

        LeagueTable<BasketballTeam> basketballTable = new LeagueTable<>("Basketball Table");
        basketballTable.addTeam(losAnglesLakers);
        basketballTable.addTeam(chicagoBulls);
        basketballTable.printTable();

    }
}
