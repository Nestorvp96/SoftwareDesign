package mx.iteso;

import mx.iteso.Estados.EstadoSemaforo;
import mx.iteso.Estados.EstadoVerde;

/**
 * Created by Nestor on 17/11/2016.
 */
public class Semaforo {

    private EstadoSemaforo objEstadoSemaforo;
    // -------------------------------------------
    public Semaforo() {
        this.objEstadoSemaforo = new EstadoVerde();
    }
    // -------------------------------------------
    public void setEstado( EstadoSemaforo objEstadoSemaforo ) {
        this.objEstadoSemaforo = objEstadoSemaforo;
    }
    // -------------------------------------------

    public void mostrar() {
        this.objEstadoSemaforo.mostrar();
    }

    public String estado(){return this.objEstadoSemaforo.getstate();}
}
