package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso(Taco taco){
        this.taco = taco;
        this.size = taco.size;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con queso";
    }

    @Override
    public double cost() throws Exception{
        switch (size){
            case mega:
                return 3.00 + taco.cost();
            case regular:
                return 2.00 + taco.cost();
            case mini:
                return 1.00 + taco.cost();
            default:
                return 2.00 ;
        }
    }

}
