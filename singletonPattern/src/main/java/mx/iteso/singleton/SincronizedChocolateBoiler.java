package mx.iteso.singleton;

/**
 * Created by Angel on 10/22/16.
 */
public class SincronizedChocolateBoiler {

    private static SincronizedChocolateBoiler instance = null;

    private boolean empty;
    private boolean boiled;

    private SincronizedChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized SincronizedChocolateBoiler getInstance() {
        if(instance == null) instance = new SincronizedChocolateBoiler();
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fi ll the boiler with a milk/chocolate mixture
        }
    }
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}