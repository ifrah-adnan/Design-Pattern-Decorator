package boisson;

/**
 * @author Dell Latitude 5420
 * IFRAH ADNAN
 **/
public class Allonge extends Boisson {
    public Allonge() {
        description="this is Allonge";
    }

    @Override
    public double cout() {
        System.out.println("Cafe Allonge");
        return 10;
    }
}
