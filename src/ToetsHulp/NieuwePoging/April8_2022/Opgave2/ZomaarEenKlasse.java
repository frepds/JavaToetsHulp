package ToetsHulp.NieuwePoging.April8_2022.Opgave2;

// code voor opgave 2
public class ZomaarEenKlasse {

    public static boolean debug = true;
    private int waarde;
    private static int teller = 0;

    public ZomaarEenKlasse(int w) {
        waarde = w;
        if (debug) {
            System.out.println("ZomaarEenKlasse(" + waarde + ")"); teller++;
        }
    }

    public void berekening(int x) {
        waarde = waarde + x;
        if (debug) {
            System.out.println("waarde --> " + waarde); teller++;
        }
    }

    public static void printDebugging() {
        System.out.println("debug: " + debug);
        System.out.println(teller + " keer geprint");
    }

}
