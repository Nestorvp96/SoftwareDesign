package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.TortillaMaiz;
import mx.iteso.decorator.condiments.meat.*;
import mx.iteso.decorator.tacos.TacoNormal;
import mx.iteso.decorator.tacos.Volcan;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nestor on 02/10/2016.
 */
public class VolcanTest {

    @Test
    public void testCost() throws Exception {
        Taco taco = new Volcan();
        assertEquals(15.0, taco.cost(),0);
    }
    @Test
    public void testCamaron() throws Exception {
        Taco taco = new Volcan();
        taco = new TortillaMaiz(taco);
        taco = new Camaron(taco);
        assertEquals(21.0, taco.cost(),0);
        assertEquals("Volcan en tortilla de maíz con camaron", taco.getDescription());
    }
    @Test
    public void testPescado() throws Exception {
        Taco taco = new Volcan();
        taco = new TortillaMaiz(taco);
        taco = new Pescado(taco);
        assertEquals(21.0, taco.cost(),0);
        assertEquals("Volcan en tortilla de maíz con pescado", taco.getDescription());
    }
    @Test
    public void testBistec() throws Exception {
        Taco taco = new Volcan();
        taco = new TortillaMaiz(taco);
        taco = new Bistec(taco);
        assertEquals(15.0, taco.cost(),0);
        assertEquals("Volcan en tortilla de maíz con bistec", taco.getDescription());
    }
    @Test
    public void testChorizo() throws Exception {
        Taco taco = new Volcan();
        taco = new TortillaMaiz(taco);
        taco = new Chorizo(taco);
        assertEquals(15.0, taco.cost(),0);
        assertEquals("Volcan en tortilla de maíz con chorizo", taco.getDescription());
    }

    @Test
    public void testPastor() throws Exception {
        Taco taco = new Volcan();
        taco = new TortillaMaiz(taco);
        taco = new Pastor(taco);
        assertEquals(15.0, taco.cost(),0);
        assertEquals("Volcan en tortilla de maíz con pastor", taco.getDescription());
    }
    @Test
    public void testLengua() throws Exception {
        Taco taco = new Volcan();
        taco = new TortillaMaiz(taco);
        taco = new Lengua(taco);
        assertEquals(17.0, taco.cost(),0);
        assertEquals("Volcan en tortilla de maíz con lengua", taco.getDescription());
    }

}
