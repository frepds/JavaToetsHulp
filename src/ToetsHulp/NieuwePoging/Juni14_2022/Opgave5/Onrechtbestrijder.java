package ToetsHulp.NieuwePoging.Juni14_2022.Opgave5;

public class Onrechtbestrijder extends Held implements HeeftAartsvijand{
    public Onrechtbestrijder(int x) {
        super("Captain Napalm", 42);
    }

    public Onrechtbestrijder(String s) {
        this(42);
    }


    @Override
    public int kwetsbaar(boolean x) {
        return 42;
    }

    @Override
    public int kwetsbaar(int y) {
        return 42;
    }

    @Override
    public String specialeKracht() {
        return "Onrechtbestrijder --> specialeKracht";
    }

    @Override
    public String vermomming() {
        return "Onrechtbestrijder --> vermomming";
    }

}
