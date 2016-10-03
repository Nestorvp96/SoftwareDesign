package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.Cebolla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Nestor on 02/10/2016.
 */
public class CamaronTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost() throws Exception {
        Taco camaron = new Camaron(taco);
        when(taco.cost()).thenReturn(8.0);
        camaron.size = Taco.Size.regular;
        double cost = camaron.cost();
        assertEquals(14.00, cost,0);
    }
    @Test
    public void testDescription(){
        Taco camaron = new Camaron(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = camaron.getDescription();
        assertEquals("Taco Normal con camaron", desc);
    }
}
