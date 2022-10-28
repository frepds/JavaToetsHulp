package ToetsHulp.NieuwePoging.Juni14_2022.Opgave5;

public class Superman extends OnrechtBestrijder implements KanVliegen {
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

    public String specialeKracht() {
        return "Superman --> specialeKracht";
    }

    public String vermomming() {
        return "Superman --> vermomming";
    }
}
