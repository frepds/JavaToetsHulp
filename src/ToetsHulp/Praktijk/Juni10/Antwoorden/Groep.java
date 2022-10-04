package ToetsHulp.Praktijk.Juni10.Antwoorden;

public class Groep implements HeeftContactgegevens {
    private Data data;
    private int aantal;

    public Groep(String naam, String adres, int aantal) {
        data = new Data(naam, adres);
        this.aantal = aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }

    public String getNaam() {
        return this.data.getNaam();
    }

    public int getAantal() {
        return this.aantal;
    }

    public String getContactgegevens() {
        return data.toString();
    }

    public String toString() {
        return this.data + ": " + aantal;
    }


    //vb uit de toets:
    public static void demo_tostring() {
        Groep g = new Groep("Jan", "Javaweg 1", 5);
        System.out.println(g);
        System.out.println(g.getContactgegevens());
    }
}
