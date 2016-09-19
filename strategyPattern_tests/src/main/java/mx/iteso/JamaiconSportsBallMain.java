package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.*;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

import java.util.Scanner;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        String bouncebehavior = new String();

        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();
        Ball basket = new BaseballBall();
        Ball bowling = new BowlingBall();
        Ball hand = new HandballBall();
        Ball rugby = new RugbyBall();
        Ball tennis = new TennisBall();



        System.out.print("Insert bouncing behavior (N/I) of soccer ball: ");
        do {
            bouncebehavior = scan.nextLine();
            if (bouncebehavior.equals("N")||bouncebehavior.equals("I")) {
                soccer.setBounceBehavior(bouncebehavior);
            } else {
                System.out.println("Incorrect input, try again");
            }
        }while(!(bouncebehavior.equals("N")||bouncebehavior.equals("I")));
        System.out.println(soccer.roll());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());

        System.out.println();
        System.out.print("Insert bouncing behavior (N/I)of american ball: ");
        do {
            bouncebehavior = scan.nextLine();
            if (bouncebehavior.equals("N")||bouncebehavior.equals("I")) {
                american.setBounceBehavior(bouncebehavior);
            } else {
                System.out.println("Incorrect input, try again");
            }
        }while(!(bouncebehavior.equals("N")||bouncebehavior.equals("I")));

        System.out.println(american.roll());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());

        System.out.println();
        System.out.print("Insert bouncing behavior (N/I) baseball ball: ");
        do {
            bouncebehavior = scan.nextLine();
            if (bouncebehavior.equals("N")||bouncebehavior.equals("I")) {
                base.setBounceBehavior(bouncebehavior);
            } else {
                System.out.println("Incorrect input, try again");
            }
        }while(!(bouncebehavior.equals("N")||bouncebehavior.equals("I")));

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());


        System.out.println();
        System.out.print("Insert bouncing behavior (N/I) basketball: ");
        do {
            bouncebehavior = scan.nextLine();
            if (bouncebehavior.equals("N")||bouncebehavior.equals("I")) {
                base.setBounceBehavior(bouncebehavior);
            } else {
                System.out.println("Incorrect input, try again");
            }
        }while(!(bouncebehavior.equals("N")||bouncebehavior.equals("I")));

        System.out.println(basket.roll());
        System.out.println(basket.performBounce());
        System.out.println(basket.performDeflate());
        System.out.println(basket.performInflate());


        System.out.println();
        System.out.print("Insert bouncing behavior (N/I) bowling ball: ");
        do {
            bouncebehavior = scan.nextLine();
            if (bouncebehavior.equals("N")||bouncebehavior.equals("I")) {
                base.setBounceBehavior(bouncebehavior);
            } else {
                System.out.println("Incorrect input, try again");
            }
        }while(!(bouncebehavior.equals("N")||bouncebehavior.equals("I")));

        System.out.println(bowling.roll());
        System.out.println(bowling.performBounce());
        System.out.println(bowling.performDeflate());
        System.out.println(bowling.performInflate());


        System.out.println();
        System.out.print("Insert bouncing behavior (N/I) handball ball: ");
        do {
            bouncebehavior = scan.nextLine();
            if (bouncebehavior.equals("N")||bouncebehavior.equals("I")) {
                base.setBounceBehavior(bouncebehavior);
            } else {
                System.out.println("Incorrect input, try again");
            }
        }while(!(bouncebehavior.equals("N")||bouncebehavior.equals("I")));

        System.out.println(hand.roll());
        System.out.println(hand.performBounce());
        System.out.println(hand.performDeflate());
        System.out.println(hand.performInflate());


        System.out.println();
        System.out.print("Insert bouncing behavior (N/I) rugby ball: ");
        do {
            bouncebehavior = scan.nextLine();
            if (bouncebehavior.equals("N")||bouncebehavior.equals("I")) {
                base.setBounceBehavior(bouncebehavior);
            } else {
                System.out.println("Incorrect input, try again");
            }
        }while(!(bouncebehavior.equals("N")||bouncebehavior.equals("I")));

        System.out.println(rugby.roll());
        System.out.println(rugby.performBounce());
        System.out.println(rugby.performDeflate());
        System.out.println(rugby.performInflate());


        System.out.println();
        System.out.print("Insert bouncing behavior (N/I) tennis ball: ");
        do {
            bouncebehavior = scan.nextLine();
            if (bouncebehavior.equals("N")||bouncebehavior.equals("I")) {
                base.setBounceBehavior(bouncebehavior);
            } else {
                System.out.println("Incorrect input, try again");
            }
        }while(!(bouncebehavior.equals("N")||bouncebehavior.equals("I")));

        System.out.println(tennis.roll());
        System.out.println(tennis.performBounce());
        System.out.println(tennis.performDeflate());
        System.out.println(tennis.performInflate());

    }
}
