package mx.iteso;

import mx.iteso.Estados.EstadoAmarillo;
import mx.iteso.Estados.EstadoRojo;
import mx.iteso.Estados.EstadoSemaforo;
import mx.iteso.Estados.EstadoVerde;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nestor on 17/11/2016.
 */
public class SemaforoTest {

    @Test
    public void testStateDeafault(){

        Semaforo objSemaforo = new Semaforo();
        assertEquals("Luz verde", objSemaforo.estado());

    }
    @Test
    public void testStateAmarillo(){

        Semaforo objSemaforo = new Semaforo();
        objSemaforo.setEstado( new EstadoAmarillo() );
        assertEquals("Luz amarilla", objSemaforo.estado());

    }
    @Test
    public void testStateRojo(){

        Semaforo objSemaforo = new Semaforo();
        objSemaforo.setEstado( new EstadoRojo() );
        assertEquals("Luz rojo", objSemaforo.estado());

    }

    @Test
    public void testStateVerde(){

        Semaforo objSemaforo = new Semaforo();
        objSemaforo.setEstado( new EstadoVerde() );
        assertEquals("Luz verde", objSemaforo.estado());

    }

}
