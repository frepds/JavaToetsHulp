package ToetsHulp.NieuwePoging.Juni8_2021.Opgave2;

// code voor opgave 2

public class Rechthoek extends Figuur implements HeeftZijkanten{
    private int lengte;
    private int breedte;
    private int kleur;

    public Rechthoek(int lengte, int breedte, int kleur) {
        super(kleur);
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

    @Override
    public double oppervlakte() {
        return lengte * breedte;
    }

    @Override
    public int getAantalZijkanten() {
        return 4;
    }

    @Override
    public void roteer() {
        int kopieLengte = lengte;

        lengte = breedte;
        breedte = kopieLengte;

    }

    public String toString() {
        return getClass().getSimpleName() + ": " + lengte + " x " + breedte + " en kleur " + kleur;
    }

}
