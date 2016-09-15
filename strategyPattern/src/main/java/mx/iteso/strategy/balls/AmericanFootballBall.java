package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.AirMove;

public class AmericanFootballBall extends Ball {
    public AmericanFootballBall() {
       //bounceBehavior =  new IrregularBounce();
        super("American Football ball");
        deflateBehavior = new Deflatable();
        moveBehavior = new AirMove();
        type = "American Football ball";
    }
}
