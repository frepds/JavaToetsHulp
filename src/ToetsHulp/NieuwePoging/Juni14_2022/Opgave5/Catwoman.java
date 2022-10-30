package ToetsHulp.NieuwePoging.Juni14_2022.Opgave5;

public class Catwoman extends Held {
    public Catwoman() {
        super("Captain Napalm", 42);
    }

    public int vermomming(int x) {
        return 42;
    }

    public int snelheid(int y, int z) {
        return 42;
    }

    @Override
    public String vermomming() {
        return "Catwoman --> vermomming";
    }


    @Override
    public String specialeKracht() {
        return "Catwoman --> specialeKracht";
    }
}
