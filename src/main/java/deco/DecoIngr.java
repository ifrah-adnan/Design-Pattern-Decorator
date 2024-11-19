package deco;

import boisson.Boisson;

/**
 * @author Dell Latitude 5420
 * IFRAH ADNAN
 **/
public abstract class DecoIngr extends Boisson {
    public DecoIngr(Boisson boisson) {
        this.boisson = boisson;
    }

    protected Boisson boisson;

}
