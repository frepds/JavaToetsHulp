package ToetsHulp.NieuwePoging.Juni14_2022.Opgave5;

public class OnrechtBestrijder extends Held implements HeeftAartsvijand {
    public OnrechtBestrijder(String s, int y, int x) {
        super(s, y);
    }

    public OnrechtBestrijder(String s, int y) {
        super(s, y);
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
