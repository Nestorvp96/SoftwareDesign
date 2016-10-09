package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

/**
 * Created by CesarAlejandro on 10/3/2016.
 */
public class PozoleBlancoStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String meat) {
        if (meat.equals("borrego"))
            return new PozoleBlancoBorrego();
        if (meat.equals("cachete") )
            return new PozoleBlancoCachete();
        if (meat.equals("oreja"))
            return new PozoleBlancoOreja();
        if (meat.equals("pierna") )
            return new PozoleBlancoPierna();
        if (meat.equals("pollo"))
            return new PozoleBlancoPollo();
        if (meat.equals("tripa"))
            return new PozoleBlancoTripa();
        if (meat.equals("trompa"))
            return new PozoleBlancoTrompa();
        return null;
    }

}
