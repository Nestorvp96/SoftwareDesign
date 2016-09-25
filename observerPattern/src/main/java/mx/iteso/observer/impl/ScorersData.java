package mx.iteso.observer.impl;

import mx.iteso.observer.Subject;
import mx.iteso.observer.Observer;
import java.util.ArrayList;

/**
 * Created by CesarAlejandro on 9/21/2016.
 */
public class ScorersData implements Subject {
    private ArrayList<Observer> observers;
    private String Name;
    private int Number;
    private String Position;
    private String Team;

    public ScorersData()
    {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }

    public void removeObserver(Observer observer)
    {
        observers.remove(observers.indexOf(observer));
    }

    public void notifyObservers()
    {
        for (Observer observer : observers) {
            observer.updateScore(this.Name, this.Number, this.Position, this.Team );
        }
    }

    public void newScore(){
        notifyObservers();
    }

    public void setScore( String name, int number, String position, String team)
    {
        this.Name = name;
        this.Number = number;
        this.Position = position;
        this.Team = team;
        newScore();
    }
}
