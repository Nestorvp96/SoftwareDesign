package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.AirMove;
/**
 * Created by CesarAlejandro on 9/12/2016.
 */
public class RugbyBall extends Ball{
    public RugbyBall(){
        //bounceBehavior =  new IrregularBounce();
        super("Rugby ball");
        deflateBehavior = new Deflatable();
        moveBehavior = new AirMove();
        type = "Rugby ball";
    }
}
