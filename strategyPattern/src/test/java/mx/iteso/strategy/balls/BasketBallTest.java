package mx.iteso.strategy.balls;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Nestor on 18/09/2016.
 */
public class BasketBallTest {

    @Test
    public void testBasketBallTest() {
        BasketballBall basketballBall = new BasketballBall();
        assertEquals("I'm bouncing normally!", basketballBall.performBounce());
        assertEquals("I'm deflating!", basketballBall.performDeflate());
        assertEquals("I'm inflating!", basketballBall.performInflate());
        assertEquals("I move in the air!!", basketballBall.performMove());
        assertEquals("Basketball ball is rolling!", basketballBall.roll());
    }
}
