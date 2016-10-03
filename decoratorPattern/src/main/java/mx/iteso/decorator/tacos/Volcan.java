package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

/**
 * Created by CesarAlejandro on 9/29/2016.
 */
public class Volcan extends Taco{

    public Volcan(){
        description = "Volcan";
        size = Size.regular;
    }

    @Override
    public double cost() {
        return 15.00;
    }

}
