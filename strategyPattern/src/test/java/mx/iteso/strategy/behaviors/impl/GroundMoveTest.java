package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nestor on 18/09/2016.
 */
public class GroundMoveTest {

    @Test
    public void testGroundMove() {
        GroundMove groundMove = new GroundMove();
        assertEquals("I move in the ground!",groundMove.move());

    }
}
