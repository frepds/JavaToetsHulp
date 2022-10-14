package ToetsHulp.Theorie.Juni8_2021.Antwoorden.Opgave1;

public class Route {
    // moet altijd groter dan 3 zijn.
    private int afstand = -1;
    private String start = "???"; // default waarde

    private static int grens = 3; // een static int gebruiken is netjes, maar was niet nodig. Hardcoded grens in de constructor kan ook.

    private static int kortste = 1000;
    private static int langste = 0;

    public Route(int lengte) {
        this(lengte, "???"); // met this(...) verwijs je van de ene naar de andere constructor.
        // hier hadden we ook de init(...) aan kunnen roepen. This(...) en een functie aanroepen zijn allebei goede oplossingen
    }

    public Route(int lengte, String start) {
        init(lengte, start); // maar je kunt ook een methode aanroepen vanuit een constructor (en op die manier voldoen aan de eis van maar 1 regel javacode).
        //maar hier had natuurlijk ook gewoon de code kunnen staan die nu in de init(...) staat.
    }

    // een functie om het zware werk te doen wat anders in de constructor had gestaan.
    private void init(int lengte, String start) {
        this.start = start;

        if (lengte < 3) {
            System.out.println("te kort");
        } else {
            this.afstand = lengte;
            if (lengte < kortste) {
                kortste = lengte;
            }
            if (lengte > langste) {
                langste = lengte;
            }
        }
    }


    public String toString() {
        if (this.afstand < grens) {
            return "ToetsHulp.Theorie.Juni8.Antwoorden.Opgave1.ToetsHulp.NieuwePoging.Juni8.Opgave1.Route: te kort";
        }
        return "ToetsHulp.Theorie.Juni8.Antwoorden.Opgave1.ToetsHulp.NieuwePoging.Juni8.Opgave1.Route van " + this.afstand + " km, start: " + this.start;
    }

    public void setStart(String plaats) {
        if (start.equals("???")) {  // strings altijd met equals vergelijken!
            // nog niet bekend
            start = plaats;
        } else {
            // heeft al een waarde, dan niet updaten
            System.out.println("mag niet");
        }
    }

    public static void printMinMax() {
        System.out.println("kortste afstand is " + kortste + " km");
        System.out.println("langste afstand is " + langste + " km");
    }


    public static void demo_constr_en_tostring() {
        Route w1 = new Route(11);
        System.out.println(w1);

        Route w2 = new Route(7, "Zwolle");
        System.out.println(w2);
    }


    public static void demo_constr_en_setter() {
        Route w = new Route(12);
        System.out.println(w);

        w.setStart("Assen");
        System.out.println(w);

        w.setStart("Wapenveld");
        System.out.println(w);

        Route w2 = new Route(8, "Zwolle");
        System.out.println(w2);
        w2.setStart("Eindhoven");

        Route w3 = new Route(1);
    }


    public static void main(String[] args) {
        demo_static();
    }


    public static void demo_static() {
        Route w1 = new Route(9);
        Route w2 = new Route(5);
        Route w3 = new Route(7);
        Route.printMinMax();
        Route w4 = new Route(12);
        Route w5 = new Route(4);
        Route.printMinMax();
    }


    public int moeilijkheidsgraad(int tijd, int conditie) {
        try {
            return tijd / (conditie * (afstand - 3));
        } catch (ArithmeticException e) {
            System.out.println("onmogelijk!");
            return -1;
        }
    }

}
