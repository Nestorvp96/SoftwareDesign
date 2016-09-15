package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.*;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
        Ball american = new AmericanFootballBall();
        Ball base = new BaseballBall();
        Ball bask = new BasketballBall();
        Ball bowl = new BowlingBall();
        Ball han = new HandballBall();
        Ball rug = new RugbyBall();
        Ball soccer = new SoccerBall();
        Ball tenn = new TennisBall();

        System.out.println(american.roll());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());

        System.out.println();

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());

        System.out.println();

        System.out.println(bask.roll());
        System.out.println(bask.performBounce());
        System.out.println(bask.performDeflate());
        System.out.println(bask.performInflate());

        System.out.println();

        System.out.println(bowl.roll());
        System.out.println(bowl.performBounce());
        System.out.println(bowl.performDeflate());
        System.out.println(bowl.performInflate());

        System.out.println();

        System.out.println(han.roll());
        System.out.println(han.performBounce());
        System.out.println(han.performDeflate());
        System.out.println(han.performInflate());

        System.out.println();

        System.out.println(rug.roll());
        System.out.println(rug.performBounce());
        System.out.println(rug.performDeflate());
        System.out.println(rug.performInflate());

        System.out.println();

        System.out.println(soccer.roll());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());

        System.out.println();

        System.out.println(tenn.roll());
        System.out.println(tenn.performBounce());
        System.out.println(tenn.performDeflate());
        System.out.println(tenn.performInflate());

    }
}
