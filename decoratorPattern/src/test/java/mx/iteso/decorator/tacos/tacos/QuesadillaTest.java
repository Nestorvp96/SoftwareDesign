package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.Cebolla;
import mx.iteso.decorator.condiments.Cilantro;
import mx.iteso.decorator.condiments.TortillaHarina;
import mx.iteso.decorator.condiments.TortillaMaiz;
import mx.iteso.decorator.condiments.meat.*;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nestor on 02/10/2016.
 */
public class QuesadillaTest {

    @Test
    public void testregularCost() throws Exception {
        Taco taco = new Quesadilla(Taco.Size.regular);
        assertEquals(10.0, taco.cost(),0);
    }
    @Test
    public void testminiCost() throws Exception {
        Taco taco = new Quesadilla(Taco.Size.mini);
        assertEquals(8.0, taco.cost(),0);
    }
    @Test
    public void testmegaCost() throws Exception {
        Taco taco = new Quesadilla(Taco.Size.mega);
        assertEquals(12.0, taco.cost(),0);
    }

    @Test
    public void testCamaron1() throws Exception {
        Taco taco = new Quesadilla(Taco.Size.mega);
        taco = new TortillaMaiz(taco);
        taco = new Camaron(taco);
        assertEquals(20.0, taco.cost(),0);
        assertEquals("Quesadilla mega en tortilla de maíz con camaron", taco.getDescription());
    }
    @Test
    public void testCamaron2() throws Exception {
        Taco taco = new Quesadilla(Taco.Size.regular);
        taco = new TortillaHarina(taco);
        taco = new Camaron(taco);
        assertEquals(20.0, taco.cost(),0);
        assertEquals("Quesadilla regular en tortilla de harina con camaron", taco.getDescription());
    }

    @Test
    public void testBistec1() throws Exception {
        Taco taco = new Quesadilla(Taco.Size.mega);
        taco = new TortillaHarina(taco);
        taco = new Bistec(taco);
        assertEquals(17.0, taco.cost(),0);
        assertEquals("Quesadilla mega en tortilla de harina con bistec", taco.getDescription());
    }

    @Test
    public void testBistec2() throws Exception {
        Taco taco = new Quesadilla(Taco.Size.mini);
        taco = new TortillaMaiz(taco);
        taco = new Bistec(taco);
        assertEquals(7.0, taco.cost(),0);
        assertEquals("Quesadilla mini en tortilla de maíz con bistec", taco.getDescription());
    }

    @Test
    public void testPastor1() throws Exception {
        Taco taco = new Quesadilla(Taco.Size.mega);
        taco = new TortillaHarina(taco);
        taco = new Pastor(taco);
        assertEquals(17.0, taco.cost(),0);
        assertEquals("Quesadilla mega en tortilla de harina con pastor", taco.getDescription());
    }

    @Test
    public void testPastor2() throws Exception {
        Taco taco = new Quesadilla(Taco.Size.mini);
        taco = new TortillaMaiz(taco);
        taco = new Pastor(taco);
        assertEquals(7.0, taco.cost(),0);
        assertEquals("Quesadilla mini en tortilla de maíz con pastor", taco.getDescription());
    }

    @Test
    public void testChorizo1() throws Exception {
        Taco taco = new Quesadilla(Taco.Size.mega);
        taco = new TortillaHarina(taco);
        taco = new Chorizo(taco);
        assertEquals(17.0, taco.cost(),0);
        assertEquals("Quesadilla mega en tortilla de harina con chorizo", taco.getDescription());
    }

    @Test
    public void testChorizo2() throws Exception {
        Taco taco = new Quesadilla(Taco.Size.mini);
        taco = new TortillaMaiz(taco);
        taco = new Chorizo(taco);
        assertEquals(7.0, taco.cost(),0);
        assertEquals("Quesadilla mini en tortilla de maíz con chorizo", taco.getDescription());
    }

    @Test
    public void testLengua1() throws Exception {
        Taco taco = new Quesadilla(Taco.Size.mega);
        taco = new TortillaHarina(taco);
        taco = new Lengua(taco);
        taco = new Cilantro(taco);
        assertEquals(19.0, taco.cost(),0);
        assertEquals("Quesadilla mega en tortilla de harina con lengua con cilantro", taco.getDescription());
    }

    @Test
    public void testLengua2() throws Exception {
        Taco taco = new Quesadilla(Taco.Size.mini);
        taco = new TortillaMaiz(taco);
        taco = new Lengua(taco);
        taco = new Cebolla(taco);
        assertEquals(9.0, taco.cost(),0);
        assertEquals("Quesadilla mini en tortilla de maíz con lengua con cebolla", taco.getDescription());
    }

    @Test
    public void testPescado1() throws Exception {
        Taco taco = new Quesadilla(Taco.Size.mega);
        taco = new TortillaMaiz(taco);
        taco = new Pescado(taco);
        assertEquals(20.0, taco.cost(),0);
        assertEquals("Quesadilla mega en tortilla de maíz con pescado", taco.getDescription());
    }
    @Test
    public void testPescado2() throws Exception {
        Taco taco = new Quesadilla(Taco.Size.regular);
        taco = new TortillaHarina(taco);
        taco = new Pescado(taco);
        assertEquals(20.0, taco.cost(),0);
        assertEquals("Quesadilla regular en tortilla de harina con pescado", taco.getDescription());
    }

}
