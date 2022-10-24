package ToetsHulp.NieuwePoging.Juni14_2022.Opgave5;

public class OnrechtBestrijder extends Held implements HeeftAartsvijand{
    public OnrechtBestrijder(int x) {
        super("Captain Napalm", 42);
    }

    public OnrechtBestrijder(String s) {
        super("Captain Napalm", 42);
    }

    @Override
    public String specialeKracht() {
        return "OnrechtBestrijder --> specialeKracht";
    }

    @Override
    public int kwetsbaar(boolean x) {
        return 42;
    }

    @Override
    public int kwetsbaar(int y) {
        return 42;
    }
}
