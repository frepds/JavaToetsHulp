package ToetsHulp.NieuwePoging.Juni8.Opgave4;

// code voor opgave 3
//
// Aan klasse ToetsHulp.NieuwePoging.Juni8.Opgave4.Vliegtuig mag niks veranderd worden
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
