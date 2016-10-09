package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nestor on 08/10/2016.
 */
public class PozoleBlancoStoreTest {



    @Test
    public void testBlancoPozoleBorrego() throws Exception {
        PozoleStore blancoStore = new PozoleBlancoStore();
        Pozole pozole = blancoStore.orderPozole("borrego");
        assertEquals("Pozole Blanco con Borrego", pozole.getName());
    }

    @Test
    public void testBlancoPozoleCachete() throws Exception {
        PozoleStore blancoStore = new PozoleBlancoStore();
        Pozole pozole = blancoStore.orderPozole("cachete");
        assertEquals("Pozole Blanco con Cachete", pozole.getName());
    }

    @Test
    public void testBlancoPozoleOreja() throws Exception {
        PozoleStore blancoStore = new PozoleBlancoStore();
        Pozole pozole = blancoStore.orderPozole("oreja");
        assertEquals("Pozole Blanco con Oreja", pozole.getName());
    }

    @Test
    public void testBlancoPozolePierna() throws Exception {
        PozoleStore blancoStore = new PozoleBlancoStore();
        Pozole pozole = blancoStore.orderPozole("pierna");
        assertEquals("Pozole Blanco con Pierna", pozole.getName());
    }

    @Test
    public void testBlancoPozolePollo() throws Exception {
        PozoleStore blancoStore = new PozoleBlancoStore();
        Pozole pozole = blancoStore.orderPozole("pollo");
        assertEquals("Pozole Blanco con Pollo", pozole.getName());
    }

    @Test
    public void testBlancoPozoleTripa() throws Exception {
        PozoleStore blancoStore = new PozoleBlancoStore();
        Pozole pozole = blancoStore.orderPozole("tripa");
        assertEquals("Pozole Blanco con Tripa", pozole.getName());
    }

    @Test
    public void testBlancoPozoleTrompa() throws Exception {
        PozoleStore blancoStore = new PozoleBlancoStore();
        Pozole pozole = blancoStore.orderPozole("trompa");
        assertEquals("Pozole Blanco con Trompa", pozole.getName());
    }
}
