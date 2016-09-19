package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nestor on 18/09/2016.
 */
public class SwimSeatTest {

    @Test
    public void testSwimSeat() {
        SwimSeat swimSeat = new SwimSeat();
        assertEquals("I'm deflating!", swimSeat.performDeflate());
        assertEquals("I'm inflating!", swimSeat.performInflate());
        assertEquals("I'm floating", swimSeat.floating());
        assertEquals("I'm a Swim seat", swimSeat.display());
    }
}
