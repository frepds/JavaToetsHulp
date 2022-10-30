package ToetsHulp.Theorie.April8_2022.Antwoorden.Antwoorden.Opgave3;

public class Meting
{
	private int waarde;
	private boolean isCelsius; // true: Celsius, false: Kelvin
	private String locatie;


	public Meting(int w, boolean c, String l) {
		waarde = w;
		isCelsius = c;
		locatie = l;
	}

    // altijd handig om te hebben:
	public String toString() {
		String txt = "Celsius";
		if(!isCelsius) { txt = "Kelvin"; }
		return waarde + " graden " + txt + " in " + locatie;
	}

    // Kelvin = Celsius + 273
	public int waardeInKelvin() {
		if(isCelsius) { return waarde + 273; }
		else { return waarde; }
	}


	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Meting that = (Meting) o;
		int waardeThis = this.waardeInKelvin();
		int waardeThat = that.waardeInKelvin();
		if (waardeThis != waardeThat) {
			return false;
		}
		//return (this.locatie == that.locatie); //mnc07: zoiets werkt uiteraard NIET bij Strings. Altijd equals!
		if(this.locatie == null && that.locatie != null) { return false; }
		return this.locatie.equals(that.locatie);
		//return Objects.equals(this.locatie, that.locatie); deze wordt automatisch door intelliJ gegenereerd, en dat werkt ook.
	}
	
	

	//vb uit de toets:
	public static void demo_equals_simpel() {
		// 10 graden Celsius in Zwolle (= 10 + 273 = 283 Kelvin)
		// Hiermee worden alle andere Meting-objecten vergeleken
		Meting c10 = new Meting(10, true, "Zwolle");
		System.out.println( c10.waardeInKelvin() );

		// locatie en temperatuur gelijk:
		Meting c10_nogEenKeer = new Meting(10, true, "Zwolle");
		System.out.println( c10.equals(c10_nogEenKeer) );

		// locatie en temperatuur gelijk (want 10 Celsius is 283 Kelvin)
		Meting k283 = new Meting(283, false, "Zwolle");
		System.out.println( c10.equals(k283) );

		// locatie ongelijk:
		Meting c10_elders = new Meting(10, true, "Rotterdam");
		System.out.println( c10.equals(c10_elders) );

		// temperatuur ongelijk, want 10 graden Celsius is 283 Kelvin
		Meting k10 = new Meting(10, false, "Zwolle");
		System.out.println( c10.equals(k10) );

		// ongelijke temperatuur
		Meting c273 = new Meting(273, true, "Zwolle");
		System.out.println( c10.equals(c273) );

		// geen Meting als input
		System.out.println( c10.equals("10 graden Celsius") );
	}
}
