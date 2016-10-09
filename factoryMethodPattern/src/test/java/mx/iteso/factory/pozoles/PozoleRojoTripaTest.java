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
public class PozoleRojoTripaTest {

    private Pozole pozole;

    @Before
    public void setUp(){

        pozole = mock((Pozole.class));

    }

    @Test
    public void testName() throws Exception {
        Pozole rojoTripa = new PozoleRojoTripa();
        when(pozole.getName()).thenReturn("Pozole Rojo con Tripa");
        String name = rojoTripa.getName();
        assertEquals(pozole.getName(), name);
    }
}
