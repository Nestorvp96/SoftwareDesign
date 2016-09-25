package mx.iteso.observer.impl;

import mx.iteso.observer.Observer;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by CesarAlejandro on 9/22/2016.
 */
public class StoreAppDisplayTest {

    private StoreAppDisplay storeAppDisplay;
    private ScoresData scoresData;
    private ScorersData scorersData;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        scorersData = mock(ScorersData.class);
        storeAppDisplay = new StoreAppDisplay(scoresData,scorersData);
    }

    @Test
    public void testUpdateMatch() {
        storeAppDisplay.updateMatch("homeTeam", "awayTeam", 1, 0);
        //Nothing to assert or verify for now
    }
    @Test
    public void testUpdateScore() {
        storeAppDisplay.updateScore("Alex", 10, "Delantero", "Iteso");
        //Nothing to assert or verify for now
    }
    @Test
    public void testRemove(){
        scoresData.registerObserver(storeAppDisplay);
        scorersData.registerObserver(storeAppDisplay);

        storeAppDisplay.remove(scoresData,scorersData);
        verify(scorersData, times(1)).removeObserver(storeAppDisplay);
        verify(scoresData, times(1)).removeObserver(storeAppDisplay);

    }
}
