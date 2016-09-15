package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.GroundMove;

public class SoccerBall extends Ball {
    public SoccerBall() {
        //bounceBehavior = new NormalBounce();
        super("Soccer ball");
        deflateBehavior = new Deflatable();
        moveBehavior = new GroundMove();
        type = "Soccer ball";
    }
}
