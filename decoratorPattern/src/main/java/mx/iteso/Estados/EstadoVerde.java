package mx.iteso.Estados;

/**
 * Created by Nestor on 17/11/2016.
 */
public class EstadoVerde extends EstadoSemaforo{

    public EstadoVerde() {
    }
    // -------------------------------------------
    @Override
    public void mostrar() {
        System.out.println("Luz verde");

    }

    public String getstate() {
        return "Luz verde";
    }

}
