package mx.iteso.strategy.balls;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nestor on 18/09/2016.
 */
public class HandBallTest {
    @Test
    public void testHandBallBall() {
        HandballBall handballBall = new HandballBall();
        handballBall.setBounceBehavior("I");
        assertEquals("I'm bouncing irregularly!", handballBall.performBounce());
        assertEquals("I'm deflating!", handballBall.performDeflate());
        assertEquals("I'm inflating!", handballBall.performInflate());
        assertEquals("I move in the air!", handballBall.performMove());
        assertEquals("Handball ball is rolling!", handballBall.roll());
    }
}
