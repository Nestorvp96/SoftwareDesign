package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nestor on 18/09/2016.
 */
public class NotDeflatableTest {

    @Test
    public void testNotDeflatabledeflate() {
        NotDeflatable notDeflatable = new NotDeflatable();
        assertEquals("I can't deflate!",notDeflatable.deflate());

    }

    @Test
    public void testNotDeflatableinflate() {
        NotDeflatable notDeflatable = new NotDeflatable();
        assertEquals("I can't inflate!",notDeflatable.inflate());

    }
}
