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
public class ChorizoTest {

    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost() throws Exception {
        Taco chorizo = new Chorizo(taco);
        when(taco.cost()).thenReturn(8.0);
        chorizo.size = Taco.Size.regular;
        double cost = chorizo.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco chorizo = new Chorizo(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = chorizo.getDescription();
        assertEquals("Taco Normal con chorizo", desc);
    }
}
