package ToetsHulp.Theorie.April8_2022.StartSituatie;// code voor opgave 3
//
import java.util.Objects;

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
}
