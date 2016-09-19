package mx.iteso.strategy.balls;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nestor on 18/09/2016.
 */
public class BowlingBallTest {

    @Test
    public void testBowlingBallTest() {
        BowlingBall bowlingballBall = new BowlingBall();
        bowlingballBall.setBounceBehavior("I");
        assertEquals("I'm bouncing irregularly!", bowlingballBall.performBounce());
        assertEquals("I can't deflate!", bowlingballBall.performDeflate());
        assertEquals("I can't inflate!", bowlingballBall.performInflate());
        assertEquals("I move in the ground!", bowlingballBall.performMove());
        assertEquals("Bowling ball is rolling!", bowlingballBall.roll());
    }
}
