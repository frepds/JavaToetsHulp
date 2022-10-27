package ToetsHulp.NieuwePoging.April8_2022.Opgave6;

public class TieFighter extends XWing implements StealthFighter {
    public TieFighter() {
        super(42);
    }

    public TieFighter(String s) {
        this();
    }

    @Override
    public int handeling() {
        return 42;
    }
}
