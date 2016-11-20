package mx.iteso.Estados;

/**
 * Created by Nestor on 17/11/2016.
 */
public class EstadoRojo extends EstadoSemaforo{

    public EstadoRojo() {
    }
    // -------------------------------------------
    @Override
    public void mostrar() {
        System.out.println("Luz rojo");
    }

    public String getstate() {
        return "Luz rojo";
    }
}
