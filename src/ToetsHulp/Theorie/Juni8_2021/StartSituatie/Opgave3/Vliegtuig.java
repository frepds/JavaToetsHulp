package ToetsHulp.Theorie.Juni8_2021.StartSituatie.Opgave3;
// code voor opgave 3
//
// Aan klasse ToetsHulp.Theorie.Juni8.Antwoorden.Opgave3.ToetsHulp.Theorie.Juni8.StartSituatie.Opgave4.ToetsHulp.NieuwePoging.Juni8.Opgave4.ToetsHulp.NieuwePoging.Juni8_2021.Opgave4.Vliegtuig mag niks veranderd worden

public class Vliegtuig {
    private String naam;

    public Vliegtuig(String naam) {
        this.naam = naam;
    }

    public void setNaam(String update) {
        this.naam = update;
    }

    public String getNaam() {
        return naam;
    }

    public String toString() {
        return this.naam;
    }
}
