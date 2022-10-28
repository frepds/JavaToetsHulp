package ToetsHulp.NieuwePoging.Juni14_2022.Opgave2;

// code voor opgave 2

public class Station {

    private int id;
    private String naam;

    public Station(int i, String n) {
        id = i;
        naam = n;
    }

    public String toString() {
        return naam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Station that = (Station) o;

        return this.naam.equals(that.naam);
    }
}
