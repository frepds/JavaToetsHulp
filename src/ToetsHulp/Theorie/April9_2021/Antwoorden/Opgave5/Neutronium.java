package ToetsHulp.Theorie.April9_2021.Antwoorden.Opgave5;

import ToetsHulp.NieuwePoging.April9_2021.Opgave5.Quark;
import ToetsHulp.NieuwePoging.April9_2021.Opgave5.Tachyon;

public class Neutronium extends Quark implements Flexmason, Tachyon {
    public Neutronium(String s) {
        this(42);
    }

    public Neutronium(double d) {
        super(42);
    }

    public String straling() {
        return "Neutronmium --> straling";
    }

    public String straling(double x) {
        return "Neutronium --> straling";
    }

}
