package ToetsHulp.Theorie.Juni8_2021.Antwoorden.Opgave2;

public class Cirkel extends Figuur implements Rotatie {

    private double straal;

    public Cirkel(double straal, int kleur) {
        super(kleur);
        this.straal = straal;
    }

    public double oppervlakte() {
        return Math.PI * straal * straal;
    }

    // niet nodig als een default body in de interface hebt
    public void roteer() {
    } //doe niks!


    public String toString() {
        return "Cirkel: straal = " + straal + ", kleur = " + kleur;
    }
}
