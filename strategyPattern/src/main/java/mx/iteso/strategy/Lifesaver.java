package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.DeflateBehavior;

import java.util.Scanner;

public class Lifesaver {

    public DeflateBehavior deflateBehavior;
    public String type;

    public Lifesaver(){

    }

    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() {
        return deflateBehavior.inflate();
    }

    public String floating() {
        return "I'm floating";
    }

    public String display() {
        return "I'm a " + type;
    }
}
