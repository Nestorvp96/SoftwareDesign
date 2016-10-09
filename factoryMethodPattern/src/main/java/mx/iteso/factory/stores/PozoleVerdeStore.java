package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

public class PozoleVerdeStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String meat) {
        if (meat.equals("borrego"))
            return new PozoleVerdeBorrego();
        if (meat.equals("cachete") )
            return new PozoleVerdeCachete();
        if (meat.equals("oreja"))
            return new PozoleVerdeOreja();
        if (meat.equals("pierna") )
            return new PozoleVerdePierna();
        if (meat.equals("pollo"))
            return new PozoleVerdePollo();
        if (meat.equals("tripa"))
            return new PozoleVerdeTripa();
        if (meat.equals("trompa"))
            return new PozoleVerdeTrompa();
        return null;
    }
}
