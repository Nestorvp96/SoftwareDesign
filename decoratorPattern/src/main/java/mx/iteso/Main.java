package mx.iteso;

import mx.iteso.Estados.EstadoAmarillo;
import mx.iteso.Estados.EstadoRojo;

/**
 * Created by Nestor on 17/11/2016.
 */
public class Main {

    public static void main(String[] args)
    {
        Semaforo objSemaforo = new Semaforo();
        // Muestra el aviso por defecto (verde, no hay alerta)
        objSemaforo.mostrar();
        objSemaforo.setEstado( new EstadoAmarillo() );
        objSemaforo.mostrar();
        objSemaforo.setEstado( new EstadoRojo() );
        objSemaforo.mostrar();
    }
}
