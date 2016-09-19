package mx.iteso.strategy.balls;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nestor on 18/09/2016.
 */
public class SoccerBallTest {

    @Test
    public void testSoccerballBall() {
        SoccerBall soccerBall = new SoccerBall();
        soccerBall.setBounceBehavior("I");
        assertEquals("I'm bouncing irregularly!", soccerBall.performBounce());
        assertEquals("I'm deflating!", soccerBall.performDeflate());
        assertEquals("I'm inflating!", soccerBall.performInflate());
        assertEquals("I move in the ground!", soccerBall.performMove());
        assertEquals("Soccer ball is rolling!", soccerBall.roll());
    }
}
