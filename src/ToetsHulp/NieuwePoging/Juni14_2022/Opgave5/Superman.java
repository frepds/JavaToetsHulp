package ToetsHulp.NieuwePoging.Juni14_2022.Opgave5;

public class Superman extends Onrechtbestrijder implements KanVliegen{
    public Superman() {
        super(42);
    }

    public Superman(String s) {
        this();
    }

    @Override
    public double snelheid() {
        return 42;
    }

    @Override
    public String vermomming() {
        return "Superman --> vermomming";
    }

    @Override
    public String specialeKracht() {
        return "Superman --> specialeKracht";
    }
}
