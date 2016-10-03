package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Bistec extends CondimentsDecorator {
    Taco taco;

    public Bistec (Taco taco){
        this.taco = taco;
        this.size = taco.size;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con bistec";
    }

    @Override
    public double cost() throws Exception {
        switch (size){
            case mega:
                return 1.00 + taco.cost();
            case regular:
                return 0.00 + taco.cost();
            case mini:
                return -1.00 + taco.cost();
            default:
                return 0.00 ;
        }
    }

}
