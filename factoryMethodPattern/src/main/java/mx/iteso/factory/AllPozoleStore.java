package mx.iteso.factory;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;
import mx.iteso.factory.stores.*;

/**
 * Created by CesarAlejandro on 10/3/2016.
 */
public class AllPozoleStore {

    public PozoleStore store;

    public Pozole orderPozole(String color, String meat){
        Pozole pozole;

        pozole = createPozole(color,meat);

        pozole.prepare();
        pozole.serve();

        return pozole;
    }

    public Pozole createPozole(String color, String meat){
        if (color.equals("menudo")){
            store = new MenudoStore();
            return store.createPozole("");
        }
        if (color.equals("blanco")){
            store = new PozoleBlancoStore();
            return store.createPozole(meat);
        }
        if (color.equals("rojo")){
            store = new PozoleRojoStore();
            return store.createPozole(meat);
        }
        if (color.equals("verde")){
            store = new PozoleVerdeStore();
            return store.createPozole(meat);
        }
        if (color.equals("pozolillo")){
            store = new PozolilloStore();
            return store.createPozole("");
        }
        return null;
    }

}
