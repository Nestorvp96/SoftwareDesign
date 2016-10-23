package mx.iteso;

import mx.iteso.singleton.SincronizedChocolateBoiler;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by lamos on 10/22/2016.
 */
public class ChocolateFactorySyncTest {
    SincronizedChocolateBoiler lazy;
    SincronizedChocolateBoiler lazy1;

    @Before
    public void setUp(){
        lazy = SincronizedChocolateBoiler.getInstance();
        lazy1 = SincronizedChocolateBoiler.getInstance();
    }

    @Test
    public  void DrainTest(){
        lazy.drain();
        assertEquals(lazy1.isEmpty(), lazy.isEmpty());
        assertEquals(lazy1.isBoiled(), lazy.isBoiled());
    }

    @Test
    public  void BoilTest(){
        lazy1.boil();
        assertEquals(lazy.isBoiled(), lazy1.isBoiled());
        assertEquals(lazy.isEmpty(), lazy1.isEmpty());
    }

    @Test
    public void FillTest(){
        lazy.fill();

        assertEquals(lazy.isBoiled(), lazy1.isBoiled());
        assertEquals(lazy.isEmpty(), lazy1.isEmpty());

    }

}

