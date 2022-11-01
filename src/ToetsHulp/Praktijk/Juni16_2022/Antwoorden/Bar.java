import java.util.ArrayList;

public class Bar
{
	private ArrayList<Drank> drankenOpTafel = new ArrayList<>(); //hier initialiseren, of in de constructor.
	private int aantalOpgehaaldeGlazen = 0;
	private double totaleInkomsten = 0;

	public Bar() { //constructor was niet verplicht. Maar als je 'm hebt, dan moet het er eentje zijn zonder inputs.
		drankenOpTafel = new ArrayList<>(); //hier initialiseren, of bij declaratie van de ArrayList 
	}

	public void toevoegen(Drank d) {
		boolean maakLeeg = (drankenOpTafel.size() >= 5);
		// de ene methode kan de ander aanroepen (is niet verplicht, kan ook in deze methode de leegmaak-logica plaatsen)
		toevoegen(d, maakLeeg);
	}

	public void toevoegen(Drank d, boolean maakLeeg) {
		totaleInkomsten += d.getPrijs();
		if(maakLeeg)
		{
			aantalOpgehaaldeGlazen += drankenOpTafel.size();
			drankenOpTafel.clear();// de clear methode was een tip uit de toets
		}
		drankenOpTafel.add(d);
	}



	public void print() {
		System.out.println("aantalOpgehaaldeGlazen = " + this.aantalOpgehaaldeGlazen);
		System.out.println("totaleInkomsten = " + this.totaleInkomsten);
		int teller = 1;
		for(Drank d: drankenOpTafel) //mag ook met for(int ...) loop uiteraard.
		{
			System.out.println(" " + teller + "e: " + d);
			teller++;
		}
	}


	public int zoekDrank(String txt) {
		for(int i = 0; i < drankenOpTafel.size(); i++) {
			Drank d = drankenOpTafel.get(i);
			if(d.getOmschrijving().equals(txt))
			{
				return i + 1;
			}
		}
		return 0; // niks gevonden
	}


    //---------------- tbv de gui ------------------------------
	public ArrayList<Drank> get_DRANKEN_LIJST() { return drankenOpTafel; }



	//---------------- code voor testen ------------------------------
	public static void _DEMO_print() {
		Bar bar = new Bar();
		bar.print();

		bar.toevoegen(new Water("groot"));
		bar.toevoegen(new Water());
		bar.print();
	}



	public static void _DEMO_toevoegenEnLeegmaken1() {
		Bar bar = new Bar();
		// de waarde van totaleInkomsten verandert door toevoegen(...)
		bar.toevoegen(new WarmeDrank(false, true, false));
		bar.toevoegen(new WarmeDrank(true, true, true));

		// niet leegmaken (... , false)
		bar.toevoegen(new Water(), false);
		bar.print();

		// leegmaken via de toevoegen(... , boolean) methode:
		// er wordt true meegegeven, dus drankenOpTafel wordt eerst leeggemaakt.
		// De waarde van aantalOpgehaaldeGlazen verandert door het leegmaken.
		bar.toevoegen(new Water(), true);
		bar.print();
	}



	public static void _DEMO_toevoegenEnLeegmaken2() {
		Bar bar = new Bar();
		bar.toevoegen(new Water("groot"));
		bar.toevoegen(new Water("groot"));
		bar.toevoegen(new Water("normaal"));
		bar.toevoegen(new Water("normaal"));
		bar.toevoegen(new Water("klein"));

		bar.print();

		// Automatisch leegmaken omdat tafel te vol is: Dit is namelijk het 6e drankje.
		// Dus de tafel wordt leegemaakt (en aantalOpgehaaldeGlazen aangepast).
		// Daarna wordt de input toegevoegd.
		bar.toevoegen(new WarmeDrank(true, true, true));

		bar.print();
	}


/*
	public static void _DEMO_zoekDrank() {
		Bar bar = new Bar();
		bar.toevoegen(new Water("groot"));
		bar.print();

		// niet aanwezig:
		int plek = bar.zoekDrank("thee met melk en suiker");
		System.out.println(plek);

		// ook niet aanwezig:
		plek = bar.zoekDrank("water");
		System.out.println(plek);

		// wel aanwezig, op de eerste plek:
		plek = bar.zoekDrank("een groot glas water");
		System.out.println(plek);

		bar.toevoegen(new WarmeDrank(true, true, true));
		bar.print();

		// niet aanwezig:
		plek = bar.zoekDrank("thee");
		System.out.println(plek);

		// wel aanwezig op de tweede plek:
		plek = bar.zoekDrank("thee met melk en suiker");
		System.out.println(plek);
	}

*/

}
