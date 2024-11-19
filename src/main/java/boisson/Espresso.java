package boisson;

/**
 * @author Dell Latitude 5420
 * IFRAH ADNAN
 **/
public class Espresso extends Boisson{
    public Espresso() {
        description="this is Esprsso";
    }

    @Override
    public double cout() {
        System.out.println("Cafe Espresso");
        return 9;
    }
}
