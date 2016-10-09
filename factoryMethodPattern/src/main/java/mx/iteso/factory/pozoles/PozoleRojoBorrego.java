package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by CesarAlejandro on 10/6/2016.
 */
public class PozoleRojoBorrego extends Pozole {
    public PozoleRojoBorrego() {
        name = "Pozole Rojo con Borrego";
        broth = "Caldo Rojo";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}
