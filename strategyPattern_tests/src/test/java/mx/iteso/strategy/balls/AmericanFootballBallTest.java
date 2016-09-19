package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmericanFootballBallTest {
    @Test
    public void testAmericanFootballBall() {
        AmericanFootballBall americanFootballBall = new AmericanFootballBall();
        americanFootballBall.setBounceBehavior("I");
        assertEquals("I'm bouncing irregularly!", americanFootballBall.performBounce());
        assertEquals("I'm deflating!", americanFootballBall.performDeflate());
        assertEquals("I'm inflating!", americanFootballBall.performInflate());
        assertEquals("I move in the air!", americanFootballBall.performMove());
        assertEquals("American Football ball is rolling!", americanFootballBall.roll());
    }
}
