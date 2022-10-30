package ToetsHulp.NieuwePoging.April8_2022.Opgave6;

public class TieFighter extends XWing implements StealthFighter {
    public TieFighter() {
        super("Jar Jar Binks");
    }

    public TieFighter(String s) {
        this();
    }

    @Override
    public int handeling() {
        return 42;
    }

    @Override
    public String uitvoeren() {
        return "TieFighter --> uitvoeren";
    }

    @Override
    public String ietsDoen() {
        return "TieFighter --> ietsDoen";
    }
}
