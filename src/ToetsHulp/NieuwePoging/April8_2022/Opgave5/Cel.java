package ToetsHulp.NieuwePoging.April8_2022.Opgave5;
import ToetsHulp.NieuwePoging.April8_2022.Opgave4.Gevangene;

// code voor opgave 5

public class Cel {
    private Gevangene gevangene;

    public String toString() {
        return "Cel: # " + gevangene + " #";
    }

    public void setGevangene(String naam, int straf) {
        gevangene = new Gevangene(naam);
        gevangene.geefStraf(1234567, straf);
    }

    public Gevangene getGevangene() {
        return gevangene;
    }

    public void jaarwisseling() {
        try {
            gevangene.verminder(1234567);
        } catch (NullPointerException e) {
            System.out.println("Cel is leeg!");
        }
    }

    public void laatVrij() {
        try {
            if (gevangene.isVrij()) {
                gevangene = null;
            }
        } catch (NullPointerException e) {
            System.out.println("Cel is leeg!");
        }
    }

    public void omwisselen(Cel andere) {
        Gevangene tijdelijk = andere.gevangene;
        andere.gevangene = gevangene;
        gevangene = tijdelijk;
    }
}
