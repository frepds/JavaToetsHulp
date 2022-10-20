package ToetsHulp.NieuwePoging.Juni14_2022;

// code voor opgave 4
//
public class Getal {

	public int waarde;

	public Getal(int w) {
		waarde = w;
	}

	public String toString() {
		return "Getal: " + waarde;
	}

	// optellen met int
	public Getal plus(int x) {
		waarde = waarde + x;
		return new Getal(waarde);
	}

	// optellen met Getal
	public Getal plus(Getal getal) {
		getal.waarde = waarde + getal.waarde;
		return getal;
	}
}
