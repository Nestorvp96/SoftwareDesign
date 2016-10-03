package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {
    public TacoNormal(Size size){
        this.size = size;
        description = "Taco normal " + size;
    }

    private TacoNormal(){
    }

    @Override
    public double cost() throws Exception{
        switch (size){
            case mega:
                return 10.00;
            case regular:
                return 8.00;
            case mini:
                return 6.00;
            default:
                return 8.00;
        }
    }
}
