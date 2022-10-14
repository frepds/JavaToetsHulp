package ToetsHulp.Theorie.April8_2022.StartSituatie;

// code voor opgave 2
//
public class ZomaarEenKlasse {

	public boolean debug;
	private int waarde;

	public ZomaarEenKlasse(int w) {
		waarde = w;
		if(debug) {
			System.out.println("ZomaarEenKlasse(" + waarde + ")");
		}
	}

	public void berekening(int x) {
		waarde = waarde + x;
		if(debug) {
			System.out.println("waarde --> " + waarde);
		}
	}
}
