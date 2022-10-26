package ToetsHulp.NieuwePoging.Juni8_2021.Opgave2;

public abstract class Figuur implements Rotatie{
    protected int kleur;

    public Figuur(int kleur) {
        this.kleur = kleur;
    }

    public void setKleur(int kleur) {
        this.kleur = kleur;
    }

    public abstract double oppervlakte();

}
