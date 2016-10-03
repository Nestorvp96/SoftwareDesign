package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

/**
 * Created by CesarAlejandro on 9/29/2016.
 */
public class Pescado extends CondimentsDecorator {
    Taco taco;

    public Pescado (Taco taco){
        this.taco = taco;
        this.size = taco.size;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con pescado";
    }

    @Override
    public double cost() throws Exception{
        switch (size){
            case mega:
                return 8.00 + taco.cost();
            case regular:
                return 6.00 + taco.cost();
            case mini:
                throw new Exception("No hay disponible en tamaño mini");
            default:
                return 6.00 ;
        }
    }
}
