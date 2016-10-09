package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.Menudo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Nestor on 08/10/2016.
 */
public class MenudoStoreTest {



    @Test
    public void testName() throws Exception {
        PozoleStore menuderia = new MenudoStore();
        Pozole pozole = menuderia.orderPozole("");
        assertEquals("Menudo", pozole.getName());
    }
}
