package ToetsHulp.NieuwePoging.Juni8_2021.Opgave3;

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