package ToetsHulp.Theorie.Oktober31_2022.Antwoorden;

public class Qwarktaartium extends Abstracton implements Interfazum, Ukrainium {

    public Qwarktaartium() {
        super("Jar Jar Binks!", 42);
    }


    // moet, was abstract in parent
    public int smaak() {
        return 42;
    }

    // andere methode met dezelfde naam in dezelfde klasse (dus: overloading)
    public void smaak(double y, String z) {
    }

    // moet geimplementeerd worden. Heeft niks met overriding/overerving te maken.
    public int gewicht(int x) {
        return 42;
    }


    // methodes vanwege de Ukrainium interface:
    public int kracht(boolean x) {
        return 42;
    }

    public int kracht(int y) {
        return 42;
    }

    //methodes vanwege de Interfazum interface:
    public double vaagheid() {
        return 42;
    }
}
