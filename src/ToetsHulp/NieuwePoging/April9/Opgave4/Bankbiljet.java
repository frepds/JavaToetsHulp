package ToetsHulp.NieuwePoging.April9.Opgave4;

public class Bankbiljet {
    private int getal;
    private Munteenheid munteenheid;

    public Bankbiljet() {

    }

    public Bankbiljet(int getal, Munteenheid munteenheid) {
        this.getal = getal;
        this.munteenheid = munteenheid;
    }

    // gelijk als getal en munteenheid gelijk zijn.
    public boolean equals(Bankbiljet obj) {
        Bankbiljet b = (Bankbiljet) obj;
        if (b.getal == this.getal && b.munteenheid == this.munteenheid) {
            return true;
        }
        return false;
    }
}
