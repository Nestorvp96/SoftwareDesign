package mx.iteso.observer.impl;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class StoreMonitorDisplayTest {
    private StoreMonitorDisplay storeMonitorDisplay;
    private ScoresData scoresData;
    private ScorersData scorersData;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        scorersData = mock(ScorersData.class);
        storeMonitorDisplay = new StoreMonitorDisplay(scoresData,scorersData);
    }

    @Test
    public void testUpdateMatch() {
        storeMonitorDisplay.updateMatch("homeTeam", "awayTeam", 1, 0);
        //Nothing to assert or verify for now
    }
    @Test
    public void testUpdatescore() {
        storeMonitorDisplay.updateScore("Alex", 10, "Delantero", "Iteso");
        //Nothing to assert or verify for now
    }
}
