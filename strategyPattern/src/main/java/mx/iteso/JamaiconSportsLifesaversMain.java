package mx.iteso;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.lifesavers.ArmBands;
import mx.iteso.strategy.lifesavers.SwimRing;
import mx.iteso.strategy.lifesavers.SwimSeat;

public class JamaiconSportsLifesaversMain {
        public static void main (String[] args) {
            Lifesaver swimRing = new SwimRing();
            Lifesaver swimSeat = new SwimSeat();
            Lifesaver armBands = new ArmBands();

            System.out.println(swimRing.display());
            System.out.println(swimRing.performDeflate());
            System.out.println(swimRing.performInflate());
            System.out.println(swimRing.floating());

            System.out.println();

            System.out.println(swimSeat.display());
            System.out.println(swimSeat.performDeflate());
            System.out.println(swimSeat.performInflate());
            System.out.println(swimSeat.floating());

            System.out.println();

            System.out.println(armBands.display());
            System.out.println(armBands.performDeflate());
            System.out.println(armBands.performInflate());
            System.out.println(armBands.floating());
        }
}
