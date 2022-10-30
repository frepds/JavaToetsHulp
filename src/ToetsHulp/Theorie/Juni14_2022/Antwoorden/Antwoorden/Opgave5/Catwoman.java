package ToetsHulp.Theorie.Juni14_2022.Antwoorden.Antwoorden.Opgave5;

public class Catwoman extends Held {
    public Catwoman() {
        super("Captain Napalm", 42);
    }

    // methode heeftXRayVision uit abstracte klasse Held
    // moet *niet* overschreven worden. Geeft een int terug.

    // moet geimplementeerd worden (overriding), vanwege de inhoud van wat gereturnd moet worden.
    public String specialeKracht() {
        return "Catwoman --> specialeKracht";
    }

    // moet geimplementeerd worden (overriding), vanwege de inhoud van wat gereturnd moet worden.
    public String vermomming() {
        return "Catwoman --> vermomming";
    }

    // moet geimplementeerd worden (overriding), vanwege de inhoud van wat gereturnd moet worden.
    public int vermomming(int x) {
        return 42;
    }

    // GEEN geval van overloading, aangezien er GEEN methode met dezelfde naam in deze klasse aanwezig is.
    // (maar toevallig wel eentje in de interface KanVliegen die niks met deze klasse te maken heeft)
    public int snelheid(int y, int z) {
        return 42;
    }
}
