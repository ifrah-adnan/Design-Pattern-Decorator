package deco;

import boisson.Boisson;

/**
 * @author Dell Latitude 5420
 * IFRAH ADNAN
 **/
public class Choco extends DecoIngr {
    public Choco(Boisson boisson) {
        super(boisson);
        description=boisson.getDescription()+" Au Chocolat";
    }

    @Override
    public double cout() {
        return 3+ boisson.cout();
    }
}
