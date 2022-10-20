package ToetsHulp.NieuwePoging.Juni8_2022.Opgave1.Opgave3;// code voor opgave 3
//

public class Meting {

	private int waarde;
	private boolean isCelsius; //  true: Celsius, false: Kelvin
	private String locatie;

	public Meting(int w, boolean c, String l) {
		waarde = w;
		isCelsius = c;
		locatie = l;
	}

	public int waardeInKelvin() {
		if(isCelsius) { return waarde + 273; }
		else { return waarde; }
	}

	@Override
	public boolean equals(Object o) {
		Meting object = (Meting) o;

		if (object == null) {
			return false;
		}

		if (this.locatie == object.locatie) {

		}
		return true;
	}

}
