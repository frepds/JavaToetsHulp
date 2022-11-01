public class Water extends Drank
{
	//formaat is private zoals in klassendiagram stond
	private int formaat;

	//1 van de constructors
	public Water() { this.formaat = 2; }

	//1 van de constructors
	public Water(String formaat) {
		// logica kan op meerdere manieren
		//gebruik van equals is verplicht aangezien String een object is en niet een primitief type
		if (formaat != null) {
			
			if (formaat.equals("klein")) {
				this.formaat = 1;
			} else if (formaat.equals("normaal")) {
				this.formaat = 2;
			} else if (formaat.equals("groot")) {
				this.formaat = 3;
			} else {
				this.formaat = 1;
				System.out.println("Hebben wij niet!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			}
			
			/*
			if (formaat ==("klein")) {
				this.formaat = 1;
			} else if (formaat ==("normaal")) {
				this.formaat = 2;
			} else if (formaat == ("groot")) {
				this.formaat = 3;
			} else {
				this.formaat = 1;
				System.out.println("Hebben wij niet!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			}
			*/
		} else {
			this.formaat = 1;
				System.out.println("Hebben wij niet!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}

	public int getFormaatVoorGui() { return formaat; }

	// verplichte methode getPrijs
	public double getPrijs() { return 0; }

	//verplichte methode getOmschrijving
	public String getOmschrijving() {
		String txt = null;
		if(formaat == 1) { txt = "klein";}
		else if(formaat == 2) { txt = "normaal";}
		else if(formaat == 3) { txt = "groot";}
		return "een " + txt + " glas water";
	}


	//---------------- code voor testen ------------------------------
	public static void _DEMO_water() {
		Water w = new Water("groot");
		System.out.println(w);
		System.out.println(w.getOmschrijving());
		System.out.println(w.getPrijs());

		System.out.println(new Water());

		Water wXXL = new Water("XXL");
		System.out.println(wXXL);
	}
	
}

