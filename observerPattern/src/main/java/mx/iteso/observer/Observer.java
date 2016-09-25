package mx.iteso.observer;

public interface Observer {
    public void updateMatch(String home, String away, int homeGoals, int awayGoals);
    public void updateScore(String name, int number, String position, String team);
}
