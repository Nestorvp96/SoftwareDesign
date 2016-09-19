package mx.iteso.strategy.balls;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nestor on 18/09/2016.
 */
public class RugbyBallTest {

    @Test
    public void testRugbyBall() {
        RugbyBall rugbyBall = new RugbyBall();
        rugbyBall.setBounceBehavior("N");
        assertEquals("I'm bouncing normally!", rugbyBall.performBounce());
        assertEquals("I'm deflating!", rugbyBall.performDeflate());
        assertEquals("I'm inflating!", rugbyBall.performInflate());
        assertEquals("I move in the air!", rugbyBall.performMove());
        assertEquals("Rugby ball is rolling!", rugbyBall.roll());
    }
}
