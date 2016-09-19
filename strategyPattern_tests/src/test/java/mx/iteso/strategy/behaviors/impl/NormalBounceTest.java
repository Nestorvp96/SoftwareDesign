package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nestor on 18/09/2016.
 */
public class NormalBounceTest {

    @Test
    public void testNormalBounce() {
        NormalBounce normalBounce = new NormalBounce();
        assertEquals("I'm bouncing normally!",normalBounce.bounce());

    }
}
