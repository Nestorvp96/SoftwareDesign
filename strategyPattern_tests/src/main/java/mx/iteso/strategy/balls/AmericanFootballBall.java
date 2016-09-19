package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.AirMove;
import mx.iteso.strategy.behaviors.impl.Deflatable;

public class AmericanFootballBall extends Ball {
    public AmericanFootballBall() {
        deflateBehavior = new Deflatable();
        moveBehavior = new AirMove();
        type = "American Football ball";
    }
}
