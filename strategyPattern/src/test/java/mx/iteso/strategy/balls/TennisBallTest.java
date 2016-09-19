package mx.iteso.strategy.balls;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nestor on 18/09/2016.
 */
public class TennisBallTest {

    @Test
    public void testAmericanFootballBall() {
        TennisBall tennisBall = new TennisBall();
        tennisBall.setBounceBehavior("I");
        assertEquals("I'm bouncing irregularly!", tennisBall.performBounce());
        assertEquals("I'm deflating!", tennisBall.performDeflate());
        assertEquals("I'm inflating!", tennisBall.performInflate());
        assertEquals("I move in the air!", tennisBall.performMove());
        assertEquals("Tennis ball is rolling!", tennisBall.roll());
    }
}
