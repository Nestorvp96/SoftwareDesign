package mx.iteso.observer;

import mx.iteso.observer.impl.ScorersData;
import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreAppDisplay;
import mx.iteso.observer.impl.StoreMonitorDisplay;

public class NewsStation {
    public static void main( String[] args ){
        ScoresData scoresData;
        scoresData = new ScoresData();
        ScorersData scorersData;
        scorersData = new ScorersData();

        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData,scorersData);
        StoreMonitorDisplay storeMonitorDisplay2 = new StoreMonitorDisplay(scoresData,scorersData);

        StoreAppDisplay storeAppDisplay = new StoreAppDisplay(scoresData,scorersData);
        StoreAppDisplay storeAppDisplay1 = new StoreAppDisplay(scoresData,scorersData);

        scoresData.setScore("Tacit Knowledge", "Intel", 8, 1);
        storeAppDisplay.remove(scoresData,scorersData);
        scoresData.setScore("Chivas", "Queretaro", 2, 1);
        scoresData.setScore("La Ganga", "Muebles America", 0, 0);

        scorersData.setScore("Alex", 14, "Delantero", "Intel");
        //storeMonitorDisplay.displayScore();
    }
}
