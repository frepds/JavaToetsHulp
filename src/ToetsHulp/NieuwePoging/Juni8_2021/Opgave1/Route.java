package ToetsHulp.NieuwePoging.Juni8_2021.Opgave1;

// code voor opgave 1

public class Route {
    private int afstand;
    private String start;
    private int min = 0,  max = 0;

    public Route(int afstand) {
        this(afstand, "???");
    }

    public Route(int afstand, String start) {
        if (afstand < 3) {
            this.afstand = -1;
            System.out.println("te kort");
        } else {
            this.afstand = afstand;
        }
        if (this.afstand >= max) {
            max = this.afstand;
        }
        this.start = start;
    }

    public void setStart(String start) {
        if (this.start.equals("???")) {
            this.start = start;
        } else {
            System.out.println("mag niet");
        }
    }


    public int moeilijkheidsgraad(int tijd, int conditie) {
        try {
            return conditie / (tijd * (afstand - 3));
        } catch (ArithmeticException e) {
            return -1;
        }
    }

    public static void printMinMax() {

    }


    public String toString() {
        return "Route van " + afstand + " km, start: " + start;
    }

}
