package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.balls.AmericanFootballBall;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by CesarAlejandro on 9/15/2016.
 */
public class ArmBandsTest {
    @Test
    public void testArmBand() {
        ArmBands armBands = new ArmBands();
        assertEquals("I'm deflating!", armBands.performDeflate());
        assertEquals("I'm inflating!", armBands.performInflate());
        assertEquals("I'm floating", armBands.floating());
        assertEquals("I'm a Arm bands", armBands.display());
    }
}
