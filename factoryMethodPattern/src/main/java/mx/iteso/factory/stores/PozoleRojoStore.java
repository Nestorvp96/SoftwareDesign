package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

public class PozoleRojoStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String meat) {
        if (meat.equals("borrego"))
            return new PozoleRojoBorrego();
        if (meat.equals("cachete") )
            return new PozoleRojoCachete();
        if (meat.equals("oreja"))
            return new PozoleRojoOreja();
        if (meat.equals("pierna") )
            return new PozoleRojoPierna();
        if (meat.equals("pollo"))
            return new PozoleRojoPollo();
        if (meat.equals("tripa"))
            return new PozoleRojoTripa();
        if (meat.equals("trompa"))
            return new PozoleRojoTrompa();
        return null;
    }
}
