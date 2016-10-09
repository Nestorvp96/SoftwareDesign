package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nestor on 08/10/2016.
 */
public class PozoleRojoStoreTest {


    @Test
    public void testRojoPozoleBorrego() throws Exception {
        PozoleStore rojoStore = new PozoleRojoStore();
        Pozole pozole = rojoStore.orderPozole("borrego");
        assertEquals("Pozole Rojo con Borrego", pozole.getName());

    }

    @Test
    public void testRojoPozoleCachete() throws Exception {
        PozoleStore rojoStore = new PozoleRojoStore();
        Pozole pozole = rojoStore.orderPozole("cachete");
        assertEquals("Pozole Rojo con Cachete", pozole.getName());
    }

    @Test
    public void testRojoPozoleOreja() throws Exception {
        PozoleStore rojoStore = new PozoleRojoStore();
        Pozole pozole = rojoStore.orderPozole("oreja");
        assertEquals("Pozole Rojo con Oreja", pozole.getName());
    }

    @Test
    public void testRojoPozolePierna() throws Exception {
        PozoleStore rojoStore = new PozoleRojoStore();
        Pozole pozole = rojoStore.orderPozole("pierna");
        assertEquals("Pozole Rojo con Pierna", pozole.getName());
    }

    @Test
    public void testRojoPozolePollo() throws Exception {
        PozoleStore rojoStore = new PozoleRojoStore();
        Pozole pozole = rojoStore.orderPozole("pollo");
        assertEquals("Pozole Rojo con Pollo", pozole.getName());
    }

    @Test
    public void testRojoPozoleTripa() throws Exception {
        PozoleStore rojoStore = new PozoleRojoStore();
        Pozole pozole = rojoStore.orderPozole("tripa");
        assertEquals("Pozole Rojo con Tripa", pozole.getName());
    }

    @Test
    public void testRojoPozoleTrompa() throws Exception {
        PozoleStore rojoStore = new PozoleRojoStore();
        Pozole pozole = rojoStore.orderPozole("trompa");
        assertEquals("Pozole Rojo con Trompa", pozole.getName());
    }
}
