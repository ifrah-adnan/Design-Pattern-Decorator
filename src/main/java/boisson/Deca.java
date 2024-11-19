package boisson;

/**
 * @author Dell Latitude 5420
 * IFRAH ADNAN
 **/
public class Deca extends Boisson{
    public Deca() {
    description="this is deca";
    }

    @Override
    public double cout() {
        System.out.println("Cafe Deca");
        return 13;
    }
}
