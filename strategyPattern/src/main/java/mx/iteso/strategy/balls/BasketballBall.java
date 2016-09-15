package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.AirMove;
/**
 * Created by CesarAlejandro on 9/12/2016.
 */
public class BasketballBall extends Ball{
    public BasketballBall(){
        //bounceBehavior = new NormalBounce();
        super("Basketball ball");
        deflateBehavior = new Deflatable();
        moveBehavior = new AirMove();
        type = "Basketball ball";
    }
}
