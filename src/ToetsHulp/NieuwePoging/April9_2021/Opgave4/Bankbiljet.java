package ToetsHulp.NieuwePoging.April9_2021.Opgave4;

//vraag 4
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
    public boolean equals(Object obj) {
        try {
            Bankbiljet that = (Bankbiljet) obj;
//
//            boolean sameGetal = this.getal == that.getal;
//            boolean sameCurrency = this.munteenheid.equals(that.munteenheid);
//
//            return sameGetal && sameCurrency;
//
            return this.getal == that.getal &&
                    this.munteenheid.equals(that.munteenheid);


        } catch (ClassCastException e) {
            return false;
        }
    }
}
