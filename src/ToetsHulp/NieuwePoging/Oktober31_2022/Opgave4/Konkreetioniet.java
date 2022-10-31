package ToetsHulp.NieuwePoging.Oktober31_2022.Opgave4;

public class Konkreetioniet extends Abstracton {
    public Konkreetioniet(int x) {
        super("Java", 42);
    }

    public Konkreetioniet(String s) {
        this(42);
    }

    public String gewicht() {
        return "Konkreetioniet --> gewicht";
    }

    public int vaagheid(int v) {
        return 42;
    }

    @Override
    public int smaak() {
        return 42;
    }
}
