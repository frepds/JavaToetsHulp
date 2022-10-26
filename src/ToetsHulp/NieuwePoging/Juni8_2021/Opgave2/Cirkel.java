package ToetsHulp.NieuwePoging.Juni8_2021.Opgave2;

public class Cirkel extends Figuur implements Rotatie{
    private double straal;

    public Cirkel(double straal, int kleur) {
        super(kleur);
        this.straal = straal;
    }

    @Override
    public double oppervlakte() {
        return Math.PI * straal * straal;
    }

    @Override
    public void roteer() {

    }

    public double getStraal() {
        return straal;
    }

    public String toString() {
        return "Cirkel: straal = " + straal + ", kleur = " + kleur;
    }

}
