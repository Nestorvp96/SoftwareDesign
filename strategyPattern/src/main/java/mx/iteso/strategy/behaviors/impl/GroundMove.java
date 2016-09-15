package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.MoveBehavior;
/**
 * Created by CesarAlejandro on 9/12/2016.
 */
public class GroundMove implements MoveBehavior {
    public String move() {
        return "I move in the ground!";
    }
}
