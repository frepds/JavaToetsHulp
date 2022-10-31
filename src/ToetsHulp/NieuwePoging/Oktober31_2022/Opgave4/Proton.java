package ToetsHulp.NieuwePoging.Oktober31_2022.Opgave4;

public class Proton extends Konkreetioniet implements Ukranium {
    public Proton() {
        super(42);
    }

    public Proton(String s) {
        this();
    }

    @Override
    public int kracht(boolean x) {
        return 42;
    }

    @Override
    public int kracht(int y) {
        return 42;
    }

    @Override
    public String gewicht() {
        return "Proton --> gewicht";
    }

    @Override
    public int vaagheid(int v) {
        return 42;
    }

    @Override
    public int smaak() {
        return 42;
    }


    public String alleOverloading() {
        return "kracht + smaak";
    }

}
