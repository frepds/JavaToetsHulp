package ToetsHulp.Theorie.April9.StartSituatie.Opgave4;

import ToetsHulp.Theorie.April9.Antwoorden.Opgave4.Munteenheid;

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
    public boolean equals(ToetsHulp.Theorie.April9.Antwoorden.Opgave4.Bankbiljet obj) {
        //Uitgecomment:

//		return
//				this.getal == obj.getal
//				&& this.munteenheid == obj.munteenheid;

        //Voorbeeld:

        return false;
    }
}
