package ToetsHulp.Theorie.Juni14_2022.Antwoorden.Antwoorden;

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

    // is niet nodig, wel handig. Je kunt ook de toString() gebruiken om de naam op te vragen en daarop equals te doen.
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Station that = (Station) o;
        return naam != null ? naam.equals(that.naam) : that.naam == null;
    }
}
