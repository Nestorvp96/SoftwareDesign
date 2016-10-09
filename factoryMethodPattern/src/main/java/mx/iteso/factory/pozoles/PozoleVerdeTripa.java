package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by CesarAlejandro on 10/6/2016.
 */
public class PozoleVerdeTripa extends Pozole {
    public PozoleVerdeTripa() {
        name = "Pozole Verde con Tripa";
        broth = "Caldo Verde";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}
