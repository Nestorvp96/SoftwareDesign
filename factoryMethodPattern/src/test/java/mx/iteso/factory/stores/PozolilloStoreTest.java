package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nestor on 08/10/2016.
 */
public class PozolilloStoreTest {

    @Test
    public void testName() throws Exception {
        PozoleStore pozolillo = new PozolilloStore();
        Pozole pozole = pozolillo.orderPozole("");
        assertEquals("Pozolillo", pozole.getName());
    }
}
