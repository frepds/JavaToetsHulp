package ToetsHulp.NieuwePoging.Juni14_2022.Opgave5;

public class Catwoman extends Held{
    public Catwoman(String s, int y) {
        super(s, y);
    }

    public int vermomming(int x) {
        return 42;
    }

    public int snelheid(int y, int z) {
        return 42;
    }

    @Override
    public String specialeKracht() {
        return "Catwoman --> specialeKracht";
    }

}
