package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by CesarAlejandro on 10/6/2016.
 */
public class PozoleBlancoTripa extends Pozole {
    public PozoleBlancoTripa() {
        name = "Pozole Blanco con Tripa";
        broth = "Caldo Blanco";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}
