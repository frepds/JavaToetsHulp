package ToetsHulp.Theorie.Oktober31_2022.Antwoorden;// equals vraag

public class Oplader {
    private Land land;
    private int waarde;
    private boolean isKiloWatt; // true --> kiloWatt, false --> watt

    public Oplader(int w, boolean e, Land l) {
        waarde = w;
        isKiloWatt = e;
        land = l;
    }

    // altijd handig om te hebben (maar niet verplicht in deze vraag)
    public String toString() {
        String txt = "kiloWatt";
        if (!isKiloWatt) {
            txt = "watt";
        }
        return "" + waarde + txt + " (" + land + ")";
    }

    public int omrekenenNaarWatt() {
        if (isKiloWatt) {
            return 1000 * waarde;
        } else {
            return waarde;
        }
    }

    public boolean equals(Object o) {
        if (this == o) return true;   // krijg je automatisch via genereer.... functionaliteit in IntelliJ
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Oplader that = (Oplader) o; //casting. Naar object o kijken, met een "Oplader-bril" op (met de variabele-naam "that").

        // eerst van beide opladers de waarde in Watt opvragen (anders wordt het appels met peren vergelijken)
        int waardeThis = this.omrekenenNaarWatt();
        int waardeThat = that.omrekenenNaarWatt();

        // hier de logica zoals in de vraag beschreven: verschil moet kleiner of gelijk aan 10 zijn.
        int verschil = Math.abs(waardeThat - waardeThis);
        if (verschil > 10) { // dit kan al niet meer gelijk zijn.
            return false;
        }
        // land checken met de equals van Land.
        return this.land.equals(that.land);
    }


    // vb code uit de toets
    public static void demo_equals() {
        Land nl = new Land("NL", 31);
        Land nl_zelfde = new Land("Nederland", 31);
        Land usa = new Land("U.S.A.", 1);
        System.out.println(nl.equals(nl_zelfde));
        System.out.println(nl.equals(usa));

        // alle andere worden met deze vergeleken: 5 kilowatt, Nederlands (code 31)
        Oplader _5kwNL = new Oplader(5, true, nl);

        // ander object, zelfde gegevens:
        System.out.println(_5kwNL.equals(new Oplader(5, true, nl)));

        // zelfde vermogen (5000 watt en 4992 watt) en zelfde land
        Oplader _5kw_ook_nl = new Oplader(4992, false, nl_zelfde);
        System.out.println(_5kwNL.equals(_5kw_ook_nl));

        // 5 kiloWatt is niet gelijk aan 4111 watt (te groot verschil):
        Oplader _4111watt_nl = new Oplader(4111, false, nl);
        System.out.println(_5kwNL.equals(_4111watt_nl));

        // 5 kiloWatt is niet gelijk aan 5 watt:
        Oplader _5watt_nl = new Oplader(5, false, nl);
        System.out.println(_5kwNL.equals(_5watt_nl));

        // ander land
        System.out.println(_5kwNL.equals(new Oplader(5, true, usa)));
    }
}
