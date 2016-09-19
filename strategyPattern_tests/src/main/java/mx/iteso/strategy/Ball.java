package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.MoveBehavior;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

import java.util.Scanner;

public abstract class Ball {

    public BounceBehavior bounceBehavior;
    public DeflateBehavior deflateBehavior;
    public MoveBehavior moveBehavior;
    public String type;
    public Scanner scan = new Scanner(System.in);

    public Ball() {
    }

    public void setBounceBehavior(String bouncebehavior) {
        if (bouncebehavior.equals("N")) {
            bounceBehavior = new NormalBounce();
        } else {
            bounceBehavior = new IrregularBounce();
        }
    }

    public String roll() {
        return type + " is rolling!";
    }

    public String performBounce() {
        return bounceBehavior.bounce();
    }

    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() {
        return deflateBehavior.inflate();
    }

    public String performMove() { return moveBehavior.move(); }

}
