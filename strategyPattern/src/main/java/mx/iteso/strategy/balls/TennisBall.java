package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.AirMove;
/**
 * Created by CesarAlejandro on 9/12/2016.
 */
public class TennisBall extends Ball{
    public TennisBall(){
        //bounceBehavior =  new NormalBounce();
        super("Tennis ball");
        deflateBehavior = new Deflatable();
        moveBehavior = new AirMove();
        type = "Tennis ball";
    }
}
