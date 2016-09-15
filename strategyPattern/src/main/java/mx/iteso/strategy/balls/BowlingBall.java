package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.GroundMove;
/**
 * Created by CesarAlejandro on 9/12/2016.
 */
public class BowlingBall extends Ball{
    public BowlingBall(){
        //bounceBehavior = new IrregularBounce();
        super("Bowling ball");
        deflateBehavior = new NotDeflatable();
        moveBehavior = new GroundMove();
        type = "Bowling ball";
    }
}
