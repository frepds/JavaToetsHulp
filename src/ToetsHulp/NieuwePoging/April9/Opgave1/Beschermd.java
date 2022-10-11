package ToetsHulp.NieuwePoging.April9.Opgave1;

//vraag 1
public class Beschermd {
    // moet altijd groter of gelijk aan 10 zijn.
    private int getal = 12345;

    static int aantalOk = 0;
    static int aantalMagNiet = 0;

    public Beschermd(int getal) {
        if (getal >= 10) {
            this.getal = getal;
            System.out.println("ok"); aantalOk++;
        } else {
            System.out.println("mag niet"); aantalMagNiet++;
        }
    }

    public void setGetal(int getal) {
        if (getal <= 10) {
            System.out.println("mag niet"); aantalMagNiet++;
        } else {
            System.out.println("ok"); aantalOk++;
            this.getal = getal;
        }
    }

    public static void printLogging() {
        System.out.println("# ok = " + aantalOk + ", # mag niet = " + aantalMagNiet);
    }

    public String toString() {
        return "Beschermd: getal = " + getal;
    }

}
