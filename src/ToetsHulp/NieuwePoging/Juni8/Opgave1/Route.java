package ToetsHulp.NieuwePoging.Juni8.Opgave1;

// code voor opgave 1
//
public class Route {
    public int afstand;
    public String start;

    public Route(int afstand) {
        this(afstand, "???");
    }

    public Route(int afstand, String start) {
        this.afstand = afstand;
        this.start = start;
    }

    public String toString() {
        return "Route van " + afstand + " km, start: " + start;
    }


    public int moeilijkheidsgraad(int tijd, int conditie) {
        // voor vraag (c)
        return conditie / (tijd * (afstand - 3));
    }
}
