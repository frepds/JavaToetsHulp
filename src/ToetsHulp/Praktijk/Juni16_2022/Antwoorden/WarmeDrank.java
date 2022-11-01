public class WarmeDrank extends Drank
{
	//variabelen zijn private zoals in klassendiagram te zien was
	private boolean isThee;
	private boolean melk;
	private boolean suiker;

	// de constructor met 3 boolean parameters
	public WarmeDrank(boolean isThee, boolean melk, boolean suiker) {
		this.isThee = isThee;
		this.melk = melk;
		this.suiker = suiker;
	}
	// de verplichte methode getPrijs
	public double getPrijs() {
		double prijs = 0;
		if (isThee) {
			prijs = 1;
		} else {
			prijs = 2;
		}

		if (suiker) {
			prijs += 0.25;
		}
		if (melk) {
			prijs += 0.5;
		}
		return prijs;
	}

	//de verplichte methode getOmschrijving
	public String getOmschrijving() {
		// logica kan op allerlei manieren
		String txt = "";
		if(isThee) {
			txt += "thee";
		}
		else {
			txt += "koffie";
		}
		if (suiker && melk) {
			txt += " met melk en suiker";
		}
		else {
			if (suiker) {
				txt += " met suiker";
			}
			else if(melk) {
				txt += " met melk";
			}
		}
		return txt;
	}

	public boolean getIsThee_voorGUI() { return isThee; }

	public boolean heeftLepeltje() { return melk || suiker; }


	//---------------- code voor testen ------------------------------
    // afronden op 2 cijfers achter de komma is niet nodig:
	public static void _DEMO_warmeDrank() {
		WarmeDrank thee = new WarmeDrank(true, false, true);
		System.out.println(thee);
		String bes = thee.getOmschrijving();
		System.out.println(bes);

		WarmeDrank koffieZwart = new WarmeDrank(false, false, false);
		System.out.println(koffieZwart);

		WarmeDrank koffieMetMelk = new WarmeDrank(false, true, false);
		System.out.println(koffieMetMelk);

		// let op de "en" tussen melk en suiker!
		WarmeDrank koffieMetAlles = new WarmeDrank(false, true, true);
		System.out.println(koffieMetAlles);
	}
}
