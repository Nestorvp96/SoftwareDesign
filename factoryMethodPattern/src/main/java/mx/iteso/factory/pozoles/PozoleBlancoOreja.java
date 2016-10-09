package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by CesarAlejandro on 10/3/2016.
 */
public class PozoleBlancoOreja extends Pozole {
    public PozoleBlancoOreja() {
        name = "Pozole Blanco con Oreja";
        broth = "Caldo Blanco";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}
