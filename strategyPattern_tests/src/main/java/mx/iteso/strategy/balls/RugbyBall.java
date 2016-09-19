package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.AirMove;
import mx.iteso.strategy.behaviors.impl.Deflatable;

/**
 * Created by CesarAlejandro on 9/12/2016.
 */
public class RugbyBall extends Ball {
    public RugbyBall(){
        deflateBehavior = new Deflatable();
        moveBehavior = new AirMove();
        type = "Rugby ball";
    }
}
