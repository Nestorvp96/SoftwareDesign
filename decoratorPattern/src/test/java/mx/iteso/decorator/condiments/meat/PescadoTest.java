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
public class PescadoTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost() throws Exception {
        Taco pescado = new Pescado(taco);
        when(taco.cost()).thenReturn(8.0);
        pescado.size = Taco.Size.regular;
        double cost = pescado.cost();
        assertEquals(14.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco pescado = new Pescado(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = pescado.getDescription();
        assertEquals("Taco Normal con pescado", desc);
    }
}
