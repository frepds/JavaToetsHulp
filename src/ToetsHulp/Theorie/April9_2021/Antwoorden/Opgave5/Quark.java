package ToetsHulp.Theorie.April9_2021.Antwoorden.Opgave5;

public class Quark extends Electron implements Kryptoniet{
    public Quark(double x) {
        super("Electron");
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
