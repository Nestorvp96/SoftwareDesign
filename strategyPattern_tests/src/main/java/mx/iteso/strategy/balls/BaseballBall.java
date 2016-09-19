package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.AirMove;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class BaseballBall extends Ball {
    public BaseballBall() {
        deflateBehavior = new NotDeflatable();
        moveBehavior = new AirMove();
        type = "Baseball ball";
    }
}
