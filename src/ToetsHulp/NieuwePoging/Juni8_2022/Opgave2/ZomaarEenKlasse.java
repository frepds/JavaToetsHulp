package ToetsHulp.NieuwePoging.Juni8_2022.Opgave2;

// code voor opgave 2

public class ZomaarEenKlasse {
	public boolean debug = true;
	private int waarde;
	private int teller;

	public ZomaarEenKlasse(int w) {
		waarde = w;
		if(debug) {
			System.out.println("ZomaarEenKlasse(" + waarde + ")");
			teller++;
		}
	}

	public void berekening(int x) {
		waarde = waarde + x;
		if(debug) {
			System.out.println("waarde --> " + waarde);
			teller++;
		}
	}

	public void printDebugging() {
		System.out.println("debug: " + debug);
		System.out.println(teller + " keer geprint");
	}
}
