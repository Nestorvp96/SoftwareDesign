package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Nestor on 08/10/2016.
 */
public class PozoleBlancoPolloTest {
    private Pozole pozole;

    @Before
    public void setUp(){

        pozole = mock((Pozole.class));

    }

    @Test
    public void testName() throws Exception {
        Pozole blancoPollo = new PozoleBlancoPollo();
        when(pozole.getName()).thenReturn("Pozole Blanco con Pollo");
        String name = blancoPollo.getName();
        assertEquals(pozole.getName(), name);
    }
}
