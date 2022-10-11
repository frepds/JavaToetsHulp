package ToetsHulp.NieuwePoging.Juni8.Opgave2;

// code voor opgave 2
//

public class Rechthoek {
    private int lengte;
    private int breedte;
    private int kleur;

    public Rechthoek(int lengte, int breedte, int kleur) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.kleur = kleur;
    }

    public boolean equals(Rechthoek obj) {
        if (!(obj instanceof Rechthoek)) {
            return false;
        }
        Rechthoek r = (Rechthoek) obj;

        return r.kleur == this.kleur &&
                r.lengte == this.lengte || r.lengte == this.breedte &&
                r.breedte == this.breedte || r.breedte == this.lengte;
    }
}
