package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nestor on 18/09/2016.
 */
public class AirMoveTest {

    @Test
    public void testAirMove() {
        AirMove airMove = new AirMove();
        assertEquals("I move in the air!",airMove.move());

    }
}
