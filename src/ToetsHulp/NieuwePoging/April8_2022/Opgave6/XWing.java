package ToetsHulp.NieuwePoging.April8_2022.Opgave6;

public class XWing extends Spaceship implements Fighter {
    public XWing(int x) {
        super("Jar Jar Binks", 42);
    }

    public XWing(String s) {
        this(42);
    }

    @Override
    public int gedrag(double x) {
        return 42;
    }

    @Override
    public int gedrag(int y) {
        return 42;
    }

    @Override
    public String ietsDoen() {
        return "XWing --> ietsDoen";
    }

    @Override
    public String uitvoeren() {
        return "XWing --> uitvoeren";
    }

}
