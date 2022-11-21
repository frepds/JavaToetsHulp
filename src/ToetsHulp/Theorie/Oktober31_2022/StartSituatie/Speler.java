package ToetsHulp.Theorie.Oktober31_2022.StartSituatie;

// code voor opgave 3
//
public class Speler {

    public String naam;
    public int punten = 0;
    public boolean inTeam1 = true;

    public Speler(String n) {
        naam = n;
    }

    public String toString() {
        return "Speler " + naam + ": " + punten + " punten";
    }
}
