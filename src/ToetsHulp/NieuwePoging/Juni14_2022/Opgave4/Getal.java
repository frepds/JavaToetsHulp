package ToetsHulp.NieuwePoging.Juni14_2022.Opgave4;

// code voor opgave 4
//
public class Getal {
    public int waarde;

    public Getal(int w) {
        waarde = w;
    }

    public String toString() {
        return "Getal: " + waarde;
    }

    // optellen met int
    public Getal plus(int x) {
        int waarde = this.waarde + x;
        return new Getal(waarde);
    }

    // optellen met Getal
    public Getal plus(Getal getal) {
        return new Getal(waarde + getal.waarde);
    }
}
