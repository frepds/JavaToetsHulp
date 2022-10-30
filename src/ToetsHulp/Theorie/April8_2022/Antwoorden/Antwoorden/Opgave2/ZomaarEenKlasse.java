package ToetsHulp.Theorie.April8_2022.Antwoorden.Antwoorden.Opgave2;

public class ZomaarEenKlasse
{
	public static boolean debug = true; // moest 'aan' beginnen
	public static int teller = 0;
	private int waarde;

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

	public static void printDebugging() {
		System.out.println("debug: " + debug);
		System.out.println(teller + " keer geprint");
	}

	//vb uit de toets
	public static void demo() {
		// debuggen staat aan. Vanaf nu wordt er geprint en geteld:
		ZomaarEenKlasse.printDebugging();

		ZomaarEenKlasse s = new ZomaarEenKlasse(40);
		s.berekening(2);
		ZomaarEenKlasse s2 = new ZomaarEenKlasse(2);

		ZomaarEenKlasse.printDebugging();

		// debuggen uitzetten: er wordt vanaf hier niks geprint of geteld.
		ZomaarEenKlasse.debug = false;

		// een heleboel constructors en methodes (allemaal niet geprint of geteld)
		s.berekening(1);
		s.berekening(1111);
		s2 = new ZomaarEenKlasse(777);
		s2.berekening(22);
		ZomaarEenKlasse s3 = new ZomaarEenKlasse(987);
		// etc... etc ...

		// teller is onveranderd:
		ZomaarEenKlasse.printDebugging();

		// debuggen weer aanzetten. Er wordt weer geprint/geteld:
		ZomaarEenKlasse.debug = true;

		ZomaarEenKlasse s4 = new ZomaarEenKlasse(1);
		s.berekening(-1);

		ZomaarEenKlasse.printDebugging();
	}

}
