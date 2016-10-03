package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco {
    public Quesadilla(Size size){
        this.size = size;
        description = "Quesadilla " + size;
    }

    private Quesadilla(){}

    @Override
    public double cost() {
        switch (size){
            case mega:
                return 12.00;
            case regular:
                return 10.00;
            case mini:
                return 8.00;
            default:
                return 10.00;
        }
    }
}
