package mx.iteso.factory;

import mx.iteso.factory.stores.PozoleBlancoStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by Nestor on 08/10/2016.
 */
public class AllPozoleStoreTest {


    @Test
    public void testBlancoPozole() throws Exception {
        AllPozoleStore store = new AllPozoleStore();
        Pozole pozole = store.orderPozole("blanco","borrego");
        assertEquals("Pozole Blanco con Borrego", pozole.getName());
        pozole = store.orderPozole("blanco","cachete");
        assertEquals("Pozole Blanco con Cachete", pozole.getName());
        pozole = store.orderPozole("blanco","oreja");
        assertEquals("Pozole Blanco con Oreja", pozole.getName());
        pozole = store.orderPozole("blanco","pierna");
        assertEquals("Pozole Blanco con Pierna", pozole.getName());
        pozole = store.orderPozole("blanco","pollo");
        assertEquals("Pozole Blanco con Pollo", pozole.getName());
        pozole = store.orderPozole("blanco","tripa");
        assertEquals("Pozole Blanco con Tripa", pozole.getName());
        pozole = store.orderPozole("blanco","trompa");
        assertEquals("Pozole Blanco con Trompa", pozole.getName());

    }

    @Test
    public void testRojoPozole() throws Exception {
        AllPozoleStore store = new AllPozoleStore();
        Pozole pozole = store.orderPozole("rojo","borrego");
        assertEquals("Pozole Rojo con Borrego", pozole.getName());
        pozole = store.orderPozole("rojo","cachete");
        assertEquals("Pozole Rojo con Cachete", pozole.getName());
        pozole = store.orderPozole("rojo","oreja");
        assertEquals("Pozole Rojo con Oreja", pozole.getName());
        pozole = store.orderPozole("rojo","pierna");
        assertEquals("Pozole Rojo con Pierna", pozole.getName());
        pozole = store.orderPozole("rojo","pollo");
        assertEquals("Pozole Rojo con Pollo", pozole.getName());
        pozole = store.orderPozole("rojo","tripa");
        assertEquals("Pozole Rojo con Tripa", pozole.getName());
        pozole = store.orderPozole("rojo","trompa");
        assertEquals("Pozole Rojo con Trompa", pozole.getName());

    }

    @Test
    public void testVerdePozole() throws Exception {
        AllPozoleStore store = new AllPozoleStore();
        Pozole pozole = store.orderPozole("verde","borrego");
        assertEquals("Pozole Verde con Borrego", pozole.getName());
        pozole = store.orderPozole("verde","cachete");
        assertEquals("Pozole Verde con Cachete", pozole.getName());
        pozole = store.orderPozole("verde","oreja");
        assertEquals("Pozole Verde con Oreja", pozole.getName());
        pozole = store.orderPozole("verde","pierna");
        assertEquals("Pozole Verde con Pierna", pozole.getName());
        pozole = store.orderPozole("verde","pollo");
        assertEquals("Pozole Verde con Pollo", pozole.getName());
        pozole = store.orderPozole("verde","tripa");
        assertEquals("Pozole Verde con Tripa", pozole.getName());
        pozole = store.orderPozole("verde","trompa");
        assertEquals("Pozole Verde con Trompa", pozole.getName());

    }

    @Test
    public void testPozolillo() throws Exception {
        AllPozoleStore store = new AllPozoleStore();
        Pozole pozole = store.orderPozole("pozolillo","");
        assertEquals("Pozolillo", pozole.getName());

    }

    @Test
    public void testMenudo() throws Exception {
        AllPozoleStore store = new AllPozoleStore();
        Pozole pozole = store.orderPozole("menudo","");
        assertEquals("Menudo", pozole.getName());

    }

}
