package ToetsHulp.Theorie.April9_2021.Antwoorden.Opgave4;

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
    // dit is de foute equals, zoals in de toets stond.
    public boolean equals___FOUT___(Bankbiljet obj) {
        return
                this.getal == obj.getal
                        && this.munteenheid == obj.munteenheid;
    }

    // gelijk als getal en munteenheid gelijk zijn.
    public boolean equals(Object obj) {   // <------------------ de methode equals(Object) uit de klasse Object moest overschreven (overriding) worden.
        try {
            Bankbiljet that = (Bankbiljet) obj;  // <------------ omdat je een Object binnenkrijgt, heb je casting nodig.
            return this.getal == that.getal
                    && this.munteenheid.equals(that.munteenheid);    // we willen de *inhoud* van twee munteenheden vergelijken,
            // dus hebben we equals nodig (die er nog niet was in ToetsHulp.Theorie.April9.Antwoorden.Opgave4.ToetsHulp.Theorie.April9.StartSituatie.Opgave4.ToetsHulp.NieuwePoging.opgave4.ToetsHulp.NieuwePoging.April9_2021.Opgave4.Munteenheid!)
        } catch (ClassCastException e) { // <------ als de casting faalt en het dus het verkeerde type is, return false.  (Had ook met bv. instanceof gekund)
            return false;
        }
    }


    // vb. code uit de toets:
    public static void testEquals() {
        // twee keer dezelfde ToetsHulp.Theorie.April9.Antwoorden.Opgave4.ToetsHulp.Theorie.April9.StartSituatie.Opgave4.ToetsHulp.NieuwePoging.opgave4.ToetsHulp.NieuwePoging.April9_2021.Opgave4.Munteenheid
        Munteenheid euro = new Munteenheid("euro");
        Munteenheid euro2 = new Munteenheid("euro");

        // twee keer hetzelfde ToetsHulp.Theorie.April9.Antwoorden.Opgave4.ToetsHulp.Theorie.April9.StartSituatie.Opgave4.ToetsHulp.NieuwePoging.April9_2021.Opgave4.Bankbiljet
        Bankbiljet tientje = new Bankbiljet(10, euro);
        Bankbiljet tientje2 = new Bankbiljet(10, euro2);

        System.out.println(tientje.equals(tientje2));  // verwacht:

        // verschillende ToetsHulp.Theorie.April9.Antwoorden.Opgave4.ToetsHulp.Theorie.April9.StartSituatie.Opgave4.ToetsHulp.NieuwePoging.opgave4.ToetsHulp.NieuwePoging.April9_2021.Opgave4.Munteenheid, zelfde getal
        Munteenheid dollar = new Munteenheid("dollar");
        Bankbiljet tienDollar = new Bankbiljet(10, dollar);

        System.out.println(tientje.equals(tienDollar)); // verwacht:

        // vergelijken met iets dat geen ToetsHulp.Theorie.April9.Antwoorden.Opgave4.ToetsHulp.Theorie.April9.StartSituatie.Opgave4.ToetsHulp.NieuwePoging.April9_2021.Opgave4.Bankbiljet is
        System.out.println(tientje.equals("10 euro")); // verwacht:
    }
}
