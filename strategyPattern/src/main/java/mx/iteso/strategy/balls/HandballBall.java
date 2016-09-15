package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.AirMove;
/**
 * Created by CesarAlejandro on 9/12/2016.
 */
public class HandballBall extends Ball{
    public HandballBall(){
        //bounceBehavior =  new IrregularBounce();
        super("Handball ball");
        deflateBehavior = new Deflatable();
        moveBehavior = new AirMove();
        type = "Handball ball";
    }
}
