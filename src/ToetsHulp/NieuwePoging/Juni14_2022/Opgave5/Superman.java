package ToetsHulp.NieuwePoging.Juni14_2022.Opgave5;

public class Superman extends OnrechtBestrijder implements KanVliegen{
    public Superman() {
        super(42);
    }

    public Superman(String s) {
        super("Empty");
    }

    @Override
    public double snelheid() {
        return 42;
    }
}
