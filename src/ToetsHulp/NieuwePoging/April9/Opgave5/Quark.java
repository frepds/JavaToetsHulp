package ToetsHulp.NieuwePoging.April9.Opgave5;

public class Quark extends Electron implements Kryptoniet{
    public Quark(String s, double x) {
        super(s);
    }

    @Override
    public String massa() {
        return null;
    }

    @Override
    public double rotatie(double x) {
        return 0;
    }
}
