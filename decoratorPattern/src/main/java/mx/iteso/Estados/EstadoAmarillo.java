package mx.iteso.Estados;

/**
 * Created by Nestor on 17/11/2016.
 */
public class EstadoAmarillo extends EstadoSemaforo{

    public EstadoAmarillo() {
    }
    // -------------------------------------------
    @Override
    public void mostrar() {
        System.out.println("Luz amarilla");
    }

    public String getstate() {
        return "Luz amarilla";
    }
}
