package ToetsHulp.NieuwePoging.April9_2021.Opgave4;

import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        Bankbiljet that = (Bankbiljet) o;

        boolean getal = this.getal == that.getal;
        boolean munteenheid = this.munteenheid.equals(that.munteenheid);
        return getal && munteenheid;
    }

}
