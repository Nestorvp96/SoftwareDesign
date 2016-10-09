package mx.iteso.factory.pozoles;

import mx.iteso.factory.AllPozoleStore;
import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

/**
 * Created by Nestor on 08/10/2016.
 */
public class PozolilloTest {

    private Pozole pozole;

    @Before
    public void setUp(){
        pozole = mock((Pozole.class));
    }

    @Test
    public void testName() throws Exception {
        Pozole pozolillo = new Pozolillo();
        String name = pozolillo.getName();
        assertEquals("Pozolillo", name);
    }



}
