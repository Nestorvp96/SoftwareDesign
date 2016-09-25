package mx.iteso.observer.impl;

import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.Subject;

public class StoreMonitorDisplay implements Observer, Displayable {
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private String Name;
    private int Number;
    private String Position;
    private String Team;
    private Subject scoresData;
    private Subject scorersData;

    public StoreMonitorDisplay(Subject scoresData, Subject scorersData){
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
        this.scorersData = scorersData;
        this.scorersData.registerObserver(this);
    }

    public void displayMatch()
    {
        System.out.println("MONITOR: Latest score is:");
        System.out.println(homeTeam + " (HOME) " + homeGoals + " - "
                + awayTeam + " (AWAY) " + awayGoals);
    }

    public void displayScore()
    {
        System.out.println("MONITOR: Goal scored by:");
        System.out.println(Name + " - Number: " + Number + " - Position: "
                + Position + " - Team: " + Team);
    }

    public void updateMatch(String home, String away, int homeGoals, int awayGoals)
    {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        displayMatch();

    }

    public void updateScore(String name, int number, String position, String team)
    {
        this.Name = name;
        this.Number = number;
        this.Position = position;
        this.Team = team;
        displayScore();

    }
}
