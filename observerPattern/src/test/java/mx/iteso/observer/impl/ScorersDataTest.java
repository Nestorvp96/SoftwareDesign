package mx.iteso.observer.impl;

import mx.iteso.observer.Observer;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
/**
 * Created by CesarAlejandro on 9/22/2016.
 */
public class ScorersDataTest {

    ScorersData scorersData;
    Observer observer;

    @Before
    public void setUp() {
        scorersData = new ScorersData();
        observer = mock(Observer.class);
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testRegisterAndRemoveObserver() {
        scorersData.registerObserver(observer);
        scorersData.removeObserver(observer);
        scorersData.removeObserver(observer);
    }

    @Test
    public void testSetScore() {
        scorersData.registerObserver(observer);
        scorersData.registerObserver(observer);
        scorersData.setScore("El Nesti", 10000, "Aguador", "Los cara de papa");
        verify(observer, times(2)).updateScore("El Nesti", 10000, "Aguador", "Los cara de papa");
    }

}
