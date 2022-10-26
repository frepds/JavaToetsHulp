package ToetsHulp.NieuwePoging.Juni8_2021.Opgave2;

// code voor opgave 2

public class Rechthoek {
    private int lengte;
    private int breedte;
    private int kleur;

    public Rechthoek(int lengte, int breedte, int kleur) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.kleur = kleur;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Rechthoek)) {
            return false;
        }

        Rechthoek that = (Rechthoek) obj;
        boolean kleur = this.kleur == that.kleur;
        boolean lengte = this.lengte == that.lengte || this.lengte == that.breedte;
        boolean breedte = this.breedte == that.breedte || this.breedte == that.lengte;

        return kleur && lengte && breedte;
    }
}
