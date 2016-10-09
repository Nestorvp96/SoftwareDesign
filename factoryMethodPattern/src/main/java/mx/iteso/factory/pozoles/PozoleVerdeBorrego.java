package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by CesarAlejandro on 10/6/2016.
 */
public class PozoleVerdeBorrego extends Pozole {
    public PozoleVerdeBorrego() {
        name = "Pozole Verde con Borrego";
        broth = "Caldo Verde";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}
