package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nestor on 08/10/2016.
 */
public class PozoleVerdeStoreTest {

    @Test
    public void testVerdePozoleBorrego() throws Exception {
        PozoleStore verdeStore = new PozoleVerdeStore();
        Pozole pozole = verdeStore.orderPozole("borrego");
        assertEquals("Pozole Verde con Borrego", pozole.getName());

    }

    @Test
    public void testVerdePozoleCachete() throws Exception {
        PozoleStore verdeStore = new PozoleVerdeStore();
        Pozole pozole = verdeStore.orderPozole("cachete");
        assertEquals("Pozole Verde con Cachete", pozole.getName());

    }

    @Test
    public void testVerdePozoleOreja() throws Exception {
        PozoleStore verdeStore = new PozoleVerdeStore();
        Pozole pozole = verdeStore.orderPozole("oreja");
        assertEquals("Pozole Verde con Oreja", pozole.getName());

    }

    @Test
    public void testVerdePozolePierna() throws Exception {
        PozoleStore verdeStore = new PozoleVerdeStore();
        Pozole pozole = verdeStore.orderPozole("pierna");
        assertEquals("Pozole Verde con Pierna", pozole.getName());

    }

    @Test
    public void testVerdePozolePollo() throws Exception {
        PozoleStore verdeStore = new PozoleVerdeStore();
        Pozole pozole = verdeStore.orderPozole("pollo");
        assertEquals("Pozole Verde con Pollo", pozole.getName());

    }

    @Test
    public void testVerdePozoleTripa() throws Exception {
        PozoleStore verdeStore = new PozoleVerdeStore();
        Pozole pozole = verdeStore.orderPozole("tripa");
        assertEquals("Pozole Verde con Tripa", pozole.getName());

    }

    @Test
    public void testVerdePozoleTrompa() throws Exception {
        PozoleStore verdeStore = new PozoleVerdeStore();
        Pozole pozole = verdeStore.orderPozole("trompa");
        assertEquals("Pozole Verde con Trompa", pozole.getName());

    }
}
