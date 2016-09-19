package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nestor on 18/09/2016.
 */
public class SwimRingTest {

    @Test
    public void testSwimRing() {
        SwimRing swimRing = new SwimRing();
        assertEquals("I'm deflating!", swimRing.performDeflate());
        assertEquals("I'm inflating!", swimRing.performInflate());
        assertEquals("I'm floating", swimRing.floating());
        assertEquals("I'm a Swim ring", swimRing.display());
    }
}
