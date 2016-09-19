package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.GroundMove;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by CesarAlejandro on 9/12/2016.
 */
public class BowlingBall extends Ball {
    public BowlingBall(){
        deflateBehavior = new NotDeflatable();
        moveBehavior = new GroundMove();
        type = "Bowling ball";
    }
}
