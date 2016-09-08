package mx.iteso;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static mx.iteso.Printer.*;
import static org.junit.Assert.*;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.Mockito.*;


//Néstor Velasco Pérez   y Alejandro Valdes Montalvo

public class TacitKnowledgePrinterTest {

    private Printer printer;
    private TacitKnowledgePrinter tacit;


    @Before
    public void setup() {
        printer = mock(Printer.class);
        tacit = new TacitKnowledgePrinter(printer);
        when(printer.print(anyString())).then(returnsFirstArg());
    }

    @Test (expected = RuntimeException.class)
    public void Imprimir_cero() {
        tacit.printNumbers(0);
    }

    @Test
    public void Testcalcular() {
        tacit.printNumbers(10);
        verify(printer, times(10)).print(anyString());
    }

    @Test
    public void printStringsThreeFiveTest() {
        Assert.assertEquals(
                tacit.calculate(15),
                "TacitKnowledge"
        );
    }

    @Test
    public void test_imprimir_test() {
        Assert.assertEquals(
                tacit.calculate(3),
                "Tacit"
        );
    }

    @Test
    public void test_cinco() {
        Assert.assertEquals(
                tacit.calculate(5),
                "Knowledge"
        );
    }

    @Test
    public void test_invalido() {
        Assert.assertEquals(
                tacit.calculate(17),
                "17"
        );
    }

    @Test
    public void contadorquince() {
        Assert.assertEquals(
                tacit.printNumbers(15),
                "12Tacit4KnowledgeTacit78TacitKnowledge11Tacit1314TacitKnowledge"
        );
    }

    @Test (expected = RuntimeException.class)
    public void division_cero() {
        Assert.assertEquals(
                tacit.calculate(0),
                "0"
        );
    }








}
