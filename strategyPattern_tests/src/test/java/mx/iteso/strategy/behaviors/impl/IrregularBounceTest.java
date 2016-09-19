package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nestor on 18/09/2016.
 */
public class IrregularBounceTest {

    @Test
    public void testIrregularBounce() {
        IrregularBounce irregularBounce = new IrregularBounce();
        assertEquals("I'm bouncing irregularly!",irregularBounce.bounce());

    }
}
