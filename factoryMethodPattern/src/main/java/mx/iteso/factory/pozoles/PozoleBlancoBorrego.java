package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by CesarAlejandro on 10/6/2016.
 */
public class PozoleBlancoBorrego extends Pozole {
    public PozoleBlancoBorrego() {
        name = "Pozole Blanco con Borrego";
        broth = "Caldo Blanco";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}
