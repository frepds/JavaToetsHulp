package ToetsHulp.NieuwePoging.April9_2021.Opgave1;

//vraag 1

public class Beschermd {
    // moet altijd groter of gelijk aan 10 zijn.
    private int getal = 12345;
	private static int aantalOk = 0, aantalNietOk = 0;

	public Beschermd(int getal) {
		if (getal >= 10) {
			this.getal = getal;
			System.out.println("ok"); aantalOk++;
		} else {
			System.out.println("mag niet"); aantalNietOk++;
		}
	}

	public void setGetal(int getal) {
		if (getal >= 10) {
			this.getal = getal;
			System.out.println("ok"); aantalOk++;
		} else {
			System.out.println("mag niet"); aantalNietOk++;
		}
	}

	public static void printLogging() {
		System.out.println("# ok = " + aantalOk + ", # mag niet = " + aantalNietOk);
	}

	public String toString() {
		return "Beschermd: getal = " + getal;
	}


}
