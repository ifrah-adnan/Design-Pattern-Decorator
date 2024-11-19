package deco;

import boisson.Boisson;

/**
 * @author Dell Latitude 5420
 * IFRAH ADNAN
 **/
public class Noisette extends DecoIngr {
    public Noisette(Boisson boisson) {
        super(boisson);
        description= boisson.getDescription()+" Au noisette";
    }

    @Override
    public double cout() {
        return 4+ boisson.cout();
    }
}
