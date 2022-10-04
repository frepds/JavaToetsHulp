package ToetsHulp.Theorie.April9.Antwoorden.Opgave5;

class Quark extends Electron implements Kryptoniet {

    public Quark(double x) {
        super("Quark");
    }

    public String massa() {
        return "Quark::massa";
    }

    public double rotatie(double x) {
        return 42;
    }
}
