package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.AirMove;

public class BaseballBall extends Ball {
    public BaseballBall() {
        //bounceBehavior = new IrregularBounce();
        super("Baseball ball");
        deflateBehavior = new NotDeflatable();
        moveBehavior = new AirMove();
        type = "Baseball ball";
    }
}
