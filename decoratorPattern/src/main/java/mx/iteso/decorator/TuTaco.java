package mx.iteso.decorator;

import mx.iteso.decorator.condiments.Cebolla;
import mx.iteso.decorator.condiments.Cilantro;
import mx.iteso.decorator.condiments.TortillaHarina;
import mx.iteso.decorator.condiments.TortillaMaiz;
import mx.iteso.decorator.condiments.meat.Chorizo;
import mx.iteso.decorator.condiments.meat.Lengua;
import mx.iteso.decorator.condiments.meat.Pastor;
import mx.iteso.decorator.condiments.meat.Pescado;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;

public class TuTaco {
    public static void main(String[] args) throws Exception {
        Taco taco = new TacoNormal(Taco.Size.mega);
        System.out.println(taco.getDescription());
        System.out.println("$" + taco.cost() + " MXN");

        taco = new TortillaMaiz(taco);
        taco = new Chorizo(taco);
        taco = new Cebolla(taco);
        taco = new Cilantro(taco);

        System.out.println();
        System.out.println();
        System.out.println(taco.getDescription());
        System.out.println("$" + taco.cost() + " MXN");

        Taco taco2 = new TacoNormal(Taco.Size.regular);

        taco2 = new TortillaHarina(taco2);
        taco2 = new Lengua(taco2);
        taco2 = new Cilantro(taco2);

        System.out.println();
        System.out.println();
        System.out.println(taco2.getDescription());
        System.out.println("$" + taco2.cost() + " MXN");

        Taco taco3 = new Quesadilla(Taco.Size.mini);

        taco3 = new TortillaHarina(taco3);
        taco3 = new Pastor(taco3);
        taco3 = new Cebolla(taco3);

        System.out.println();
        System.out.println();
        System.out.println(taco3.getDescription());
        System.out.println("$" + taco3.cost() + " MXN");

        Taco taco4 = new TacoNormal(Taco.Size.mini);

        taco4 = new TortillaMaiz(taco4);
        taco4 = new Pescado(taco4);

        System.out.println();
        System.out.println();
        System.out.println(taco4.getDescription());
        System.out.println("$" + taco4.cost() + " MXN");
    }
}
