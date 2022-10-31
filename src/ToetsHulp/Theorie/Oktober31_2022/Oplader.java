package ToetsHulp.Theorie.Oktober31_2022;

// code voor opgave 2
//
public class Oplader {

	private Land land;
	private int waarde;
	private boolean isKiloWatt; //  true --> kiloWatt, false --> watt

	public Oplader(int w, boolean e, Land l) {
		waarde = w;
		isKiloWatt = e;
		land = l;
	}

	public int omrekenenNaarWatt() {
		if (isKiloWatt) { return 1000 * waarde; }
		else { return waarde; }
	}
}
