package ToetsHulp.NieuwePoging.April9_2021.Opgave5;

public class Quark extends Electron implements Kryptoniet{
    public Quark(double x) {
        super("Quark");
    }

    @Override
    public String massa() {
        return "Quark --> massa";
    }

    @Override
    public double rotatie(double x) {
        return 42;
    }
}
